
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.diggysbruhcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.diggysbruhcraft.block.entity.FuelGeneratorBlockEntity;
import net.mcreator.diggysbruhcraft.block.entity.FourWayCableBlockEntity;
import net.mcreator.diggysbruhcraft.block.entity.ElectricSmelterBlockEntity;
import net.mcreator.diggysbruhcraft.block.entity.CrusherBlockEntity;
import net.mcreator.diggysbruhcraft.block.entity.CokeOvenBlockEntity;
import net.mcreator.diggysbruhcraft.block.entity.BatteryBlockEntity;
import net.mcreator.diggysbruhcraft.block.entity.AlloySmelterBlockEntity;
import net.mcreator.diggysbruhcraft.DiggysBruhcraftMod;

public class DiggysBruhcraftModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, DiggysBruhcraftMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> FUEL_GENERATOR = register("fuel_generator", DiggysBruhcraftModBlocks.FUEL_GENERATOR, FuelGeneratorBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BATTERY = register("battery", DiggysBruhcraftModBlocks.BATTERY, BatteryBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> FOUR_WAY_CABLE = register("four_way_cable", DiggysBruhcraftModBlocks.FOUR_WAY_CABLE, FourWayCableBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CRUSHER = register("crusher", DiggysBruhcraftModBlocks.CRUSHER, CrusherBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ELECTRIC_SMELTER = register("electric_smelter", DiggysBruhcraftModBlocks.ELECTRIC_SMELTER, ElectricSmelterBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> COKE_OVEN = register("coke_oven", DiggysBruhcraftModBlocks.COKE_OVEN, CokeOvenBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ALLOY_SMELTER = register("alloy_smelter", DiggysBruhcraftModBlocks.ALLOY_SMELTER, AlloySmelterBlockEntity::new);

	// Start of user code block custom block entities
	// End of user code block custom block entities
	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
