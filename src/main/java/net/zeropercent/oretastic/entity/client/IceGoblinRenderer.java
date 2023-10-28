package net.zeropercent.oretastic.entity.client;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;
import net.zeropercent.oretastic.OreTastic;
import net.zeropercent.oretastic.entity.custom.IceGoblinEntity;

public class IceGoblinRenderer extends MobEntityRenderer<IceGoblinEntity, IceGoblinModel<IceGoblinEntity>> {
    private static final Identifier TEXTURE = new Identifier(OreTastic.MOD_ID, "textures/entity/ice_goblin.png");

    public IceGoblinRenderer(EntityRendererFactory.Context context) {
        super(context, new IceGoblinModel<>(context.getPart(ModModelLayers.ICE_GOBLIN)), 0.6f);
    }

    @Override
    public Identifier getTexture(IceGoblinEntity entity) {
        return TEXTURE;
    }
}
