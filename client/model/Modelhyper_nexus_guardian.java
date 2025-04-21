package net.mcreator.diggysbruhcraft.client.model;

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

// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelhyper_nexus_guardian<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("diggys_bruhcraft", "modelhyper_nexus_guardian"), "main");
	public final ModelPart bone;
	public final ModelPart bone3;
	public final ModelPart bone2;
	public final ModelPart bone14;
	public final ModelPart bone15;
	public final ModelPart leg2;
	public final ModelPart bone5;
	public final ModelPart leg3;
	public final ModelPart bone7;
	public final ModelPart leg4;
	public final ModelPart bone9;
	public final ModelPart leg;
	public final ModelPart bone11;
	public final ModelPart bone12;
	public final ModelPart bone13;
	public final ModelPart bb_main;

	public Modelhyper_nexus_guardian(ModelPart root) {
		this.bone = root.getChild("bone");
		this.bone3 = this.bone.getChild("bone3");
		this.bone2 = this.bone3.getChild("bone2");
		this.bone14 = this.bone2.getChild("bone14");
		this.bone15 = this.bone2.getChild("bone15");
		this.leg2 = root.getChild("leg2");
		this.bone5 = this.leg2.getChild("bone5");
		this.leg3 = root.getChild("leg3");
		this.bone7 = this.leg3.getChild("bone7");
		this.leg4 = root.getChild("leg4");
		this.bone9 = this.leg4.getChild("bone9");
		this.leg = root.getChild("leg");
		this.bone11 = this.leg.getChild("bone11");
		this.bone12 = root.getChild("bone12");
		this.bone13 = root.getChild("bone13");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(154, 94).addBox(-9.0F, -7.1568F, -16.8036F, 20.0F, 12.0F, 20.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -28.0F, -0.4363F, 0.0F, 0.0F));
		PartDefinition bone3 = bone.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(38, 160).addBox(-5.0F, -4.0F, -6.0F, 12.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -3.1568F, -16.8036F));
		PartDefinition bone2 = bone3.addOrReplaceChild("bone2",
				CubeListBuilder.create().texOffs(154, 153).addBox(-3.0F, -2.655F, -11.4706F, 8.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(136, 55).addBox(-5.0F, -1.655F, -24.4706F, 2.0F, 3.0F, 7.0F, new CubeDeformation(0.0F))
						.texOffs(136, 55).addBox(5.0F, -1.655F, -24.4706F, 2.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(174, 24).addBox(-3.0F, -4.655F, -19.4706F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -6.0F, -0.4363F, 0.0F, 0.0F));
		PartDefinition bone14 = bone2.addOrReplaceChild("bone14", CubeListBuilder.create().texOffs(74, 160).addBox(0.0F, -2.0F, 0.0F, 4.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -0.655F, -11.4706F));
		PartDefinition bone15 = bone2.addOrReplaceChild("bone15", CubeListBuilder.create().texOffs(106, 160).addBox(-4.0F, -2.0F, -1.0F, 4.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, -0.655F, -10.4706F));
		PartDefinition leg2 = partdefinition.addOrReplaceChild("leg2", CubeListBuilder.create().texOffs(138, 169).addBox(0.0F, -5.0F, -5.0F, 3.0F, 15.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(16.0F, 2.0F, -15.0F, -0.2618F, 0.0F, 0.0F));
		PartDefinition bone5 = leg2.addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(0, 176).addBox(-1.0F, -2.0F, -3.0F, 3.0F, 12.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 10.0F, 0.0F, 0.5236F, 0.0F, 0.0F));
		PartDefinition cube_r1 = bone5.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(174, 40).addBox(-1.0F, 1.0F, -9.0F, 5.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 9.0F, 0.0F, -0.2618F, 0.0F, 0.0F));
		PartDefinition leg3 = partdefinition.addOrReplaceChild("leg3", CubeListBuilder.create().texOffs(162, 169).addBox(0.0F, -5.0F, -5.0F, 3.0F, 15.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(16.0F, 2.0F, 10.0F, -0.2618F, 0.0F, 0.0F));
		PartDefinition bone7 = leg3.addOrReplaceChild("bone7", CubeListBuilder.create().texOffs(16, 176).addBox(-1.0F, -2.0F, -3.0F, 3.0F, 12.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 10.0F, 0.0F, 0.5236F, 0.0F, 0.0F));
		PartDefinition cube_r2 = bone7.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(174, 53).addBox(-1.0F, 1.0F, -9.0F, 5.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 9.0F, 0.0F, -0.2618F, 0.0F, 0.0F));
		PartDefinition leg4 = partdefinition.addOrReplaceChild("leg4", CubeListBuilder.create().texOffs(38, 173).addBox(-3.0F, -5.0F, -5.0F, 3.0F, 15.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-14.0F, 2.0F, 10.0F, -0.2618F, 0.0F, 0.0F));
		PartDefinition bone9 = leg4.addOrReplaceChild("bone9", CubeListBuilder.create().texOffs(62, 176).addBox(-3.0F, -2.0F, -3.0F, 3.0F, 12.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 10.0F, 0.0F, 0.5236F, 0.0F, 0.0F));
		PartDefinition cube_r3 = bone9.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(174, 66).addBox(-1.0F, 1.0F, -9.0F, 5.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, 9.0F, 0.0F, -0.2618F, 0.0F, 0.0F));
		PartDefinition leg = partdefinition.addOrReplaceChild("leg", CubeListBuilder.create().texOffs(174, 0).addBox(-3.0F, -5.0F, -5.0F, 3.0F, 15.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-14.0F, 2.0F, -15.0F, -0.2618F, 0.0F, 0.0F));
		PartDefinition bone11 = leg.addOrReplaceChild("bone11", CubeListBuilder.create().texOffs(78, 176).addBox(-3.0F, -2.0F, -3.0F, 3.0F, 12.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 10.0F, 0.0F, 0.5236F, 0.0F, 0.0F));
		PartDefinition cube_r4 = bone11.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(174, 79).addBox(-1.0F, 1.0F, -9.0F, 5.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, 9.0F, 0.0F, -0.2618F, 0.0F, 0.0F));
		PartDefinition bone12 = partdefinition.addOrReplaceChild("bone12", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 0.0F, -25.0F, 40.0F, 0.0F, 47.0F, new CubeDeformation(0.0F)), PartPose.offset(16.0F, -8.0F, -2.0F));
		PartDefinition bone13 = partdefinition.addOrReplaceChild("bone13", CubeListBuilder.create().texOffs(0, 47).addBox(-40.0F, 0.0F, -25.0F, 40.0F, 0.0F, 47.0F, new CubeDeformation(0.0F)), PartPose.offset(-14.0F, -8.0F, -2.0F));
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(0, 160).addBox(-2.0F, -23.0F, 39.0F, 7.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(154, 126)
				.addBox(-8.0F, -26.0F, 20.0F, 18.0F, 8.0F, 19.0F, new CubeDeformation(0.0F)).texOffs(0, 94).addBox(-14.0F, -32.0F, -27.0F, 30.0F, 19.0F, 47.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone12.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone13.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
