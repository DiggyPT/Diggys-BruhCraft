
package net.mcreator.diggysbruhcraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.diggysbruhcraft.entity.GugEntity;
import net.mcreator.diggysbruhcraft.client.model.animations.gugAnimation;
import net.mcreator.diggysbruhcraft.client.model.Modelgug;

public class GugRenderer extends MobRenderer<GugEntity, Modelgug<GugEntity>> {
	public GugRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelgug.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(GugEntity entity) {
		return new ResourceLocation("diggys_bruhcraft:textures/entities/gug.png");
	}

	private static final class AnimatedModel extends Modelgug<GugEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<GugEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(GugEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animateWalk(gugAnimation.walk, limbSwing, limbSwingAmount, 4f, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(GugEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}
