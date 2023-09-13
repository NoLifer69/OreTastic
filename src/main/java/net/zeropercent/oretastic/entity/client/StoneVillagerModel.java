package net.zeropercent.oretastic.entity.client;

import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import net.zeropercent.oretastic.OreTastic;
import net.zeropercent.oretastic.entity.custom.StoneVillagerEntity;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

public class StoneVillagerModel extends GeoModel<StoneVillagerEntity> {

    @Override
    public Identifier getModelResource(StoneVillagerEntity animatable) {
        return new Identifier(OreTastic.MOD_ID, "geo/stone_villager.geo.json");
    }

    @Override
    public Identifier getTextureResource(StoneVillagerEntity animatable) {
        return new Identifier(OreTastic.MOD_ID, "textures/entity/stone_villager.png");
    }

    @Override
    public Identifier getAnimationResource(StoneVillagerEntity animatable) {
        return new Identifier(OreTastic.MOD_ID, "animations/stone_villager.animation.json");
    }

    @Override
    public void setCustomAnimations(StoneVillagerEntity animatable, long instanceId, AnimationState<StoneVillagerEntity> animationState) {
        CoreGeoBone head = getAnimationProcessor().getBone("head");

        if (head != null) {
            EntityModelData entityData = animationState.getData(DataTickets.ENTITY_MODEL_DATA);
            head.setRotX(entityData.headPitch() * MathHelper.RADIANS_PER_DEGREE);
            head.setRotY(entityData.headPitch() * MathHelper.RADIANS_PER_DEGREE);
        }
    }
}
