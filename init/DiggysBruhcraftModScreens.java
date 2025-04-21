
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.diggysbruhcraft.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.diggysbruhcraft.client.gui.SmelterGuiScreen;
import net.mcreator.diggysbruhcraft.client.gui.GoofyTraderGuiScreen;
import net.mcreator.diggysbruhcraft.client.gui.FuelGeneratorGuiScreen;
import net.mcreator.diggysbruhcraft.client.gui.CrusherGuiScreen;
import net.mcreator.diggysbruhcraft.client.gui.CokeOvenGuiScreen;
import net.mcreator.diggysbruhcraft.client.gui.BatteryGUIScreen;
import net.mcreator.diggysbruhcraft.client.gui.BaccPaccGuiScreen;
import net.mcreator.diggysbruhcraft.client.gui.BCRBGui3Screen;
import net.mcreator.diggysbruhcraft.client.gui.BCRBGui2Screen;
import net.mcreator.diggysbruhcraft.client.gui.BCRBGui1Screen;
import net.mcreator.diggysbruhcraft.client.gui.AlloySmelterGuiScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class DiggysBruhcraftModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(DiggysBruhcraftModMenus.FUEL_GENERATOR_GUI.get(), FuelGeneratorGuiScreen::new);
			MenuScreens.register(DiggysBruhcraftModMenus.BATTERY_GUI.get(), BatteryGUIScreen::new);
			MenuScreens.register(DiggysBruhcraftModMenus.BACC_PACC_GUI.get(), BaccPaccGuiScreen::new);
			MenuScreens.register(DiggysBruhcraftModMenus.GOOFY_TRADER_GUI.get(), GoofyTraderGuiScreen::new);
			MenuScreens.register(DiggysBruhcraftModMenus.CRUSHER_GUI.get(), CrusherGuiScreen::new);
			MenuScreens.register(DiggysBruhcraftModMenus.SMELTER_GUI.get(), SmelterGuiScreen::new);
			MenuScreens.register(DiggysBruhcraftModMenus.COKE_OVEN_GUI.get(), CokeOvenGuiScreen::new);
			MenuScreens.register(DiggysBruhcraftModMenus.ALLOY_SMELTER_GUI.get(), AlloySmelterGuiScreen::new);
			MenuScreens.register(DiggysBruhcraftModMenus.BCRB_GUI_1.get(), BCRBGui1Screen::new);
			MenuScreens.register(DiggysBruhcraftModMenus.BCRB_GUI_2.get(), BCRBGui2Screen::new);
			MenuScreens.register(DiggysBruhcraftModMenus.BCRB_GUI_3.get(), BCRBGui3Screen::new);
		});
	}
}
