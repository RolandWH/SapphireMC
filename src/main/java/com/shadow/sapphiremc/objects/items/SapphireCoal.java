package com.shadow.sapphiremc.objects.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class SapphireCoal extends Item {
    public SapphireCoal(Properties properties) {
        super(properties);
    }

    @Override
    public int getBurnTime(ItemStack itemStack) {
        return 2600;
    }
}
