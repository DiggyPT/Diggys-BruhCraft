
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.diggysbruhcraft.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.diggysbruhcraft.client.renderer.YehProjectileRenderer;
import net.mcreator.diggysbruhcraft.client.renderer.HyperNexusGuardianRenderer;
import net.mcreator.diggysbruhcraft.client.renderer.GugRenderer;
import net.mcreator.diggysbruhcraft.client.renderer.GoofyTraderRenderer;
import net.mcreator.diggysbruhcraft.client.renderer.DeathEelRenderer;
import net.mcreator.diggysbruhcraft.client.renderer.BordRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class DiggysBruhcraftModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(DiggysBruhcraftModEntities.DEATH_EEL.get(), DeathEelRenderer::new);
		event.registerEntityRenderer(DiggysBruhcraftModEntities.BORD.get(), BordRenderer::new);
		event.registerEntityRenderer(DiggysBruhcraftModEntities.YEH_PROJECTILE.get(), YehProjectileRenderer::new);
		event.registerEntityRenderer(DiggysBruhcraftModEntities.GOOFY_TRADER.get(), GoofyTraderRenderer::new);
		event.registerEntityRenderer(DiggysBruhcraftModEntities.HYPER_NEXUS_GUARDIAN.get(), HyperNexusGuardianRenderer::new);
		event.registerEntityRenderer(DiggysBruhcraftModEntities.GOON_PEARL_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(DiggysBruhcraftModEntities.HNG_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(DiggysBruhcraftModEntities.GUG.get(), GugRenderer::new);
	}
}
