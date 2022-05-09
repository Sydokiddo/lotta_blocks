package net.sydokiddo.lottablocks.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.sydokiddo.lottablocks.LottaBlocks;
import net.sydokiddo.lottablocks.block.custom_blocks.ModStairsBlock;
import net.sydokiddo.lottablocks.item.ModItemGroup;

public class ModBlocks {

// List of Blocks:

    public static final Block AMETHYST_BRICKS = registerBlock("amethyst_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK)
            .mapColor(MapColor.PURPLE).sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    public static final Block AMETHYST_BRICK_STAIRS = registerBlock("amethyst_brick_stairs",
            new ModStairsBlock(ModBlocks.AMETHYST_BRICKS.getDefaultState(),
            FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK)
            .mapColor(MapColor.PURPLE).sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    public static final Block AMETHYST_BRICK_SLAB = registerBlock("amethyst_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK)
            .mapColor(MapColor.PURPLE).sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    public static final Block AMETHYST_BRICK_WALL = registerBlock("amethyst_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK)
            .mapColor(MapColor.PURPLE).sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    public static final Block DRIPSTONE_SHINGLES = registerBlock("dripstone_shingles",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)
                    .mapColor(MapColor.BROWN).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));

    public static final Block DRIPSTONE_SHINGLE_STAIRS = registerBlock("dripstone_shingle_stairs",
            new ModStairsBlock(ModBlocks.DRIPSTONE_SHINGLES.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)
                            .mapColor(MapColor.BROWN).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));

    public static final Block DRIPSTONE_SINGLE_SLAB = registerBlock("dripstone_shingle_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)
                    .mapColor(MapColor.BROWN).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));

    public static final Block DRIPSTONE_SHINGLE_WALL = registerBlock("dripstone_shingle_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)
                    .mapColor(MapColor.BROWN).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));

// Registry for Blocks:

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registry.BLOCK, new Identifier(LottaBlocks.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registry.ITEM, new Identifier(LottaBlocks.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(ModItemGroup.LOTTA_BLOCKS)));
    }

    public static void registerModBlocks() {
        System.out.println("Registering Blocks for " + LottaBlocks.MOD_ID);
    }

}