
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.diggysbruhcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.BlockItem;

import net.mcreator.diggysbruhcraft.item.YehItem;
import net.mcreator.diggysbruhcraft.item.TreetapperItem;
import net.mcreator.diggysbruhcraft.item.TinSwordItem;
import net.mcreator.diggysbruhcraft.item.TinShovelItem;
import net.mcreator.diggysbruhcraft.item.TinPickaxeItem;
import net.mcreator.diggysbruhcraft.item.TinIngotItem;
import net.mcreator.diggysbruhcraft.item.TinHoeItem;
import net.mcreator.diggysbruhcraft.item.TinAxeItem;
import net.mcreator.diggysbruhcraft.item.SteelIngotItem;
import net.mcreator.diggysbruhcraft.item.RubyItem;
import net.mcreator.diggysbruhcraft.item.RubyDustItem;
import net.mcreator.diggysbruhcraft.item.RubberPulpItem;
import net.mcreator.diggysbruhcraft.item.RubberBarItem;
import net.mcreator.diggysbruhcraft.item.RizzvilleItem;
import net.mcreator.diggysbruhcraft.item.RizzClayBallItem;
import net.mcreator.diggysbruhcraft.item.ResinItem;
import net.mcreator.diggysbruhcraft.item.RawTinItem;
import net.mcreator.diggysbruhcraft.item.PouItem;
import net.mcreator.diggysbruhcraft.item.PicaretaDeEncantoItem;
import net.mcreator.diggysbruhcraft.item.PeanutButterItem;
import net.mcreator.diggysbruhcraft.item.PbjItem;
import net.mcreator.diggysbruhcraft.item.KeyItem;
import net.mcreator.diggysbruhcraft.item.JellyItem;
import net.mcreator.diggysbruhcraft.item.HyperNexusItem;
import net.mcreator.diggysbruhcraft.item.HbgProjectileItemItem;
import net.mcreator.diggysbruhcraft.item.HNGSpawnerDollyItem;
import net.mcreator.diggysbruhcraft.item.GugHideItem;
import net.mcreator.diggysbruhcraft.item.GrimaceShakeItem;
import net.mcreator.diggysbruhcraft.item.GrainItem;
import net.mcreator.diggysbruhcraft.item.GraciteDustItem;
import net.mcreator.diggysbruhcraft.item.GoonTetherItem;
import net.mcreator.diggysbruhcraft.item.GoonPearlItem;
import net.mcreator.diggysbruhcraft.item.GoofyTraderSpawnerWandItem;
import net.mcreator.diggysbruhcraft.item.EelElectrodeItem;
import net.mcreator.diggysbruhcraft.item.CokeItem;
import net.mcreator.diggysbruhcraft.item.CastIronIngotItem;
import net.mcreator.diggysbruhcraft.item.BruhcraftRecipeBookItem;
import net.mcreator.diggysbruhcraft.item.BrixBrickItem;
import net.mcreator.diggysbruhcraft.item.BaccPaccItem;
import net.mcreator.diggysbruhcraft.item.AquamarineItem;
import net.mcreator.diggysbruhcraft.DiggysBruhcraftMod;

