
package net.mcreator.diggysbruhcraft.potion;

import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.diggysbruhcraft.procedures.GrimaceOnEffectActiveTickProcedure;
import net.mcreator.diggysbruhcraft.procedures.GrimaceEffectExpiresProcedure;

public class GrimaceMobEffect extends MobEffect {
	public GrimaceMobEffect() {
		super(MobEffectCategory.HARMFUL, -10092340);
		this.addAttributeModifier(Attributes.MOVEMENT_SPEED, "1d208f88-6dd0-3710-abd5-6d3e3cfcfb33", 3, AttributeModifier.Operation.MULTIPLY_TOTAL);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		GrimaceOnEffectActiveTickProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ());
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		GrimaceEffectExpiresProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ());
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
