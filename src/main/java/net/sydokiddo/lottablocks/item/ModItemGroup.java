package net.sydokiddo.lottablocks.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.sydokiddo.lottablocks.LottaBlocks;
import net.sydokiddo.lottablocks.block.ModBlocks;

public class ModItemGroup {
    public static final ItemGroup LOTTA_BLOCKS = FabricItemGroupBuilder.build(new Identifier(LottaBlocks.MOD_ID, "lottablocks"),
            () -> new ItemStack(ModBlocks.AMETHYST_BRICKS));
}
