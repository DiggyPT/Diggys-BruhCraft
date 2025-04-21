
package net.mcreator.diggysbruhcraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.diggysbruhcraft.entity.BordEntity;
import net.mcreator.diggysbruhcraft.client.model.animations.bordAnimation;
import net.mcreator.diggysbruhcraft.client.model.Modelbord;

import com.mojang.blaze3d.vertex.PoseStack;

public class BordRenderer extends MobRenderer<BordEntity, Modelbord<BordEntity>> {
	public BordRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelbord.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(BordEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(2f, 2f, 2f);
	}

	@Override
	public ResourceLocation getTextureLocation(BordEntity entity) {
		return new ResourceLocation("diggys_bruhcraft:textures/entities/bord.png");
	}

	private static final class AnimatedModel extends Modelbord<BordEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<BordEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(BordEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animate(entity.animationState0, bordAnimation.fly, ageInTicks, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(BordEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}
