
package net.mcreator.diggysbruhcraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.diggysbruhcraft.entity.DeathEelEntity;
import net.mcreator.diggysbruhcraft.client.model.animations.death_eelAnimation;
import net.mcreator.diggysbruhcraft.client.model.Modeldeath_eel;

public class DeathEelRenderer extends MobRenderer<DeathEelEntity, Modeldeath_eel<DeathEelEntity>> {
	public DeathEelRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modeldeath_eel.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(DeathEelEntity entity) {
		return new ResourceLocation("diggys_bruhcraft:textures/entities/death_eel.png");
	}

	private static final class AnimatedModel extends Modeldeath_eel<DeathEelEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<DeathEelEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(DeathEelEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animateWalk(death_eelAnimation.walk, limbSwing, limbSwingAmount, 1f, 1f);
				this.animate(entity.animationState1, death_eelAnimation.walk, ageInTicks, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(DeathEelEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}
