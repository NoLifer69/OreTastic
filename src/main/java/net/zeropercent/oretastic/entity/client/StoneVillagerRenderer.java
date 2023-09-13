package net.zeropercent.oretastic.entity.client;

import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.zeropercent.oretastic.OreTastic;
import net.zeropercent.oretastic.entity.custom.StoneVillagerEntity;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class StoneVillagerRenderer extends GeoEntityRenderer<StoneVillagerEntity> {
    public StoneVillagerRenderer(EntityRendererFactory.Context renderManager) {
        super(renderManager, new StoneVillagerModel());
    }

    @Override
    public Identifier getTexture(StoneVillagerEntity animatable) {
        return new Identifier(OreTastic.MOD_ID, "textures/entity/stone_villager.png");
    }

    @Override
    public void render(StoneVillagerEntity entity, float entityYaw, float partialTick, MatrixStack poseStack,
                       VertexConsumerProvider bufferSource, int packedLight) {
        if (entity.isBaby()) {
            poseStack.scale(0.4f, 0.4f, 0.4f);
        }
        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
