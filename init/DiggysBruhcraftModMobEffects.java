
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.diggysbruhcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.diggysbruhcraft.potion.GrimaceMobEffect;
import net.mcreator.diggysbruhcraft.DiggysBruhcraftMod;

public class DiggysBruhcraftModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, DiggysBruhcraftMod.MODID);
	public static final RegistryObject<MobEffect> GRIMACE = REGISTRY.register("grimace", () -> new GrimaceMobEffect());
}
