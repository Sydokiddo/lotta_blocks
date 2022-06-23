package net.sydokiddo.lottablocks.block.custom_blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.sydokiddo.lottablocks.sound.ModSoundEvents;

public class PaperLanternBlock extends Block {
    public PaperLanternBlock(Settings settings) {
        super(settings);
    }
    public void onProjectileHit(World world, BlockState state, BlockHitResult hit, ProjectileEntity projectile) {
        if (!world.isClient) {
            BlockPos blockPos = hit.getBlockPos();
            world.playSound(null, blockPos, ModSoundEvents.BLOCK_PAPER_LANTERN_BREAK, SoundCategory.BLOCKS, 1.0F, 1.0F + world.random.nextFloat() * 1.2F);
            world.breakBlock(blockPos, true);
        }
    }
}