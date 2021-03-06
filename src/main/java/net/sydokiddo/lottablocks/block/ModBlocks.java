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
import net.sydokiddo.lottablocks.block.custom_blocks.*;
import net.sydokiddo.lottablocks.item.ModItemGroup;
import net.sydokiddo.lottablocks.sound.ModSoundEvents;

public class ModBlocks {

// List of Blocks:

    public static final Block AMETHYST_BRICKS = registerBlock("amethyst_bricks",
    new AmethystBricksBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK)
    .mapColor(MapColor.PURPLE).requiresTool().sounds(ModSoundEvents.AMETHYST_BRICKS)));

    public static final Block AMETHYST_BRICK_STAIRS = registerBlock("amethyst_brick_stairs",
    new AmethystBrickStairsBlock(ModBlocks.AMETHYST_BRICKS.getDefaultState(),
    FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK)
    .mapColor(MapColor.PURPLE).requiresTool().sounds(ModSoundEvents.AMETHYST_BRICKS)));

    public static final Block AMETHYST_BRICK_SLAB = registerBlock("amethyst_brick_slab",
    new AmethystBrickSlabBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK)
    .mapColor(MapColor.PURPLE).requiresTool().sounds(ModSoundEvents.AMETHYST_BRICKS)));

    public static final Block AMETHYST_BRICK_WALL = registerBlock("amethyst_brick_wall",
    new AmethystBrickWallBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK)
    .mapColor(MapColor.PURPLE).requiresTool().sounds(ModSoundEvents.AMETHYST_BRICKS)));

    public static final Block AMETHYST_PILLAR = registerBlock("amethyst_pillar",
    new AmethystPillarBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK)
    .mapColor(MapColor.PURPLE).requiresTool().sounds(ModSoundEvents.AMETHYST_BRICKS)));

    public static final Block CHISELED_AMETHYST = registerBlock("chiseled_amethyst",
    new AmethystBricksBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK)
    .mapColor(MapColor.PURPLE).requiresTool().sounds(ModSoundEvents.AMETHYST_BRICKS)));

    public static final Block AMETHYST_FLOODLIGHT = registerBlock("amethyst_floodlight",
    new AmethystFloodlightBlock(FabricBlockSettings.of(Material.DECORATION, MapColor.BLACK)
    .nonOpaque().sounds(BlockSoundGroup.LANTERN).luminance(15).strength(3.5f)));

    public static final Block DRIPSTONE_BRICKS = registerBlock("dripstone_bricks",
    new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)
    .mapColor(MapColor.BROWN).requiresTool().sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));

    public static final Block DRIPSTONE_BRICK_STAIRS = registerBlock("dripstone_brick_stairs",
    new ModStairsBlock(ModBlocks.DRIPSTONE_BRICKS.getDefaultState(),
    FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)
    .mapColor(MapColor.BROWN).requiresTool().sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));

    public static final Block DRIPSTONE_BRICK_SLAB = registerBlock("dripstone_brick_slab",
    new SlabBlock(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)
    .mapColor(MapColor.BROWN).requiresTool().sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));

    public static final Block DRIPSTONE_BRICK_WALL = registerBlock("dripstone_brick_wall",
    new WallBlock(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)
    .mapColor(MapColor.BROWN).requiresTool().sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));

    public static final Block DRIPSTONE_SHINGLES = registerBlock("dripstone_shingles",
    new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)
    .mapColor(MapColor.BROWN).requiresTool().sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));

    public static final Block DRIPSTONE_SHINGLE_STAIRS = registerBlock("dripstone_shingle_stairs",
    new ModStairsBlock(ModBlocks.DRIPSTONE_SHINGLES.getDefaultState(),
    FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)
    .mapColor(MapColor.BROWN).requiresTool().sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));

    public static final Block DRIPSTONE_SHINGLE_SLAB = registerBlock("dripstone_shingle_slab",
    new SlabBlock(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)
    .mapColor(MapColor.BROWN).requiresTool().sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));

    public static final Block DRIPSTONE_SHINGLE_WALL = registerBlock("dripstone_shingle_wall",
    new WallBlock(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)
    .mapColor(MapColor.BROWN).requiresTool().sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));

    public static final Block CALCITE_BRICKS = registerBlock("calcite_bricks",
    new Block(FabricBlockSettings.copyOf(Blocks.CALCITE)
    .mapColor(MapColor.TERRACOTTA_WHITE).requiresTool().sounds(BlockSoundGroup.CALCITE)));

    public static final Block CALCITE_BRICK_STAIRS = registerBlock("calcite_brick_stairs",
    new ModStairsBlock(ModBlocks.CALCITE_BRICKS.getDefaultState(),
    FabricBlockSettings.copyOf(Blocks.CALCITE)
    .mapColor(MapColor.TERRACOTTA_WHITE).requiresTool().sounds(BlockSoundGroup.CALCITE)));

    public static final Block CALCITE_BRICK_SLAB = registerBlock("calcite_brick_slab",
    new SlabBlock(FabricBlockSettings.copyOf(Blocks.CALCITE)
    .mapColor(MapColor.TERRACOTTA_WHITE).requiresTool().sounds(BlockSoundGroup.CALCITE)));

    public static final Block CALCITE_BRICK_WALL = registerBlock("calcite_brick_wall",
    new WallBlock(FabricBlockSettings.copyOf(Blocks.CALCITE)
    .mapColor(MapColor.TERRACOTTA_WHITE).requiresTool().sounds(BlockSoundGroup.CALCITE)));

    public static final Block CAST_IRON_BLOCK = registerBlock("cast_iron_block",
    new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)
    .mapColor(MapColor.BLACK).requiresTool().sounds(BlockSoundGroup.NETHERITE)));

    public static final Block CUT_CAST_IRON = registerBlock("cut_cast_iron",
    new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)
    .mapColor(MapColor.BLACK).requiresTool().sounds(BlockSoundGroup.NETHERITE)));

    public static final Block CUT_CAST_IRON_STAIRS = registerBlock("cut_cast_iron_stairs",
    new ModStairsBlock(ModBlocks.CUT_CAST_IRON.getDefaultState(),
    FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)
    .mapColor(MapColor.BLACK).requiresTool().sounds(BlockSoundGroup.NETHERITE)));

    public static final Block CUT_CAST_IRON_SLAB = registerBlock("cut_cast_iron_slab",
    new SlabBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)
    .mapColor(MapColor.BLACK).requiresTool().sounds(BlockSoundGroup.NETHERITE)));

    public static final Block CAST_IRON_DOOR = registerBlock("cast_iron_door",
    new DoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_DOOR)
    .mapColor(MapColor.BLACK).requiresTool().sounds(BlockSoundGroup.NETHERITE)));

    public static final Block CAST_IRON_TRAPDOOR = registerBlock("cast_iron_trapdoor",
    new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_TRAPDOOR)
    .mapColor(MapColor.BLACK).requiresTool().sounds(BlockSoundGroup.NETHERITE)));

    public static final Block TUFF_BRICKS = registerBlock("tuff_bricks",
    new Block(FabricBlockSettings.copyOf(Blocks.TUFF)
    .mapColor(MapColor.TERRACOTTA_GRAY).requiresTool().sounds(ModSoundEvents.TUFF_BRICKS)));

    public static final Block TUFF_BRICK_STAIRS = registerBlock("tuff_brick_stairs",
    new ModStairsBlock(ModBlocks.TUFF_BRICKS.getDefaultState(),
    FabricBlockSettings.copyOf(Blocks.TUFF)
    .mapColor(MapColor.TERRACOTTA_GRAY).requiresTool().sounds(ModSoundEvents.TUFF_BRICKS)));

    public static final Block TUFF_BRICK_SLAB = registerBlock("tuff_brick_slab",
    new SlabBlock(FabricBlockSettings.copyOf(Blocks.TUFF)
    .mapColor(MapColor.TERRACOTTA_GRAY).requiresTool().sounds(ModSoundEvents.TUFF_BRICKS)));

    public static final Block TUFF_BRICK_WALL = registerBlock("tuff_brick_wall",
    new WallBlock(FabricBlockSettings.copyOf(Blocks.TUFF)
    .mapColor(MapColor.TERRACOTTA_GRAY).requiresTool().sounds(ModSoundEvents.TUFF_BRICKS)));

    public static final Block LANTERN_BLOCK = registerBlock("lantern_block",
    new Block(FabricBlockSettings.of(Material.REDSTONE_LAMP, MapColor.BLACK)
    .sounds(BlockSoundGroup.LANTERN).luminance(15).requiresTool().hardness(3.5f).strength(3.5f)));

    public static final Block SOUL_LANTERN_BLOCK = registerBlock("soul_lantern_block",
    new Block(FabricBlockSettings.of(Material.REDSTONE_LAMP, MapColor.BLACK)
    .sounds(BlockSoundGroup.LANTERN).luminance(10).requiresTool().hardness(3.5f).strength(3.5f)));

    public static final Block LAVA_LAMP = registerBlock("lava_lamp",
    new LavaLampBlock(FabricBlockSettings.of(Material.REDSTONE_LAMP, MapColor.GOLD)
    .sounds(ModSoundEvents.LAVA_LAMP).luminance(15).requiresTool().hardness(3.5f).strength(3.5f)));

    public static final Block REINFORCED_GLASS = registerBlock("reinforced_glass",
    new ModGlassBlock(FabricBlockSettings.copyOf(Blocks.OBSIDIAN)
    .nonOpaque().mapColor(MapColor.BLACK).requiresTool().sounds(BlockSoundGroup.GLASS)));

    public static final Block OBSIDIAN_BRICKS = registerBlock("obsidian_bricks",
    new Block(FabricBlockSettings.copyOf(Blocks.OBSIDIAN)
    .mapColor(MapColor.BLACK).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block OBSIDIAN_BRICK_STAIRS = registerBlock("obsidian_brick_stairs",
    new ModStairsBlock(ModBlocks.OBSIDIAN_BRICKS.getDefaultState(),
    FabricBlockSettings.copyOf(Blocks.OBSIDIAN)
    .mapColor(MapColor.BLACK).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block OBSIDIAN_BRICK_SLAB = registerBlock("obsidian_brick_slab",
    new SlabBlock(FabricBlockSettings.copyOf(Blocks.OBSIDIAN)
    .mapColor(MapColor.BLACK).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block OBSIDIAN_BRICK_WALL = registerBlock("obsidian_brick_wall",
    new WallBlock(FabricBlockSettings.copyOf(Blocks.OBSIDIAN)
    .mapColor(MapColor.BLACK).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block OBSIDIAN_PILLAR = registerBlock("obsidian_pillar",
    new ModPillarBlock(FabricBlockSettings.copyOf(Blocks.OBSIDIAN)
    .mapColor(MapColor.BLACK).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block SOUL_GLASS = registerBlock("soul_glass",
    new SoulGlassBlock(FabricBlockSettings.of(Material.GLASS, MapColor.BROWN)
    .nonOpaque().sounds(BlockSoundGroup.GLASS).hardness(0.3f).strength(0.3f)));

    public static final Block GLOW_GLASS = registerBlock("glow_glass",
    new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS)
    .nonOpaque().mapColor(MapColor.CLEAR).sounds(BlockSoundGroup.GLASS)
    .luminance(5).emissiveLighting((state, world, pos) -> true)));

    public static final Block BAMBOO_THATCH = registerBlock("bamboo_thatch",
    new BambooThatchBlock(FabricBlockSettings.of(Material.SOLID_ORGANIC, MapColor.PALE_YELLOW)
    .sounds(BlockSoundGroup.SCAFFOLDING).strength(0.8f)));

    public static final Block BAMBOO_THATCH_STAIRS = registerBlock("bamboo_thatch_stairs",
    new ModStairsBlock(ModBlocks.BAMBOO_THATCH.getDefaultState(),
    FabricBlockSettings.copyOf(ModBlocks.BAMBOO_THATCH)
    .mapColor(MapColor.PALE_YELLOW).sounds(BlockSoundGroup.SCAFFOLDING)));

    public static final Block BAMBOO_THATCH_SLAB = registerBlock("bamboo_thatch_slab",
    new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.BAMBOO_THATCH)
    .mapColor(MapColor.PALE_YELLOW).sounds(BlockSoundGroup.SCAFFOLDING)));

    public static final Block HONEYLAMP = registerBlock("honeylamp",
    new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT, MapColor.ORANGE)
    .sounds(BlockSoundGroup.CORAL).luminance(15).strength(0.6F)));

    public static final Block SUNRISE_PAPER_LANTERN = registerBlock("sunrise_paper_lantern",
    new PaperLanternBlock(FabricBlockSettings.of(Material.SOLID_ORGANIC, MapColor.YELLOW)
    .sounds(ModSoundEvents.PAPER_LANTERN).luminance(15).strength(0.2f)));

    public static final Block TWILIGHT_PAPER_LANTERN = registerBlock("twilight_paper_lantern",
    new PaperLanternBlock(FabricBlockSettings.of(Material.SOLID_ORGANIC, MapColor.BLUE)
    .sounds(ModSoundEvents.PAPER_LANTERN).luminance(15).strength(0.2f)));

    public static final Block BLOOMING_PAPER_LANTERN = registerBlock("blooming_paper_lantern",
    new PaperLanternBlock(FabricBlockSettings.of(Material.SOLID_ORGANIC, MapColor.PINK)
    .sounds(ModSoundEvents.PAPER_LANTERN).luminance(15).strength(0.2f)));

    public static final Block BLUE_NETHER_BRICKS = registerBlock("blue_nether_bricks",
    new Block(FabricBlockSettings.copyOf(Blocks.RED_NETHER_BRICKS)
    .mapColor(MapColor.CYAN).requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block BLUE_NETHER_BRICK_STAIRS = registerBlock("blue_nether_brick_stairs",
    new ModStairsBlock(ModBlocks.BLUE_NETHER_BRICKS.getDefaultState(),
    FabricBlockSettings.copyOf(Blocks.RED_NETHER_BRICK_STAIRS)
    .mapColor(MapColor.CYAN).requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block BLUE_NETHER_BRICK_SLAB = registerBlock("blue_nether_brick_slab",
    new SlabBlock(FabricBlockSettings.copyOf(Blocks.RED_NETHER_BRICK_SLAB)
    .mapColor(MapColor.CYAN).requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block BLUE_NETHER_BRICK_WALL = registerBlock("blue_nether_brick_wall",
    new WallBlock(FabricBlockSettings.copyOf(Blocks.RED_NETHER_BRICK_WALL)
    .mapColor(MapColor.CYAN).requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block CHISELED_BLUE_NETHER_BRICKS = registerBlock("chiseled_blue_nether_bricks",
    new Block(FabricBlockSettings.copyOf(Blocks.CHISELED_NETHER_BRICKS)
    .mapColor(MapColor.CYAN).requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block CHISELED_RED_NETHER_BRICKS = registerBlock("chiseled_red_nether_bricks",
    new Block(FabricBlockSettings.copyOf(Blocks.CHISELED_NETHER_BRICKS)
    .mapColor(MapColor.DARK_RED).requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

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