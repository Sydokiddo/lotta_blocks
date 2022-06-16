package net.sydokiddo.lottablocks;

import com.google.common.collect.ImmutableMap;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.player.UseBlockCallback;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.minecraft.advancement.criterion.Criteria;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.util.ActionResult;
import net.sydokiddo.lottablocks.block.ModBlocks;
import net.sydokiddo.lottablocks.sound.ModSoundEvents;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Objects;

public class LottaBlocks implements ModInitializer {

	public static final Logger LOGGER = LoggerFactory.getLogger("modid");

	public static final String MOD_ID = "lottablocks";

	public static final ImmutableMap<Block, Block> GLOW_INK_SAC_APPLYING = ImmutableMap.<Block, Block>builder()
			.put(Blocks.GLASS, ModBlocks.GLOW_GLASS)
			.build();

	@Override
	public void onInitialize() {

		// Registry:

		ModBlocks.registerModBlocks();
		ModSoundEvents.registerSounds();

		LOGGER.info("Thank you for downloading Lotta Blocks! :)");

		// Flammable Block Registry:

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BAMBOO_THATCH, 60, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BAMBOO_THATCH_SLAB, 60, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BAMBOO_THATCH_STAIRS, 60, 20);

		// Glow Ink Sac Applying:

		UseBlockCallback.EVENT.register((player, world, hand, hitresult) -> {
			if (player.getStackInHand(hand).getItem() == Items.GLOW_INK_SAC) {

				var pos = hitresult.getBlockPos();
				var block = world.getBlockState(pos);

				if (block.isOf(Blocks.GLASS) || block.isOf(Blocks.GLASS_PANE)) {

					var glow = GLOW_INK_SAC_APPLYING.get(block.getBlock());
					if(glow != null) {

						// Change Block to Glowing Version

						world.setBlockState(pos, Objects.requireNonNull(GLOW_INK_SAC_APPLYING.get(block.getBlock())).getDefaultState());

						// Particles and Sound Event

						world.playSound(null, pos, SoundEvents.ITEM_GLOW_INK_SAC_USE, SoundCategory.BLOCKS, 1f, 0.8f);
						world.syncWorldEvent(player, 3005, pos, 1);

						// Stats and Advancements

						ItemStack heldItem = player.getStackInHand(hand);
						Item item = heldItem.getItem();
						player.incrementStat(Stats.USED.getOrCreateStat(item));
						if (player instanceof ServerPlayerEntity) {
							Criteria.ITEM_USED_ON_BLOCK.trigger((ServerPlayerEntity)player, pos, heldItem);
						}

						// Remove 1 Glow Ink Sac if the player is not in Creative Mode

						if(!player.isCreative()) {
							heldItem.decrement(1);
						}

						return ActionResult.SUCCESS;
					} else {
						return ActionResult.PASS;
					}
				}
			} else {
				return ActionResult.PASS;
			}

			return ActionResult.PASS;
		});
	}
}