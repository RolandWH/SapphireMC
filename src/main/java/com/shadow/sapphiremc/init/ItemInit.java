package com.shadow.sapphiremc.init;

import com.shadow.sapphiremc.SapphireMC;
import com.shadow.sapphiremc.objects.items.SapphireCoal;
import com.shadow.sapphiremc.util.enums.ModArmorMaterials;
import com.shadow.sapphiremc.util.enums.ModItemTiers;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, SapphireMC.MOD_ID);

    // Items
    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire", () -> new Item(new Item.Properties().group(SapphireMC.SapphireItemGroup.instance)));
    public static final RegistryObject<Item> SAPPHIRE_COAL = ITEMS.register("sapphire_coal", () -> (new SapphireCoal(new Item.Properties().group(SapphireMC.SapphireItemGroup.instance))));

    // Tools
    public static final RegistryObject<Item> SAPPHIRE_SWORD = ITEMS.register("sapphire_sword", () -> new SwordItem(ModItemTiers.SAPPHIRE, 3, -2.4f, new Item.Properties().group(SapphireMC.SapphireItemGroup.instance)));
    public static final RegistryObject<Item> SAPPHIRE_SHOVEL = ITEMS.register("sapphire_shovel", () -> new ShovelItem(ModItemTiers.SAPPHIRE, -0.5f, -3.0f, new Item.Properties().group(SapphireMC.SapphireItemGroup.instance)));
    public static final RegistryObject<Item> SAPPHIRE_PICKAXE = ITEMS.register("sapphire_pickaxe", () -> new PickaxeItem(ModItemTiers.SAPPHIRE, -1, -2.8f, new Item.Properties().group(SapphireMC.SapphireItemGroup.instance)));
    public static final RegistryObject<Item> SAPPHIRE_AXE = ITEMS.register("sapphire_axe", () -> new AxeItem(ModItemTiers.SAPPHIRE, 5, -3.0f, new Item.Properties().group(SapphireMC.SapphireItemGroup.instance)));
    public static final RegistryObject<Item> SAPPHIRE_HOE = ITEMS.register("sapphire_hoe", () -> new HoeItem(ModItemTiers.SAPPHIRE, 0, new Item.Properties().group(SapphireMC.SapphireItemGroup.instance)));

    // Armor
    public static final RegistryObject<Item> SAPPHIRE_HELMET = ITEMS.register("sapphire_helmet", () -> new ArmorItem(ModArmorMaterials.SAPPHIRE, EquipmentSlotType.HEAD, new Item.Properties().group(SapphireMC.SapphireItemGroup.instance)));
    public static final RegistryObject<Item> SAPPHIRE_CHESTPLATE = ITEMS.register("sapphire_chestplate", () -> new ArmorItem(ModArmorMaterials.SAPPHIRE, EquipmentSlotType.CHEST, new Item.Properties().group(SapphireMC.SapphireItemGroup.instance)));
    public static final RegistryObject<Item> SAPPHIRE_LEGGINGS = ITEMS.register("sapphire_leggings", () -> new ArmorItem(ModArmorMaterials.SAPPHIRE, EquipmentSlotType.LEGS, new Item.Properties().group(SapphireMC.SapphireItemGroup.instance)));
    public static final RegistryObject<Item> SAPPHIRE_BOOTS = ITEMS.register("sapphire_boots", () -> new ArmorItem(ModArmorMaterials.SAPPHIRE, EquipmentSlotType.FEET, new Item.Properties().group(SapphireMC.SapphireItemGroup.instance)));
}
