package net.zeropercent.oretastic.world;

import net.minecraft.block.Blocks;
import net.zeropercent.oretastic.OreTastic;
import net.zeropercent.oretastic.block.ModBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;

import java.util.List;

public class ModPlacedFeatures {
    public static final RegistryKey<PlacedFeature> TITANIUM_ORE_PLACED_KEY = registerKey("titanium_ore_placed");
    public static final RegistryKey<PlacedFeature> RAW_TITANIUM_BLOCK_PLACED_KEY = registerKey("raw_titanium_block_placed");
    public static final RegistryKey<PlacedFeature> RUBY_ORE_PLACED_KEY = registerKey("ruby_ore_placed");
    public static final RegistryKey<PlacedFeature> LIGNITE_ORE_PLACED_KEY = registerKey("lignite_ore_placed");
    public static final RegistryKey<PlacedFeature> STEEL_ORE_PLACED_KEY = registerKey("steel_ore_placed");
    public static final RegistryKey<PlacedFeature> PALM_TREE_PLACED_KEY = registerKey("palm_tree_placed");
    public static final RegistryKey<PlacedFeature> OIL_PLACED_KEY = registerKey("oil_placed");
    public static final RegistryKey<PlacedFeature> MAGMA_ORE_PLACED_KEY = registerKey("magma_ore_placed");


    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, TITANIUM_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.TITANIUM_ORE_KEY),
                ModOrePlacement.modifiersWithCount(11, // Veins per Chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));
        register(context, RAW_TITANIUM_BLOCK_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.TITANIUM_BLOCK_KEY),
                ModOrePlacement.modifiersWithCount(2, // Veins per Chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));
        register(context, RUBY_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.RUBY_ORE_KEY),
                ModOrePlacement.modifiersWithCount(4, // Veins per Chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));
        register(context, LIGNITE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.LIGNITE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(15, // Veins per Chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));
        register(context, STEEL_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.STEEL_ORE_KEY),
                ModOrePlacement.modifiersWithCount(8, // Veins per Chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));

        register(context, PALM_TREE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.PALM_TREE_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(1, 0.1f, 2), Blocks.DEAD_BUSH));

        register(context, OIL_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.OIL_KEY),
                ModOrePlacement.modifiersWithCount(8, // Veins per Chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));

        register(context, MAGMA_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.MAGMA_ORE_KEY),
                ModOrePlacement.modifiersWithCount(5, // Veins per Chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));

    }

    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(OreTastic.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key,
                                                                                   RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                                                                   PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }
}
