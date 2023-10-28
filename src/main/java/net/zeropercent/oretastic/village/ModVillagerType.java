package net.zeropercent.oretastic.village;

import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import net.minecraft.village.VillagerType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;

public final class ModVillagerType {
    public static final VillagerType STONE = create("stone");
    private final String name;
    public static final Map<RegistryKey<Biome>, VillagerType> BIOME_TO_TYPE = (Map)Util.make(Maps.newHashMap(), (map) -> {
        map.put(BiomeKeys.DEEP_DARK, STONE);
    });

    public ModVillagerType(String name) {
        this.name = name;
    }

    public String toString() {
        return this.name;
    }

    private static VillagerType create(String id) {
        return (VillagerType)Registry.register(Registries.VILLAGER_TYPE, new Identifier(id), new VillagerType(id));
    }

    public static VillagerType forBiome(RegistryEntry<Biome> biomeEntry) {
        Optional var10000 = biomeEntry.getKey();
        Map var10001 = BIOME_TO_TYPE;
        Objects.requireNonNull(var10001);
        return (VillagerType)var10000.map(var10001::get).orElse(VillagerType.PLAINS);
    }
}
