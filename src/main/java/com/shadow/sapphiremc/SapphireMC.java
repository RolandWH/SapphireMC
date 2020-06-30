package com.shadow.sapphiremc;

import com.shadow.sapphiremc.init.BlockInit;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.shadow.sapphiremc.init.ItemInit.SAPPHIRE;

public class SapphireMC implements ModInitializer {

    public static final ItemGroup SAPPHIRE_GROUP = FabricItemGroupBuilder.build(
            new Identifier("sapphiremc", "general"),
            () -> new ItemStack(SAPPHIRE));

    @Override
    public void onInitialize() {
        // Items
        Registry.register(Registry.ITEM, new Identifier("sapphiremc", "sapphire"), SAPPHIRE);

        // Blocks
        Registry.register(Registry.BLOCK, new Identifier("sapphiremc", "sapphire_block"), BlockInit.SAPPHIRE_BLOCK);

        // Block Items
        Registry.register(Registry.ITEM, new Identifier("sapphiremc", "sapphire_block"), new BlockItem(BlockInit.SAPPHIRE_BLOCK, new Item.Settings().group(SapphireMC.SAPPHIRE_GROUP)));
    }
}