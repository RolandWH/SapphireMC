package com.shadow.sapphiremc.init;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;

public class BlockInit {
    public static final Block SAPPHIRE_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).hardness(10f).resistance(12f));
}