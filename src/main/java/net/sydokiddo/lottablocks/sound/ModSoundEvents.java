package net.sydokiddo.lottablocks.sound;

import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.sydokiddo.lottablocks.LottaBlocks;

public class ModSoundEvents {

// Sound Registry:

// - Block Sounds:

    public static final SoundEvent BLOCK_AMETHYST_BRICKS_BREAK = registerSoundEvent("block.amethyst_bricks.break");
    public static final SoundEvent BLOCK_AMETHYST_BRICKS_STEP = registerSoundEvent("block.amethyst_bricks.step");
    public static final SoundEvent BLOCK_AMETHYST_BRICKS_PLACE = registerSoundEvent("block.amethyst_bricks.place");
    public static final SoundEvent BLOCK_AMETHYST_BRICKS_HIT = registerSoundEvent("block.amethyst_bricks.hit");
    public static final SoundEvent BLOCK_AMETHYST_BRICKS_FALL = registerSoundEvent("block.amethyst_bricks.fall");

    public static final SoundEvent BLOCK_TUFF_BRICKS_BREAK = registerSoundEvent("block.tuff_bricks.break");
    public static final SoundEvent BLOCK_TUFF_BRICKS_STEP = registerSoundEvent("block.tuff_bricks.step");
    public static final SoundEvent BLOCK_TUFF_BRICKS_PLACE = registerSoundEvent("block.tuff_bricks.place");
    public static final SoundEvent BLOCK_TUFF_BRICKS_HIT = registerSoundEvent("block.tuff_bricks.hit");
    public static final SoundEvent BLOCK_TUFF_BRICKS_FALL = registerSoundEvent("block.tuff_bricks.fall");

    public static final SoundEvent BLOCK_LAVA_LAMP_BREAK = registerSoundEvent("block.lava_lamp.break");
    public static final SoundEvent BLOCK_LAVA_LAMP_STEP = registerSoundEvent("block.lava_lamp.step");
    public static final SoundEvent BLOCK_LAVA_LAMP_PLACE = registerSoundEvent("block.lava_lamp.place");
    public static final SoundEvent BLOCK_LAVA_LAMP_HIT = registerSoundEvent("block.lava_lamp.hit");
    public static final SoundEvent BLOCK_LAVA_LAMP_FALL = registerSoundEvent("block.lava_lamp.fall");

    public static final SoundEvent BLOCK_PAPER_LANTERN_BREAK = registerSoundEvent("block.paper_lantern.break");
    public static final SoundEvent BLOCK_PAPER_LANTERN_STEP = registerSoundEvent("block.paper_lantern.step");
    public static final SoundEvent BLOCK_PAPER_LANTERN_PLACE = registerSoundEvent("block.paper_lantern.place");
    public static final SoundEvent BLOCK_PAPER_LANTERN_HIT = registerSoundEvent("block.paper_lantern.hit");
    public static final SoundEvent BLOCK_PAPER_LANTERN_FALL = registerSoundEvent("block.paper_lantern.fall");

// Sound Groups:

    public static final BlockSoundGroup AMETHYST_BRICKS = new BlockSoundGroup(1f, 1f,
    ModSoundEvents.BLOCK_AMETHYST_BRICKS_BREAK, ModSoundEvents.BLOCK_AMETHYST_BRICKS_STEP, ModSoundEvents.BLOCK_AMETHYST_BRICKS_PLACE,
    ModSoundEvents.BLOCK_AMETHYST_BRICKS_HIT, ModSoundEvents.BLOCK_AMETHYST_BRICKS_FALL);

    public static final BlockSoundGroup TUFF_BRICKS = new BlockSoundGroup(1f, 1f,
    ModSoundEvents.BLOCK_TUFF_BRICKS_BREAK, ModSoundEvents.BLOCK_TUFF_BRICKS_STEP, ModSoundEvents.BLOCK_TUFF_BRICKS_PLACE,
    ModSoundEvents.BLOCK_TUFF_BRICKS_HIT, ModSoundEvents.BLOCK_TUFF_BRICKS_FALL);

    public static final BlockSoundGroup LAVA_LAMP = new BlockSoundGroup(1f, 1f,
    ModSoundEvents.BLOCK_LAVA_LAMP_BREAK, ModSoundEvents.BLOCK_LAVA_LAMP_STEP, ModSoundEvents.BLOCK_LAVA_LAMP_PLACE,
    ModSoundEvents.BLOCK_LAVA_LAMP_HIT, ModSoundEvents.BLOCK_LAVA_LAMP_FALL);

    public static final BlockSoundGroup PAPER_LANTERN = new BlockSoundGroup(1f, 1f,
    ModSoundEvents.BLOCK_PAPER_LANTERN_BREAK, ModSoundEvents.BLOCK_PAPER_LANTERN_STEP, ModSoundEvents.BLOCK_PAPER_LANTERN_PLACE,
    ModSoundEvents.BLOCK_PAPER_LANTERN_HIT, ModSoundEvents.BLOCK_PAPER_LANTERN_FALL);

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(LottaBlocks.MOD_ID, name);
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
    }

    public static void registerSounds() {
        System.out.println("Registering Sounds for " + LottaBlocks.MOD_ID);
    }
}
