package net.sydokiddo.lottablocks.sound;

import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.sydokiddo.lottablocks.LottaBlocks;

public class ModSoundEvents {

// Sound Registry:

// Sound Groups:

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(LottaBlocks.MOD_ID, name);
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
    }

    public static void registerSounds() {
        System.out.println("Registering Sounds for " + LottaBlocks.MOD_ID);
    }
}