public class DiggysBruhcraftModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, DiggysBruhcraftMod.MODID);
	public static final RegistryObject<Item> TIN_INGOT = REGISTRY.register("tin_ingot", () -> new TinIngotItem());
	public static final RegistryObject<Item> PICARETA_DE_ENCANTO = REGISTRY.register("picareta_de_encanto", () -> new PicaretaDeEncantoItem());
	public static final RegistryObject<Item> TIN_ORE = block(DiggysBruhcraftModBlocks.TIN_ORE);
	public static final RegistryObject<Item> DEEPSLATE_TIN_ORE = block(DiggysBruhcraftModBlocks.DEEPSLATE_TIN_ORE);
	public static final RegistryObject<Item> RAW_TIN = REGISTRY.register("raw_tin", () -> new RawTinItem());
	public static final RegistryObject<Item> KEY = REGISTRY.register("key", () -> new KeyItem());
	public static final RegistryObject<Item> FUEL_GENERATOR = block(DiggysBruhcraftModBlocks.FUEL_GENERATOR);
	public static final RegistryObject<Item> BATTERY = block(DiggysBruhcraftModBlocks.BATTERY);
	public static final RegistryObject<Item> DEATH_EEL_SPAWN_EGG = REGISTRY.register("death_eel_spawn_egg", () -> new ForgeSpawnEggItem(DiggysBruhcraftModEntities.DEATH_EEL, -16724737, -16737793, new Item.Properties()));
	public static final RegistryObject<Item> GOONITE = block(DiggysBruhcraftModBlocks.GOONITE);
	public static final RegistryObject<Item> GOONITE_BRICKS = block(DiggysBruhcraftModBlocks.GOONITE_BRICKS);
	public static final RegistryObject<Item> RIZZVILLE = REGISTRY.register("rizzville", () -> new RizzvilleItem());
	public static final RegistryObject<Item> NUTTE_TREE_LOG = block(DiggysBruhcraftModBlocks.NUTTE_TREE_LOG);
	public static final RegistryObject<Item> NUTTE_PLANKS = block(DiggysBruhcraftModBlocks.NUTTE_PLANKS);
	public static final RegistryObject<Item> NUTTE_LEAVES = block(DiggysBruhcraftModBlocks.NUTTE_LEAVES);
	public static final RegistryObject<Item> NUTTE = block(DiggysBruhcraftModBlocks.NUTTE);
	public static final RegistryObject<Item> SLATE = block(DiggysBruhcraftModBlocks.SLATE);
	public static final RegistryObject<Item> BACC_PACC = REGISTRY.register("bacc_pacc", () -> new BaccPaccItem());
	public static final RegistryObject<Item> RIZZ_GRASS = block(DiggysBruhcraftModBlocks.RIZZ_GRASS);
	public static final RegistryObject<Item> RIZZ_DIRT = block(DiggysBruhcraftModBlocks.RIZZ_DIRT);
	public static final RegistryObject<Item> RIZZ_SAND = block(DiggysBruhcraftModBlocks.RIZZ_SAND);
	public static final RegistryObject<Item> NUTTE_SAPLING = block(DiggysBruhcraftModBlocks.NUTTE_SAPLING);
	public static final RegistryObject<Item> POU = REGISTRY.register("pou", () -> new PouItem());
	public static final RegistryObject<Item> NUTTE_SLAB = block(DiggysBruhcraftModBlocks.NUTTE_SLAB);
	public static final RegistryObject<Item> NUTTE_STAIRS = block(DiggysBruhcraftModBlocks.NUTTE_STAIRS);
	public static final RegistryObject<Item> BORD_SPAWN_EGG = REGISTRY.register("bord_spawn_egg", () -> new ForgeSpawnEggItem(DiggysBruhcraftModEntities.BORD, -39322, -3407872, new Item.Properties()));
	public static final RegistryObject<Item> YEH = REGISTRY.register("yeh", () -> new YehItem());
	public static final RegistryObject<Item> NUTTE_FENCE = block(DiggysBruhcraftModBlocks.NUTTE_FENCE);
	public static final RegistryObject<Item> GRAIN_BALE = block(DiggysBruhcraftModBlocks.GRAIN_BALE);
	public static final RegistryObject<Item> BRIX = block(DiggysBruhcraftModBlocks.BRIX);
	public static final RegistryObject<Item> COBBLED_SLATE = block(DiggysBruhcraftModBlocks.COBBLED_SLATE);
	public static final RegistryObject<Item> AQUAMARINE = REGISTRY.register("aquamarine", () -> new AquamarineItem());
	public static final RegistryObject<Item> AQUAMARINE_SHALE = block(DiggysBruhcraftModBlocks.AQUAMARINE_SHALE);
	public static final RegistryObject<Item> BRIX_STAIRS = block(DiggysBruhcraftModBlocks.BRIX_STAIRS);
	public static final RegistryObject<Item> BRIX_SLAB = block(DiggysBruhcraftModBlocks.BRIX_SLAB);
	public static final RegistryObject<Item> LIGHTY = block(DiggysBruhcraftModBlocks.LIGHTY);
	public static final RegistryObject<Item> BRIX_WALL = block(DiggysBruhcraftModBlocks.BRIX_WALL);
	public static final RegistryObject<Item> EEL_EGG = block(DiggysBruhcraftModBlocks.EEL_EGG);
	public static final RegistryObject<Item> BRIX_GLASS = block(DiggysBruhcraftModBlocks.BRIX_GLASS);
	public static final RegistryObject<Item> GOOFY_TRADER_SPAWN_EGG = REGISTRY.register("goofy_trader_spawn_egg", () -> new ForgeSpawnEggItem(DiggysBruhcraftModEntities.GOOFY_TRADER, -10027111, -3381760, new Item.Properties()));
	public static final RegistryObject<Item> HYPER_NEXUS_GUARDIAN_SPAWN_EGG = REGISTRY.register("hyper_nexus_guardian_spawn_egg", () -> new ForgeSpawnEggItem(DiggysBruhcraftModEntities.HYPER_NEXUS_GUARDIAN, -52429, -13261, new Item.Properties()));
	public static final RegistryObject<Item> GOON_PEARL = REGISTRY.register("goon_pearl", () -> new GoonPearlItem());
	public static final RegistryObject<Item> GOON_TETHER = REGISTRY.register("goon_tether", () -> new GoonTetherItem());
	public static final RegistryObject<Item> HBG_PROJECTILE_ITEM = REGISTRY.register("hbg_projectile_item", () -> new HbgProjectileItemItem());
	public static final RegistryObject<Item> GRACITE = block(DiggysBruhcraftModBlocks.GRACITE);
	public static final RegistryObject<Item> FOUR_WAY_CABLE = block(DiggysBruhcraftModBlocks.FOUR_WAY_CABLE);
	public static final RegistryObject<Item> GRACITE_DUST = REGISTRY.register("gracite_dust", () -> new GraciteDustItem());
	public static final RegistryObject<Item> CRUSHER = block(DiggysBruhcraftModBlocks.CRUSHER);
	public static final RegistryObject<Item> RIZZ_GRASSY = block(DiggysBruhcraftModBlocks.RIZZ_GRASSY);
	public static final RegistryObject<Item> GRAIN = REGISTRY.register("grain", () -> new GrainItem());
	public static final RegistryObject<Item> GUG_SPAWN_EGG = REGISTRY.register("gug_spawn_egg", () -> new ForgeSpawnEggItem(DiggysBruhcraftModEntities.GUG, -13312, -13210, new Item.Properties()));
	public static final RegistryObject<Item> BRIX_BRICK = REGISTRY.register("brix_brick", () -> new BrixBrickItem());
	public static final RegistryObject<Item> RUBBER_LOG = block(DiggysBruhcraftModBlocks.RUBBER_LOG);
	public static final RegistryObject<Item> RUBBER_LEAVES = block(DiggysBruhcraftModBlocks.RUBBER_LEAVES);
	public static final RegistryObject<Item> RUBBER_SAPLING = block(DiggysBruhcraftModBlocks.RUBBER_SAPLING);
	public static final RegistryObject<Item> RUBBER_PULP = REGISTRY.register("rubber_pulp", () -> new RubberPulpItem());
	public static final RegistryObject<Item> RUBBER_BAR = REGISTRY.register("rubber_bar", () -> new RubberBarItem());
	public static final RegistryObject<Item> RUBY = REGISTRY.register("ruby", () -> new RubyItem());
	public static final RegistryObject<Item> RUBY_ORE = block(DiggysBruhcraftModBlocks.RUBY_ORE);
	public static final RegistryObject<Item> RUBY_DUST = REGISTRY.register("ruby_dust", () -> new RubyDustItem());
	public static final RegistryObject<Item> NUTTE_TRAPDOOR = block(DiggysBruhcraftModBlocks.NUTTE_TRAPDOOR);
	public static final RegistryObject<Item> NUTTE_DOOR = doubleBlock(DiggysBruhcraftModBlocks.NUTTE_DOOR);
	public static final RegistryObject<Item> NUTTE_GATE = block(DiggysBruhcraftModBlocks.NUTTE_GATE);
	public static final RegistryObject<Item> POLISHED_GRACITE = block(DiggysBruhcraftModBlocks.POLISHED_GRACITE);
	public static final RegistryObject<Item> RIZZ_CLAY = block(DiggysBruhcraftModBlocks.RIZZ_CLAY);
	public static final RegistryObject<Item> RUBBER_LOG_EMPTY = block(DiggysBruhcraftModBlocks.RUBBER_LOG_EMPTY);
	public static final RegistryObject<Item> RESIN = REGISTRY.register("resin", () -> new ResinItem());
	public static final RegistryObject<Item> TREETAPPER = REGISTRY.register("treetapper", () -> new TreetapperItem());
	public static final RegistryObject<Item> RUBBER_PLANKS = block(DiggysBruhcraftModBlocks.RUBBER_PLANKS);
	public static final RegistryObject<Item> RIZZ_CLAY_BALL = REGISTRY.register("rizz_clay_ball", () -> new RizzClayBallItem());
	public static final RegistryObject<Item> ELECTRIC_SMELTER = block(DiggysBruhcraftModBlocks.ELECTRIC_SMELTER);
	public static final RegistryObject<Item> MCCAINITE = block(DiggysBruhcraftModBlocks.MCCAINITE);
	public static final RegistryObject<Item> EPIKROK = block(DiggysBruhcraftModBlocks.EPIKROK);
	public static final RegistryObject<Item> EPIK_BRIK = block(DiggysBruhcraftModBlocks.EPIK_BRIK);
	public static final RegistryObject<Item> COKE_OVEN = block(DiggysBruhcraftModBlocks.COKE_OVEN);
	public static final RegistryObject<Item> COKE = REGISTRY.register("coke", () -> new CokeItem());
	public static final RegistryObject<Item> ALLOY_SMELTER = block(DiggysBruhcraftModBlocks.ALLOY_SMELTER);
	public static final RegistryObject<Item> STEEL_INGOT = REGISTRY.register("steel_ingot", () -> new SteelIngotItem());
	public static final RegistryObject<Item> CAST_IRON_INGOT = REGISTRY.register("cast_iron_ingot", () -> new CastIronIngotItem());
	public static final RegistryObject<Item> RUBBER_SLAB = block(DiggysBruhcraftModBlocks.RUBBER_SLAB);
	public static final RegistryObject<Item> RUBBER_STAIRS = block(DiggysBruhcraftModBlocks.RUBBER_STAIRS);
	public static final RegistryObject<Item> RUBBER_FENCE = block(DiggysBruhcraftModBlocks.RUBBER_FENCE);
	public static final RegistryObject<Item> NUTTE_BUTTON = block(DiggysBruhcraftModBlocks.NUTTE_BUTTON);
	public static final RegistryObject<Item> NUTTE_PRESSURE_PLATE = block(DiggysBruhcraftModBlocks.NUTTE_PRESSURE_PLATE);
	public static final RegistryObject<Item> RUBBER_BUTTON = block(DiggysBruhcraftModBlocks.RUBBER_BUTTON);
	public static final RegistryObject<Item> RUBBER_PRESSURE_PLATE = block(DiggysBruhcraftModBlocks.RUBBER_PRESSURE_PLATE);
	public static final RegistryObject<Item> RUBBER_FENCE_GATE = block(DiggysBruhcraftModBlocks.RUBBER_FENCE_GATE);
	public static final RegistryObject<Item> RUBBER_TRAPDOOR = block(DiggysBruhcraftModBlocks.RUBBER_TRAPDOOR);
	public static final RegistryObject<Item> RUBBER_DOOR = doubleBlock(DiggysBruhcraftModBlocks.RUBBER_DOOR);
	public static final RegistryObject<Item> TIN_PICKAXE = REGISTRY.register("tin_pickaxe", () -> new TinPickaxeItem());
	public static final RegistryObject<Item> TIN_AXE = REGISTRY.register("tin_axe", () -> new TinAxeItem());
	public static final RegistryObject<Item> TIN_SHOVEL = REGISTRY.register("tin_shovel", () -> new TinShovelItem());
	public static final RegistryObject<Item> TIN_SWORD = REGISTRY.register("tin_sword", () -> new TinSwordItem());
	public static final RegistryObject<Item> TIN_HOE = REGISTRY.register("tin_hoe", () -> new TinHoeItem());
	public static final RegistryObject<Item> PEANUT_BUTTER = REGISTRY.register("peanut_butter", () -> new PeanutButterItem());
	public static final RegistryObject<Item> JELLY = REGISTRY.register("jelly", () -> new JellyItem());
	public static final RegistryObject<Item> HYPER_NEXUS = REGISTRY.register("hyper_nexus", () -> new HyperNexusItem());
	public static final RegistryObject<Item> PBJ = REGISTRY.register("pbj", () -> new PbjItem());
	public static final RegistryObject<Item> HYPER_NEXUS_GUARDIAN_SPAWNER = block(DiggysBruhcraftModBlocks.HYPER_NEXUS_GUARDIAN_SPAWNER);
	public static final RegistryObject<Item> HNG_SPAWNER_DOLLY = REGISTRY.register("hng_spawner_dolly", () -> new HNGSpawnerDollyItem());
	public static final RegistryObject<Item> EEL_ELECTRODE = REGISTRY.register("eel_electrode", () -> new EelElectrodeItem());
	public static final RegistryObject<Item> EPIK_BRIK_STAIRS = block(DiggysBruhcraftModBlocks.EPIK_BRIK_STAIRS);
	public static final RegistryObject<Item> EPIK_BRIK_SLAB = block(DiggysBruhcraftModBlocks.EPIK_BRIK_SLAB);
	public static final RegistryObject<Item> EPIK_BRIK_WALL = block(DiggysBruhcraftModBlocks.EPIK_BRIK_WALL);
	public static final RegistryObject<Item> BRUHCRAFT_RECIPE_BOOK = REGISTRY.register("bruhcraft_recipe_book", () -> new BruhcraftRecipeBookItem());
	public static final RegistryObject<Item> GRIMACE_SHAKE = REGISTRY.register("grimace_shake", () -> new GrimaceShakeItem());
	public static final RegistryObject<Item> GUG_HIDE = REGISTRY.register("gug_hide", () -> new GugHideItem());
	public static final RegistryObject<Item> GOOFY_TRADER_SPAWNER_WAND = REGISTRY.register("goofy_trader_spawner_wand", () -> new GoofyTraderSpawnerWandItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties()));
	}
}
