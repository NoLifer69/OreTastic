package net.zeropercent.oretastic.world;

import net.minecraft.block.Blocks;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.AcaciaFoliagePlacer;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.ForkingTrunkPlacer;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;
import net.minecraft.world.gen.trunk.UpwardsBranchingTrunkPlacer;
import net.zeropercent.oretastic.OreTastic;
import net.zeropercent.oretastic.block.ModBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.*;

import java.util.List;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> TITANIUM_ORE_KEY = registerKey("titanium_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TITANIUM_BLOCK_KEY = registerKey("titanium_block");
    public static final RegistryKey<ConfiguredFeature<?, ?>> RUBY_ORE_KEY = registerKey("ruby_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> LIGNITE_ORE_KEY = registerKey("lignite_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> STEEL_ORE_KEY = registerKey("steel_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PALM_TREE_KEY = registerKey("palm_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> OIL_KEY = registerKey("oil");


    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        List<OreFeatureConfig.Target> overworldTitaniumOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.TITANIUM_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.DEEPSLATE_TITANIUM_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldTitaniumBlock =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.RAW_TITANIUM_BLOCK.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.RAW_TITANIUM_BLOCK.getDefaultState()));
        List<OreFeatureConfig.Target> overworldRubyOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.RUBY_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.DEEPSLATE_RUBY_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldLigniteOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.LIGNITE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.DEEPSLATE_LIGNITE_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldSteelOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.STEEL_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.DEEPSLATE_STEEL_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldOils =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.OIL_FLUID_BLOCK.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.OIL_FLUID_BLOCK.getDefaultState()));

        register(context, TITANIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldTitaniumOres, 4));
        register(context, TITANIUM_BLOCK_KEY, Feature.ORE, new OreFeatureConfig(overworldTitaniumBlock, 1));
        register(context, RUBY_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldRubyOres, 4));
        register(context, LIGNITE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldLigniteOres, 13));
        register(context, STEEL_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldSteelOres, 8));
        register(context, OIL_KEY, Feature.ORE, new OreFeatureConfig(overworldOils, 8));

        register(context, PALM_TREE_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.PALM_LOG),
                new ForkingTrunkPlacer(5, 2, 2),
                BlockStateProvider.of(ModBlocks.PALM_LEAVES),
                new AcaciaFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0)),
                new TwoLayersFeatureSize(1, 0, 2))
                .ignoreVines().build());
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(OreTastic.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
