
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.diggysbruhcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.entity.decoration.PaintingVariant;

import net.mcreator.diggysbruhcraft.DiggysBruhcraftMod;

public class DiggysBruhcraftModPaintings {
	public static final DeferredRegister<PaintingVariant> REGISTRY = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, DiggysBruhcraftMod.MODID);
	public static final RegistryObject<PaintingVariant> BRUHSTATES = REGISTRY.register("bruhstates", () -> new PaintingVariant(128, 16));
}
