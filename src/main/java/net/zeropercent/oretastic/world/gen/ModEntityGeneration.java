package net.zeropercent.oretastic.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.SpawnRestriction;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.world.Heightmap;
import net.minecraft.world.biome.BiomeKeys;
import net.zeropercent.oretastic.entity.ModEntities;

public class ModEntityGeneration {
    public static void addSpawns() {
        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.DEEP_DARK), SpawnGroup.CREATURE,
                ModEntities.STONE_VILLAGER, 45, 5, 15);


        SpawnRestriction.register(ModEntities.STONE_VILLAGER, SpawnRestriction.Location.ON_GROUND,
                Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, PassiveEntity::canMobSpawn);

        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.SNOWY_BEACH, BiomeKeys.SNOWY_PLAINS, BiomeKeys.SNOWY_SLOPES, BiomeKeys.SNOWY_TAIGA,
                        BiomeKeys.ICE_SPIKES), SpawnGroup.CREATURE,
                ModEntities.FROST_ELEMENTAL, 10, 1, 1);


        SpawnRestriction.register(ModEntities.FROST_ELEMENTAL, SpawnRestriction.Location.ON_GROUND,
                Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, HostileEntity::canMobSpawn);

       /* BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.SNOWY_BEACH, BiomeKeys.SNOWY_PLAINS, BiomeKeys.SNOWY_SLOPES, BiomeKeys.SNOWY_TAIGA,
                        BiomeKeys.ICE_SPIKES), SpawnGroup.CREATURE,
                ModEntities.ICE_GOBLIN, 50, 3, 10);


        SpawnRestriction.register(ModEntities.ICE_GOBLIN, SpawnRestriction.Location.ON_GROUND,
                Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, HostileEntity::canMobSpawn);*/

        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.PLAINS, BiomeKeys.SAVANNA, BiomeKeys.FOREST, BiomeKeys.FLOWER_FOREST,
                        BiomeKeys.BIRCH_FOREST, BiomeKeys.OLD_GROWTH_BIRCH_FOREST, BiomeKeys.SAVANNA_PLATEAU, BiomeKeys.WINDSWEPT_SAVANNA,
                        BiomeKeys.SUNFLOWER_PLAINS, BiomeKeys.WINDSWEPT_FOREST), SpawnGroup.CREATURE,
                ModEntities.PORCUPINE, 100, 2, 10);


        SpawnRestriction.register(ModEntities.PORCUPINE, SpawnRestriction.Location.ON_GROUND,
                Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AnimalEntity::canMobSpawn);
    }
}