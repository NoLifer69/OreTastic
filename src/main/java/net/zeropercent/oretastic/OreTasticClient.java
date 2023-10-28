package net.zeropercent.oretastic;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.RenderLayer;
import net.zeropercent.oretastic.block.ModBlocks;
import net.zeropercent.oretastic.entity.ModEntities;
import net.zeropercent.oretastic.entity.client.*;
import net.zeropercent.oretastic.fluid.ModFluids;

public class OreTasticClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.FROST_ELEMENTAL, FrostElementalModel::getTexturedModelData);
        EntityRendererRegistry.register(ModEntities.FROST_ELEMENTAL, FrostElementalRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.STONE_VILLAGER, StoneVillagerModel::getTexturedModelData);
        EntityRendererRegistry.register(ModEntities.STONE_VILLAGER, StoneVillagerRenderer::new);
        //EntityModelLayerRegistry.registerModelLayer(ModModelLayers.ICE_GOBLIN, IceGoblinModel::getTexturedModelData);
        //EntityRendererRegistry.register(ModEntities.ICE_GOBLIN, IceGoblinRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.PORCUPINE, PorcupineModel::getTexturedModelData);
        EntityRendererRegistry.register(ModEntities.PORCUPINE, PorcupineRenderer::new);

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PALM_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PALM_SAPLING, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PALM_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PALM_TRAPDOOR, RenderLayer.getCutout());

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.OIL_STILL,
                new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL,
                        SimpleFluidRenderHandler.WATER_FLOWING,
                        SimpleFluidRenderHandler.WATER_OVERLAY, 2));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.OIL_FLOWING,
                new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL,
                        SimpleFluidRenderHandler.WATER_FLOWING,
                        SimpleFluidRenderHandler.WATER_OVERLAY, 2));
    }
}
