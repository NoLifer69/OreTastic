package net.zeropercent.oretastic.entity;


import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.zeropercent.oretastic.OreTastic;
import net.zeropercent.oretastic.entity.client.StoneVillagerModel;
import net.zeropercent.oretastic.entity.custom.FrostElementalEntity;
import net.zeropercent.oretastic.entity.custom.IceGoblinEntity;
import net.zeropercent.oretastic.entity.custom.PorcupineEntity;
import net.zeropercent.oretastic.entity.custom.StoneVillagerEntity;

public class ModEntities {
    public static final EntityType<FrostElementalEntity> FROST_ELEMENTAL = Registry.register(
            Registries.ENTITY_TYPE, new Identifier(OreTastic.MOD_ID, "frost_elemental"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, FrostElementalEntity::new)
                    .dimensions(EntityDimensions.fixed(1.5f, 3f)).build());

    public static final EntityType<StoneVillagerEntity> STONE_VILLAGER = Registry.register(
            Registries.ENTITY_TYPE, new Identifier(OreTastic.MOD_ID, "stone_villager"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, StoneVillagerEntity::new)
                    .dimensions(EntityDimensions.fixed(0.7f, 2.2f)).build());

    /*public static final EntityType<IceGoblinEntity> ICE_GOBLIN = Registry.register(
            Registries.ENTITY_TYPE, new Identifier(OreTastic.MOD_ID, "ice_goblin"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, IceGoblinEntity::new)
                    .dimensions(EntityDimensions.fixed(0.7f, 2f)).build());*/

    public static final EntityType<PorcupineEntity> PORCUPINE = Registry.register(
            Registries.ENTITY_TYPE, new Identifier(OreTastic.MOD_ID, "porcupine"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, PorcupineEntity::new)
                    .dimensions(EntityDimensions.fixed(0.7f, 1f)).build());
}