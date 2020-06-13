package com.shadow.sapphiremc.init;

import com.shadow.sapphiremc.SapphireMC;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import com.shadow.sapphiremc.SapphireMC.SapphireItemGroup;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = SapphireMC.MOD_ID, bus = Bus.MOD)
@ObjectHolder(SapphireMC.MOD_ID)
public class ItemInit {
    // Declare tool name
    public static final Item sapphire = null;
    public static final Item sapphire_sword = null;
    public static final Item sapphire_pickaxe = null;
    public static final Item sapphire_axe = null;
    public static final Item sapphire_shovel = null;
    public static final Item sapphire_hoe = null;

    // Declare armor name
    public static final Item sapphire_helmet = null;
    public static final Item sapphire_chestplate = null;
    public static final Item sapphire_leggings =  null;
    public static final Item sapphire_boots = null;

    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new Item(new Item.Properties().group(SapphireItemGroup.instance)).setRegistryName("sapphire"));

        // Tools
        event.getRegistry().register(new SwordItem(ModItemTier.SAPPHIRE, 3, -2.4f, new Item.Properties().group(SapphireItemGroup.instance)).setRegistryName("sapphire_sword"));
        event.getRegistry().register(new PickaxeItem(ModItemTier.SAPPHIRE, -1, -2.8f, new Item.Properties().group(SapphireItemGroup.instance)).setRegistryName("sapphire_pickaxe"));
        event.getRegistry().register(new AxeItem(ModItemTier.SAPPHIRE, 5, -3.0f, new Item.Properties().group(SapphireItemGroup.instance)).setRegistryName("sapphire_axe"));
        event.getRegistry().register(new ShovelItem(ModItemTier.SAPPHIRE, -0.5f, -3.0f, new Item.Properties().group(SapphireItemGroup.instance)).setRegistryName("sapphire_shovel"));
        event.getRegistry().register(new HoeItem(ModItemTier.SAPPHIRE, 0, new Item.Properties().group(SapphireItemGroup.instance)).setRegistryName("sapphire_hoe"));

        // Armor
        event.getRegistry().register(new ArmorItem(ModArmorMaterial.SAPPHIRE, EquipmentSlotType.HEAD, new Item.Properties().group(SapphireItemGroup.instance)).setRegistryName("sapphire_helmet"));
        event.getRegistry().register(new ArmorItem(ModArmorMaterial.SAPPHIRE, EquipmentSlotType.CHEST, new Item.Properties().group(SapphireItemGroup.instance)).setRegistryName("sapphire_chestplate"));
        event.getRegistry().register(new ArmorItem(ModArmorMaterial.SAPPHIRE, EquipmentSlotType.LEGS, new Item.Properties().group(SapphireItemGroup.instance)).setRegistryName("sapphire_leggings"));
        event.getRegistry().register(new ArmorItem(ModArmorMaterial.SAPPHIRE, EquipmentSlotType.FEET, new Item.Properties().group(SapphireItemGroup.instance)).setRegistryName("sapphire_boots"));
    }

    public enum ModItemTier implements IItemTier {
        SAPPHIRE(4, 2300, 15.0f, 6f, 200, () -> {
            return Ingredient.fromItems(ItemInit.sapphire);
        });

        private final int harvestLevel;
        private final int maxUses;
        private final float efficiency;
        private final float attackDamage;
        private final int enchantability;
        private final LazyValue<Ingredient> repairMaterial;

        private ModItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial) {
            this.harvestLevel = harvestLevel;
            this.maxUses = maxUses;
            this.efficiency = efficiency;
            this.attackDamage = attackDamage;
            this.enchantability = enchantability;
            this.repairMaterial = new LazyValue<>(repairMaterial);
        }

        @Override
        public int getMaxUses() {
            return this.maxUses;
        }

        @Override
        public float getEfficiency() {
            return this.efficiency;
        }

        @Override
        public float getAttackDamage() {
            return this.attackDamage;
        }

        @Override
        public int getHarvestLevel() {
            return this.harvestLevel;
        }

        @Override
        public int getEnchantability() {
            return this.enchantability;
        }

        @Override
        public Ingredient getRepairMaterial() {
            return this.repairMaterial.getValue();
        }
    }

    public enum ModArmorMaterial implements IArmorMaterial {
        SAPPHIRE(SapphireMC.MOD_ID + ":sapphirearmor", 5, new int[] { 7, 9, 11 ,7 }, 420, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 6.9F, () -> {
            return Ingredient.fromItems(ItemInit.sapphire);
        });

        private static final int[] MAX_DAMAGE_ARRAY = new int[] { 16, 16, 16, 16};
        private final String name;
        private final int maxDamageFactor;
        private final int[] damageReductionAmountArray;
        private final int enchantability;
        private final SoundEvent soundEvent;
        private final float toughness;
        private final LazyValue<Ingredient> repairMaterial;

        private ModArmorMaterial(String nameIn, int maxDamageFactorIn, int[] damageReductionAmountIn, int enchantabilityIn, SoundEvent soundEventIn, float toughnessIn, Supplier<Ingredient> repairMaterialIn) {
            this.name = nameIn;
            this.maxDamageFactor = maxDamageFactorIn;
            this.damageReductionAmountArray = damageReductionAmountIn;
            this.enchantability = enchantabilityIn;
            this.soundEvent = soundEventIn;
            this.toughness = toughnessIn;
            this.repairMaterial = new LazyValue<>(repairMaterialIn);
        }

        @Override
        public int getDurability(EquipmentSlotType slotIn) {
            return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
        }

        @Override
        public int getDamageReductionAmount(EquipmentSlotType slotIn) {
            return this.damageReductionAmountArray[slotIn.getIndex()];
        }

        @Override
        public int getEnchantability() {
            return this.enchantability;
        }

        @Override
        public SoundEvent getSoundEvent() {
            return this.soundEvent;
        }

        @Override
        public Ingredient getRepairMaterial() {
            return this.repairMaterial.getValue();
        }

        @OnlyIn(Dist.CLIENT)
        @Override
        public String getName() {
            return this.name;
        }

        @Override
        public float getToughness() {
            return this.toughness;
        }
    }
}