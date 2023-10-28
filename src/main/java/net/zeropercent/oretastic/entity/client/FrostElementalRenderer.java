package net.zeropercent.oretastic.entity.client;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;
import net.zeropercent.oretastic.OreTastic;
import net.zeropercent.oretastic.entity.custom.FrostElementalEntity;

public class FrostElementalRenderer extends MobEntityRenderer<FrostElementalEntity, FrostElementalModel<FrostElementalEntity>> {
    private static final Identifier TEXTURE = new Identifier(OreTastic.MOD_ID, "textures/entity/frost_elemental.png");

    public FrostElementalRenderer(EntityRendererFactory.Context context) {
        super(context, new FrostElementalModel<>(context.getPart(ModModelLayers.FROST_ELEMENTAL)), 0.6f);
    }

    @Override
    public Identifier getTexture(FrostElementalEntity entity) {
        return TEXTURE;
    }
}
