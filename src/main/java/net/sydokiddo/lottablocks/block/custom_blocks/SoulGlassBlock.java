package net.sydokiddo.lottablocks.block.custom_blocks;

import net.minecraft.block.AbstractGlassBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.EntityShapeContext;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.FallingBlockEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.random.AbstractRandom;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

import java.util.Random;

public class SoulGlassBlock extends AbstractGlassBlock {
    private static final VoxelShape FALLING_SHAPE = VoxelShapes.cuboid(0.0D, 0.0D, 0.0D, 1.0D, 0.8999999761581421D, 1.0D);

    public SoulGlassBlock(Settings settings) {
        super(settings);
    }

    public boolean isSideInvisible(BlockState state, BlockState stateFrom, Direction direction) {
        return stateFrom.isOf(this) || super.isSideInvisible(state, stateFrom, direction);
    }

    public VoxelShape getCullingShape(BlockState state, BlockView world, BlockPos pos) {
        return VoxelShapes.empty();
    }

    public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        if (entity == null || entity.getBlockStateAtPos().isOf(this)) {
            if (world.isClient) {
                Random random = (Random) world.getRandom();
                assert entity != null;
                boolean bl = entity.lastRenderX != entity.getX() || entity.lastRenderZ != entity.getZ();
                if (bl && random.nextBoolean()) {
                    world.addParticle(ParticleTypes.SOUL, entity.getX(), (double)(pos.getY() + 1), entity.getZ(), (double)(MathHelper.nextBetween((AbstractRandom) random, -1.0F, 1.0F) * 0.083333336F), 0.05000000074505806D, (double)(MathHelper.nextBetween((AbstractRandom) random, -1.0F, 1.0F) * 0.083333336F));
                    entity.playSound(SoundEvents.PARTICLE_SOUL_ESCAPE, 1, 1);
                }
            }
        }
    }

    public void onLandedUpon(World world, BlockState state, BlockPos pos, Entity entity, float fallDistance) {
        if (!((double)fallDistance < 4.0D) && entity instanceof LivingEntity livingEntity) {
            LivingEntity.FallSounds fallSounds = livingEntity.getFallSounds();
            SoundEvent soundEvent = (double)fallDistance < 7.0D ? fallSounds.small() : fallSounds.big();
            entity.playSound(soundEvent, 1.0F, 1.0F);
        }
    }

    public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        if (context instanceof EntityShapeContext entityShapeContext) {
            Entity entity = entityShapeContext.getEntity();
            if (entity != null) {
                if (entity.fallDistance > 2.5F) {
                    return FALLING_SHAPE;
                }

                boolean bl = entity instanceof FallingBlockEntity;
                if (bl || SoulGlassBlocksMovement(entity) && context.isAbove(VoxelShapes.fullCube(), pos, false) && !context.isDescending()) {
                    return super.getCollisionShape(state, world, pos, context);
                }
            }
        }

        return VoxelShapes.empty();
    }

    public VoxelShape getCameraCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return VoxelShapes.empty();
    }

    public static boolean SoulGlassBlocksMovement(Entity entity) {
        if (entity.isSneaking()) {
            return false;
        } else {
            return true;
        }
    }

    public boolean canPathfindThrough(BlockState state, BlockView world, BlockPos pos, NavigationType type) {
        return false;
    }
}