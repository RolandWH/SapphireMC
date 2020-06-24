package com.shadow.sapphiremc.init;

import com.shadow.sapphiremc.SapphireMC;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {

    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, SapphireMC.MOD_ID);

    // Blocks
    public static final RegistryObject<Block> SAPPHIRE_BLOCK = BLOCKS.register("sapphire_block", () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5.0f, 30f).sound(SoundType.METAL).harvestLevel(3).harvestTool(ToolType.PICKAXE)));
    public static final RegistryObject<Block> SAPPHIRE_ORE = BLOCKS.register("sapphire_ore", () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(3.0f, 15f).sound(SoundType.METAL).harvestLevel(3).harvestTool(ToolType.PICKAXE)));
}
