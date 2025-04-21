
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.diggysbruhcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.diggysbruhcraft.world.inventory.SmelterGuiMenu;
import net.mcreator.diggysbruhcraft.world.inventory.GoofyTraderGuiMenu;
import net.mcreator.diggysbruhcraft.world.inventory.FuelGeneratorGuiMenu;
import net.mcreator.diggysbruhcraft.world.inventory.CrusherGuiMenu;
import net.mcreator.diggysbruhcraft.world.inventory.CokeOvenGuiMenu;
import net.mcreator.diggysbruhcraft.world.inventory.BatteryGUIMenu;
import net.mcreator.diggysbruhcraft.world.inventory.BaccPaccGuiMenu;
import net.mcreator.diggysbruhcraft.world.inventory.BCRBGui3Menu;
import net.mcreator.diggysbruhcraft.world.inventory.BCRBGui2Menu;
import net.mcreator.diggysbruhcraft.world.inventory.BCRBGui1Menu;
import net.mcreator.diggysbruhcraft.world.inventory.AlloySmelterGuiMenu;
import net.mcreator.diggysbruhcraft.DiggysBruhcraftMod;

public class DiggysBruhcraftModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, DiggysBruhcraftMod.MODID);
	public static final RegistryObject<MenuType<FuelGeneratorGuiMenu>> FUEL_GENERATOR_GUI = REGISTRY.register("fuel_generator_gui", () -> IForgeMenuType.create(FuelGeneratorGuiMenu::new));
	public static final RegistryObject<MenuType<BatteryGUIMenu>> BATTERY_GUI = REGISTRY.register("battery_gui", () -> IForgeMenuType.create(BatteryGUIMenu::new));
	public static final RegistryObject<MenuType<BaccPaccGuiMenu>> BACC_PACC_GUI = REGISTRY.register("bacc_pacc_gui", () -> IForgeMenuType.create(BaccPaccGuiMenu::new));
	public static final RegistryObject<MenuType<GoofyTraderGuiMenu>> GOOFY_TRADER_GUI = REGISTRY.register("goofy_trader_gui", () -> IForgeMenuType.create(GoofyTraderGuiMenu::new));
	public static final RegistryObject<MenuType<CrusherGuiMenu>> CRUSHER_GUI = REGISTRY.register("crusher_gui", () -> IForgeMenuType.create(CrusherGuiMenu::new));
	public static final RegistryObject<MenuType<SmelterGuiMenu>> SMELTER_GUI = REGISTRY.register("smelter_gui", () -> IForgeMenuType.create(SmelterGuiMenu::new));
	public static final RegistryObject<MenuType<CokeOvenGuiMenu>> COKE_OVEN_GUI = REGISTRY.register("coke_oven_gui", () -> IForgeMenuType.create(CokeOvenGuiMenu::new));
	public static final RegistryObject<MenuType<AlloySmelterGuiMenu>> ALLOY_SMELTER_GUI = REGISTRY.register("alloy_smelter_gui", () -> IForgeMenuType.create(AlloySmelterGuiMenu::new));
	public static final RegistryObject<MenuType<BCRBGui1Menu>> BCRB_GUI_1 = REGISTRY.register("bcrb_gui_1", () -> IForgeMenuType.create(BCRBGui1Menu::new));
	public static final RegistryObject<MenuType<BCRBGui2Menu>> BCRB_GUI_2 = REGISTRY.register("bcrb_gui_2", () -> IForgeMenuType.create(BCRBGui2Menu::new));
	public static final RegistryObject<MenuType<BCRBGui3Menu>> BCRB_GUI_3 = REGISTRY.register("bcrb_gui_3", () -> IForgeMenuType.create(BCRBGui3Menu::new));
}
