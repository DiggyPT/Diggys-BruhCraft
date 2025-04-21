
package net.mcreator.diggysbruhcraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.diggysbruhcraft.entity.GoofyTraderEntity;
import net.mcreator.diggysbruhcraft.client.model.animations.goofy_traderAnimation;
import net.mcreator.diggysbruhcraft.client.model.Modelgoofy_trader;

public class GoofyTraderRenderer extends MobRenderer<GoofyTraderEntity, Modelgoofy_trader<GoofyTraderEntity>> {
	public GoofyTraderRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelgoofy_trader.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(GoofyTraderEntity entity) {
		return new ResourceLocation("diggys_bruhcraft:textures/entities/goofy_trader.png");
	}

	private static final class AnimatedModel extends Modelgoofy_trader<GoofyTraderEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<GoofyTraderEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(GoofyTraderEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animateWalk(goofy_traderAnimation.walk, limbSwing, limbSwingAmount, 1f, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(GoofyTraderEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}
