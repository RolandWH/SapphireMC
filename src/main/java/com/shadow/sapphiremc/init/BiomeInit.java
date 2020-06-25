package com.shadow.sapphiremc.init;

import com.shadow.sapphiremc.SapphireMC;
import com.shadow.sapphiremc.world.biomes.SapphireBiome;
import net.minecraft.block.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.common.BiomeDictionary.Type;

public class BiomeInit {
    public static final DeferredRegister<Biome> BIOMES = new DeferredRegister<>(ForgeRegistries.BIOMES, SapphireMC.MOD_ID);

    public static final RegistryObject<Biome> SAPPHIRE_BIOMES = BIOMES.register("sapphire_biome", () -> new SapphireBiome(new Biome.Builder()
            .precipitation(Biome.RainType.SNOW)
            .scale(1.2f)
            .temperature(0.3f)
            .waterColor(0x5112FF)
            .waterFogColor(0x5112FF)
            .surfaceBuilder(SurfaceBuilder.DEFAULT, new SurfaceBuilderConfig(BlockInit.SAPPHIRE_BLOCK.get().getDefaultState(), Blocks.COARSE_DIRT.getDefaultState(), BlockInit.SAPPHIRE_ORE.get().getDefaultState()))
            .category(Biome.Category.PLAINS)
            .downfall(0.5f)
            .depth(0.12f)
            .parent(null)));

    public static void registerBiomes() {
        registerBiome(SAPPHIRE_BIOMES.get(), Type.PLAINS, Type.OVERWORLD);
    }

    private static void registerBiome(Biome biome, Type... types) {
        BiomeManager.addBiome(BiomeManager.BiomeType.COOL, new BiomeManager.BiomeEntry(biome, 100));
        BiomeDictionary.addTypes(biome, types);
        BiomeManager.addSpawnBiome(biome);
    }
}