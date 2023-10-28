package net.zeropercent.oretastic.entity.client;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.MathHelper;
import net.zeropercent.oretastic.entity.animation.ModAnimations;
import net.zeropercent.oretastic.entity.custom.FrostElementalEntity;
import net.zeropercent.oretastic.entity.custom.StoneVillagerEntity;

// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class StoneVillagerModel<T extends StoneVillagerEntity> extends SinglePartEntityModel<T> {
	private final ModelPart body;
	private final ModelPart head;
	private final ModelPart nose;
	private final ModelPart arms;
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;
	public StoneVillagerModel(ModelPart root) {
		this.body = root.getChild("body");
		this.head = body.getChild("head");
		this.nose = head.getChild("nose");
		this.arms = body.getChild("arms");
		this.RightLeg = body.getChild("RightLeg");
		this.LeftLeg = body.getChild("LeftLeg");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData body = modelPartData.addChild("body", ModelPartBuilder.create().uv(16, 20).cuboid(-4.0F, -24.0F, -3.0F, 8.0F, 12.0F, 6.0F, new Dilation(0.0F))
		.uv(0, 38).cuboid(-4.0F, -24.0F, -3.0F, 8.0F, 18.0F, 6.0F, new Dilation(0.5F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData head = body.addChild("head", ModelPartBuilder.create().uv(0, 0).cuboid(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -24.0F, 0.0F));

		ModelPartData nose = head.addChild("nose", ModelPartBuilder.create().uv(24, 0).cuboid(-1.0F, -1.0F, -6.0F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -2.0F, 0.0F));

		ModelPartData arms = body.addChild("arms", ModelPartBuilder.create().uv(40, 38).cuboid(-4.0F, 2.0F, -2.0F, 8.0F, 4.0F, 4.0F, new Dilation(0.0F))
		.uv(44, 22).cuboid(-8.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F, new Dilation(0.0F))
		.uv(44, 22).mirrored().cuboid(4.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(0.0F, -22.0F, 0.0F, -0.7854F, 0.0F, 0.0F));

		ModelPartData RightLeg = body.addChild("RightLeg", ModelPartBuilder.create().uv(0, 22).cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -12.0F, 0.0F, 0.192F, 0.0F, 0.0349F));

		ModelPartData LeftLeg = body.addChild("LeftLeg", ModelPartBuilder.create().uv(0, 22).mirrored().cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(2.0F, -12.0F, 0.0F, -0.1745F, 0.0F, -0.0349F));
		return TexturedModelData.of(modelData, 64, 64);
	}
	@Override
	public void setAngles(StoneVillagerEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.getPart().traverse().forEach(ModelPart::resetTransform);
		this.setHeadAngles(netHeadYaw, headPitch);

		this.animateMovement(ModAnimations.STONE_VILLAGER_WALK, limbSwing, limbSwingAmount, 2f, 2f);
		this.updateAnimation(entity.idleAnimationState, ModAnimations.STONE_VILLAGER_IDLE, ageInTicks, 1f);
	}

	private void setHeadAngles(float headYaw, float headPitch) {
		headYaw = MathHelper.clamp(headYaw, -0, 0);
		headPitch = MathHelper.clamp(headPitch, -0f, 0);

		this.head.yaw = headYaw * 0.017453292F;
		this.head.pitch = headPitch * 0.017453292F;
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		body.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart getPart() {
		return body;
	}
}