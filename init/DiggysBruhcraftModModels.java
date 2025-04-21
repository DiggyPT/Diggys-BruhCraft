
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.diggysbruhcraft.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.diggysbruhcraft.client.model.Modelyeh;
import net.mcreator.diggysbruhcraft.client.model.Modelhyper_nexus_guardian;
import net.mcreator.diggysbruhcraft.client.model.Modelgug_baby;
import net.mcreator.diggysbruhcraft.client.model.Modelgug;
import net.mcreator.diggysbruhcraft.client.model.Modelgoofy_trader;
import net.mcreator.diggysbruhcraft.client.model.Modeldeath_eel;
import net.mcreator.diggysbruhcraft.client.model.Modelbord;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class DiggysBruhcraftModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelhyper_nexus_guardian.LAYER_LOCATION, Modelhyper_nexus_guardian::createBodyLayer);
		event.registerLayerDefinition(Modeldeath_eel.LAYER_LOCATION, Modeldeath_eel::createBodyLayer);
		event.registerLayerDefinition(Modelbord.LAYER_LOCATION, Modelbord::createBodyLayer);
		event.registerLayerDefinition(Modelyeh.LAYER_LOCATION, Modelyeh::createBodyLayer);
		event.registerLayerDefinition(Modelgug.LAYER_LOCATION, Modelgug::createBodyLayer);
		event.registerLayerDefinition(Modelgug_baby.LAYER_LOCATION, Modelgug_baby::createBodyLayer);
		event.registerLayerDefinition(Modelgoofy_trader.LAYER_LOCATION, Modelgoofy_trader::createBodyLayer);
	}
}
