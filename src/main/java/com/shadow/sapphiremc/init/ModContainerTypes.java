package com.shadow.sapphiremc.init;

import com.shadow.sapphiremc.SapphireMC;
import com.shadow.sapphiremc.container.SapphireVaultContainer;
import net.minecraft.inventory.container.ContainerType;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModContainerTypes {
    public static final DeferredRegister<ContainerType<?>> CONTAINER_TYPES = new DeferredRegister<>(ForgeRegistries.CONTAINERS, SapphireMC.MOD_ID);

    public static final RegistryObject<ContainerType<SapphireVaultContainer>> SAPPHIRE_VAULT = CONTAINER_TYPES.register("sapphire_vault", () -> IForgeContainerType.create(SapphireVaultContainer::new));
}
