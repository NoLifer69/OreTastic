package net.zeropercent.oretastic.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.zeropercent.oretastic.world.ModPlacedFeatures;

public class ModTreeGeneration {
    public static void generateTrees(){
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.BEACH, BiomeKeys.DESERT),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.PALM_TREE_PLACED_KEY);
    }
}
