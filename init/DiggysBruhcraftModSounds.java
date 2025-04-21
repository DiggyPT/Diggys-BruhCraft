
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.diggysbruhcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.diggysbruhcraft.DiggysBruhcraftMod;

public class DiggysBruhcraftModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, DiggysBruhcraftMod.MODID);
	public static final RegistryObject<SoundEvent> BURN = REGISTRY.register("burn", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("diggys_bruhcraft", "burn")));
	public static final RegistryObject<SoundEvent> POU_SOUND = REGISTRY.register("pou_sound", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("diggys_bruhcraft", "pou_sound")));
	public static final RegistryObject<SoundEvent> BABABOOEY_PITCHED_UP = REGISTRY.register("bababooey_pitched_up", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("diggys_bruhcraft", "bababooey_pitched_up")));
	public static final RegistryObject<SoundEvent> VINE_BOOM = REGISTRY.register("vine_boom", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("diggys_bruhcraft", "vine_boom")));
	public static final RegistryObject<SoundEvent> METAL_PIPE = REGISTRY.register("metal_pipe", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("diggys_bruhcraft", "metal_pipe")));
	public static final RegistryObject<SoundEvent> IFIWEREAGREG = REGISTRY.register("ifiwereagreg", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("diggys_bruhcraft", "ifiwereagreg")));
	public static final RegistryObject<SoundEvent> LONG_BRAIN_FART = REGISTRY.register("long_brain_fart", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("diggys_bruhcraft", "long_brain_fart")));
	public static final RegistryObject<SoundEvent> BRUH = REGISTRY.register("bruh", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("diggys_bruhcraft", "bruh")));
	public static final RegistryObject<SoundEvent> SE_LOCO_N_COMPENSA = REGISTRY.register("se_loco_n_compensa", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("diggys_bruhcraft", "se_loco_n_compensa")));
}
