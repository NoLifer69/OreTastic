package net.zeropercent.oretastic.entity.client;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.zeropercent.oretastic.entity.animation.ModAnimations;
import net.zeropercent.oretastic.entity.custom.IceGoblinEntity;
import net.zeropercent.oretastic.entity.custom.StoneVillagerEntity;

// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class IceGoblinModel<T extends IceGoblinEntity> extends SinglePartEntityModel<T> {
	private final ModelPart ice_goblin;
	private final ModelPart head;
	public IceGoblinModel(ModelPart root) {
		this.ice_goblin = root.getChild("ice_goblin");
		this.head = ice_goblin.getChild("Head");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData ice_goblin = modelPartData.addChild("ice_goblin", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData waist = ice_goblin.addChild("waist", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -12.0F, 0.0F));

		ModelPartData Body = waist.addChild("Body", ModelPartBuilder.create().uv(16, 16).cuboid(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -12.0F, 0.0F));

		ModelPartData LeftLeg = ice_goblin.addChild("LeftLeg", ModelPartBuilder.create(), ModelTransform.of(2.0F, -12.0F, 0.0F, -0.1745F, 0.0F, -0.0349F));

		ModelPartData LeftLeg_r1 = LeftLeg.addChild("LeftLeg_r1", ModelPartBuilder.create().uv(0, 16).mirrored().cuboid(1.0F, -12.0F, 1.0F, 2.0F, 12.0F, 2.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-2.0F, 12.0F, 0.0F, 0.1745F, 0.0F, 0.0436F));

		ModelPartData LeftArm = ice_goblin.addChild("LeftArm", ModelPartBuilder.create(), ModelTransform.of(5.0F, -22.0F, 0.0F, 0.2094F, 0.0F, 0.0F));

		ModelPartData LeftArm_r1 = LeftArm.addChild("LeftArm_r1", ModelPartBuilder.create().uv(40, 16).mirrored().cuboid(4.0F, -23.0F, -6.0F, 2.0F, 12.0F, 2.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-5.0F, 22.0F, 0.0F, -0.2182F, 0.0F, 0.0F));

		ModelPartData leftItem = LeftArm.addChild("leftItem", ModelPartBuilder.create(), ModelTransform.pivot(1.0F, 7.0F, 1.0F));

		ModelPartData RightLeg = ice_goblin.addChild("RightLeg", ModelPartBuilder.create(), ModelTransform.of(-2.0F, -12.0F, 0.0F, 0.192F, 0.0F, 0.0349F));

		ModelPartData RightLeg_r1 = RightLeg.addChild("RightLeg_r1", ModelPartBuilder.create().uv(0, 16).cuboid(-3.0F, -12.0F, -3.0F, 2.0F, 12.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(2.0F, 12.0F, 0.0F, -0.1745F, 0.0F, -0.0436F));

		ModelPartData RightArm = ice_goblin.addChild("RightArm", ModelPartBuilder.create(), ModelTransform.of(-5.0F, -22.0F, 0.0F, -0.1745F, 0.0F, 0.0F));

		ModelPartData RightArm_r1 = RightArm.addChild("RightArm_r1", ModelPartBuilder.create().uv(40, 16).cuboid(-6.0F, -23.0F, 3.0F, 2.0F, 12.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(5.0F, 22.0F, 0.0F, 0.1745F, 0.0F, 0.0F));

		ModelPartData Head = ice_goblin.addChild("Head", ModelPartBuilder.create(), ModelTransform.of(0.0F, -24.0F, 0.0F, -0.1047F, 0.0873F, 0.0F));

		ModelPartData Head_r1 = Head.addChild("Head_r1", ModelPartBuilder.create().uv(0, 0).cuboid(-4.0F, -32.0F, -1.0F, 8.0F, 8.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 24.0F, 0.0F, 0.1048F, -0.0434F, -0.0046F));

		ModelPartData icycle_r1 = Head.addChild("icycle_r1", ModelPartBuilder.create().uv(56, 0).cuboid(-1.0F, -34.0F, -14.0F, 2.0F, 6.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 24.0F, 0.0F, -0.5236F, 0.0F, 0.0F));
		return TexturedModelData.of(modelData, 64, 32);
	}
	@Override
	public void setAngles(IceGoblinEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.getPart().traverse().forEach(ModelPart::resetTransform);
		this.setHeadAngles(netHeadYaw, headPitch);

		this.animateMovement(ModAnimations.ICE_GOBLIN_WALK, limbSwing, limbSwingAmount, 2f, 2f);
		this.updateAnimation(entity.idleAnimationState, ModAnimations.ICE_GOBLIN_IDLE, ageInTicks, 1f);
	}

	private void setHeadAngles(float headYaw, float headPitch) {
		headYaw = MathHelper.clamp(headYaw, -0, 0);
		headPitch = MathHelper.clamp(headPitch, -0f, 0);

		this.head.yaw = headYaw * 0.017453292F;
		this.head.pitch = headPitch * 0.017453292F;
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		ice_goblin.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart getPart() {
		return ice_goblin;
	}
}