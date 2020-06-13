package com.shadow.sapphiremc.init;
import com.shadow.sapphiremc.SapphireMC.SapphireItemGroup;
import com.shadow.sapphiremc.SapphireMC;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(SapphireMC.MOD_ID)
@Mod.EventBusSubscriber(modid = SapphireMC.MOD_ID, bus = Bus.MOD)
public class BlockInit {
    public static final Block sapphire_block = null;
    public static final Block sapphire_ore = null;

    // Block
    @SubscribeEvent
    public static void registerBlocks(final RegistryEvent.Register<Block> event) {
        event.getRegistry().register(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5.0f, 30f).sound(SoundType.METAL).harvestLevel(3).harvestTool(ToolType.PICKAXE)).setRegistryName("sapphire_block"));
        event.getRegistry().register(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(3.0f, 15f).sound(SoundType.METAL).harvestLevel(3).harvestTool(ToolType.PICKAXE)).setRegistryName("sapphire_ore"));
    }

    // Block Items
    @SubscribeEvent
    public static void registerBlockItems(final RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new BlockItem(sapphire_block, new Item.Properties().group(SapphireItemGroup.instance)).setRegistryName("sapphire_block"));
        event.getRegistry().register(new BlockItem(sapphire_ore, new Item.Properties().group(SapphireItemGroup.instance)).setRegistryName("sapphire_ore"));
    }
}
