package net.zeropercent.oretastic.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.zeropercent.oretastic.OreTastic;
import net.zeropercent.oretastic.entity.custom.StoneVillagerEntity;


public class ModEntities {
    public static final EntityType<StoneVillagerEntity> STONE_VILLAGER = Registry.register(
            Registries.ENTITY_TYPE, new Identifier(OreTastic.MOD_ID, "stone_villager"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, StoneVillagerEntity::new)
                    .dimensions(EntityDimensions.fixed(0.6f, 1.95f)).build());
}
