package net.zeropercent.oretastic.entity.client;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.zeropercent.oretastic.entity.animation.ModAnimations;
import net.zeropercent.oretastic.entity.custom.FrostElementalEntity;
public class FrostElementalModel<T extends FrostElementalEntity> extends SinglePartEntityModel<T> {
	private final ModelPart frost_elmental;
	private final ModelPart body;
	private final ModelPart torso;
	private final ModelPart head;
	private final ModelPart icycle_r1;
	private final ModelPart right_hand;
	private final ModelPart left_hand;
	private final ModelPart right_leg;
	private final ModelPart left_leg;
	public FrostElementalModel(ModelPart root) {
		this.frost_elmental = root.getChild("frost_elmental");
		this.body = frost_elmental.getChild("body");
		this.torso = body.getChild("torso");
		this.head = torso.getChild("head");
		this.icycle_r1 = torso.getChild("head");
		this.right_hand = torso.getChild("right_hand");
		this.left_hand = torso.getChild("left_hand");
		this.right_leg = body.getChild("right_leg");
		this.left_leg = body.getChild("left_leg");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData frost_elmental = modelPartData.addChild("frost_elmental", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData body = frost_elmental.addChild("body", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData torso = body.addChild("torso", ModelPartBuilder.create().uv(0, 0).cuboid(-8.0F, -27.0F, -4.0F, 22.0F, 27.0F, 9.0F, new Dilation(0.0F))
				.uv(0, 65).cuboid(-1.0F, -22.0F, 5.0F, 4.0F, 4.0F, 10.0F, new Dilation(0.0F))
				.uv(0, 65).cuboid(-6.0F, -23.0F, -14.0F, 4.0F, 4.0F, 10.0F, new Dilation(0.0F))
				.uv(0, 65).cuboid(1.0F, -19.0F, -14.0F, 4.0F, 4.0F, 10.0F, new Dilation(0.0F)), ModelTransform.pivot(-3.0F, -12.0F, 0.0F));

		ModelPartData head = torso.addChild("head", ModelPartBuilder.create().uv(54, 55).cuboid(-3.0F, -35.0F, -7.0F, 9.0F, 8.0F, 10.0F, new Dilation(0.0F)), ModelTransform.pivot(1.0F, 0.0F, 0.0F));

		ModelPartData icycle_r1 = head.addChild("icycle_r1", ModelPartBuilder.create().uv(0, 79).cuboid(0.0F, -40.0F, -12.0F, 4.0F, 10.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.3491F, 0.0F, 0.0F));

		ModelPartData right_hand = torso.addChild("right_hand", ModelPartBuilder.create().uv(0, 36).cuboid(-14.0F, -26.0F, -2.0F, 6.0F, 24.0F, 5.0F, new Dilation(0.0F))
				.uv(0, 65).cuboid(-13.0F, -18.0F, -11.0F, 4.0F, 4.0F, 10.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData left_hand = torso.addChild("left_hand", ModelPartBuilder.create().uv(0, 36).cuboid(14.0F, -26.0F, -2.0F, 6.0F, 24.0F, 5.0F, new Dilation(0.0F))
				.uv(0, 65).cuboid(9.0F, -22.0F, 3.0F, 4.0F, 4.0F, 10.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData right_leg = body.addChild("right_leg", ModelPartBuilder.create().uv(77, 14).cuboid(-8.0F, -12.0F, -2.0F, 7.0F, 12.0F, 5.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData left_leg = body.addChild("left_leg", ModelPartBuilder.create().uv(0, 65).cuboid(3.0F, -7.0F, -12.0F, 4.0F, 4.0F, 10.0F, new Dilation(0.0F))
				.uv(77, 14).cuboid(1.0F, -12.0F, -2.0F, 7.0F, 12.0F, 5.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
		return TexturedModelData.of(modelData, 128, 128);
	}
	@Override
	public void setAngles(FrostElementalEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.getPart().traverse().forEach(ModelPart::resetTransform);
		this.setHeadAngles(netHeadYaw, headPitch);

		this.animateMovement(ModAnimations.FROST_ELEMENTAL_WALK, limbSwing, limbSwingAmount, 2f, 2f);
		this.updateAnimation(entity.idleAnimationState, ModAnimations.FROST_ELEMENTAL_IDLE, ageInTicks, 1f);
		this.updateAnimation(entity.attackAnimationState, ModAnimations.FROST_ELEMENTAL_ATTACK1, ageInTicks, 1f);
	}

	private void setHeadAngles(float headYaw, float headPitch) {
		headYaw = MathHelper.clamp(headYaw, -0, 0);
		headPitch = MathHelper.clamp(headPitch, -0f, 0);

		this.head.yaw = headYaw * 0.017453292F;
		this.head.pitch = headPitch * 0.017453292F;
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		frost_elmental.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart getPart() {
		return  frost_elmental;
	}
}