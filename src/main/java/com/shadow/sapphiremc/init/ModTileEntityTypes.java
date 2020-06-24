package com.shadow.sapphiremc.init;

import com.shadow.sapphiremc.SapphireMC;
import com.shadow.sapphiremc.tileentity.SapphireVaultTileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModTileEntityTypes {
    public static final DeferredRegister<TileEntityType<?>> TILE_ENTITY_TYPES = new DeferredRegister<>(ForgeRegistries.TILE_ENTITIES, SapphireMC.MOD_ID);

    // Tile Entities
    public static final RegistryObject<TileEntityType<SapphireVaultTileEntity>> SAPPHIRE_VAULT = TILE_ENTITY_TYPES.register("sapphire_vault", () -> TileEntityType.Builder.create(SapphireVaultTileEntity::new, BlockInit.SAPPHIRE_VAULT.get()).build(null));
}
