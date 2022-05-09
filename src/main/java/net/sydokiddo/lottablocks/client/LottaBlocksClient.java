package net.sydokiddo.lottablocks.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.sydokiddo.lottablocks.block.ModBlocks;

@net.fabricmc.api.Environment(net.fabricmc.api.EnvType.CLIENT)
public class LottaBlocksClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

        // Renders Blocks in List as Transparent (Without Translucency)

        BlockRenderLayerMap.INSTANCE.putBlocks(
                RenderLayer.getCutout()

        );

        // Renders Blocks in List as Transparent (With Translucency)

        BlockRenderLayerMap.INSTANCE.putBlocks(
                RenderLayer.getTranslucent(),

                ModBlocks.SOUL_GLASS

        );
    }
}