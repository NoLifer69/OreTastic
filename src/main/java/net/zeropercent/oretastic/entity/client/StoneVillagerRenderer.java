package net.zeropercent.oretastic.entity.client;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;
import net.zeropercent.oretastic.OreTastic;
import net.zeropercent.oretastic.entity.custom.FrostElementalEntity;
import net.zeropercent.oretastic.entity.custom.StoneVillagerEntity;

public class StoneVillagerRenderer extends MobEntityRenderer<StoneVillagerEntity, StoneVillagerModel<StoneVillagerEntity>> {
    private static final Identifier TEXTURE = new Identifier(OreTastic.MOD_ID, "textures/entity/stone_villager.png");

    public StoneVillagerRenderer(EntityRendererFactory.Context context) {
        super(context, new StoneVillagerModel<>(context.getPart(ModModelLayers.STONE_VILLAGER)), 0.6f);
    }

    @Override
    public Identifier getTexture(StoneVillagerEntity entity) {
        return TEXTURE;
    }
}
