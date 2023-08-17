package net.zeropercent.oretastic.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.SpawnRestriction;
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
    }
}