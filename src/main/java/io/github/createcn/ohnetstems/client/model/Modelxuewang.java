package io.github.createcn.ohnetstems.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelxuewang<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("ohnetstems", "modelxuewang"), "main");
	public final ModelPart body;
	public final ModelPart head;
	public final ModelPart left;
	public final ModelPart right;
	public final ModelPart pifen;
	public final ModelPart zhang;

	public Modelxuewang(ModelPart root) {
		this.body = root.getChild("body");
		this.head = root.getChild("head");
		this.left = root.getChild("left");
		this.right = root.getChild("right");
		this.pifen = root.getChild("pifen");
		this.zhang = root.getChild("zhang");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-9.0F, -17.0F, -8.0F, 17.0F, 17.0F, 17.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 34).addBox(-7.0F, -31.0F, -6.0F, 13.0F, 13.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(28, 66).addBox(-3.0F, -32.0F, -2.0F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(8, 101)
						.addBox(1.0F, -34.0F, -2.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 101).addBox(-1.0F, -34.0F, -2.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 101)
						.addBox(-3.0F, -34.0F, -2.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 96).addBox(-3.0F, -34.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 96)
						.addBox(-3.0F, -34.0F, 2.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 96).addBox(-1.0F, -34.0F, 2.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 96)
						.addBox(1.0F, -34.0F, 2.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 96).addBox(1.0F, -34.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 96)
						.addBox(-2.0F, -26.0F, -8.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(22, 96).addBox(-1.0F, -25.0F, -10.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 25.0F, 0.0F));
		PartDefinition left = partdefinition.addOrReplaceChild("left", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r1 = left.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(10, 78).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.0F, -13.0F, 0.0F, 0.0F, 0.0F, -0.2618F));
		PartDefinition right = partdefinition.addOrReplaceChild("right", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r2 = right.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 78).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.0F, -13.0F, 0.0F, 0.0F, 0.0F, 0.2618F));
		PartDefinition pifen = partdefinition.addOrReplaceChild("pifen", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r3 = pifen.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 60).addBox(-7.0F, 0.0F, 0.0F, 13.0F, 17.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -17.0F, 9.0F, 0.0873F, 0.0F, 0.0F));
		PartDefinition zhang = partdefinition.addOrReplaceChild("zhang",
				CubeListBuilder.create().texOffs(20, 78).addBox(-14.0F, -19.0F, 0.0F, 1.0F, 17.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 78).addBox(-15.0F, -24.0F, -1.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(28, 60)
						.addBox(-16.0F, -25.0F, -2.0F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 96).addBox(-15.0F, -27.0F, -1.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(12, 101)
						.addBox(-14.0F, -28.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		pifen.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		zhang.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
