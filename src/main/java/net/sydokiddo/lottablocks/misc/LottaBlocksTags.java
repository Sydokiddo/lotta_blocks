package net.sydokiddo.lottablocks.misc;

import net.minecraft.block.Block;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class LottaBlocksTags {
    public static final TagKey<Block> NETHER_PORTAL_ACTIVATING = TagKey.of(Registry.BLOCK_KEY, new Identifier("odyssey", "nether_portal_activating"));
}