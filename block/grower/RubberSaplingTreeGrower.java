package net.mcreator.diggysbruhcraft.block.grower;

import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.block.grower.AbstractMegaTreeGrower;
import net.minecraft.util.RandomSource;
import net.minecraft.resources.ResourceKey;
import net.minecraft.data.worldgen.features.FeatureUtils;

public class RubberSaplingTreeGrower extends AbstractMegaTreeGrower {
	protected ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource randomSource, boolean hasFlower) {
		if (randomSource.nextFloat() < 0.1) {
			if (hasFlower)
				return FeatureUtils.createKey("diggys_bruhcraft:rubber_tree");
			return FeatureUtils.createKey("diggys_bruhcraft:rubber_tree");
		}
		return hasFlower ? FeatureUtils.createKey("diggys_bruhcraft:rubber_tree") : FeatureUtils.createKey("diggys_bruhcraft:rubber_tree");
	}

	protected ResourceKey<ConfiguredFeature<?, ?>> getConfiguredMegaFeature(RandomSource randomSource) {
		return (randomSource.nextFloat() < 0.1) ? FeatureUtils.createKey("diggys_bruhcraft:rubber_tree") : FeatureUtils.createKey("diggys_bruhcraft:rubber_tree");
	}
}
