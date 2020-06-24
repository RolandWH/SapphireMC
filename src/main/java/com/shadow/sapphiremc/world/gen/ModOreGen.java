package com.shadow.sapphiremc.world.gen;

import com.shadow.sapphiremc.init.BlockInit;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class ModOreGen {
    public static void generateOre() {
        for (Biome biome : ForgeRegistries.BIOMES) {
            ConfiguredPlacement modGenConfig = Placement.COUNT_RANGE.configure(new CountRangeConfig(1, 4, 0, 16));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.SAPPHIRE_ORE.get().getDefaultState(), 4)).withPlacement(modGenConfig));
        }
    }
}