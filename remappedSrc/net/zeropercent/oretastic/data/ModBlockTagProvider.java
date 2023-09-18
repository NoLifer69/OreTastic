package net.zeropercent.oretastic.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fabricmc.fabric.api.mininglevel.v1.FabricMineableTags;
import net.fabricmc.fabric.impl.datagen.FabricTagBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.zeropercent.oretastic.block.ModBlocks;
import net.zeropercent.oretastic.util.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ModTags.Blocks.METAL_DETECTOR_DETECTABLE_BLOCKS)
                .forceAddTag(BlockTags.IRON_ORES)
                .forceAddTag(BlockTags.COPPER_ORES)
                .add(ModBlocks.STEEL_ORE)
                .add(ModBlocks.DEEPSLATE_STEEL_ORE);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.TITANIUM_ORE)
                .add(ModBlocks.DEEPSLATE_TITANIUM_ORE)
                .add(ModBlocks.TITANIUM_BLOCK)
                .add(ModBlocks.RAW_TITANIUM_BLOCK)
                .add(ModBlocks.RUBY_ORE)
                .add(ModBlocks.DEEPSLATE_RUBY_ORE)
                .add(ModBlocks.RUBY_BLOCK)
                .add(ModBlocks.LIGNITE_ORE)
                .add(ModBlocks.DEEPSLATE_LIGNITE_ORE)
                .add(ModBlocks.LIGNITE_BLOCK)
                .add(ModBlocks.STEEL_ORE)
                .add(ModBlocks.DEEPSLATE_STEEL_ORE)
                .add(ModBlocks.STEEL_BLOCK)
                .add(ModBlocks.RAW_STEEL_BLOCK)
                .add(ModBlocks.NETHERRACK_MAGMA_ORE);

        getOrCreateTagBuilder(BlockTags.HOE_MINEABLE)
                .add(ModBlocks.CHEESE_BLOCK);

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(ModBlocks.PALM_LOG)
                .add(ModBlocks.PALM_WOOD)
                .add(ModBlocks.STRIPPED_PALM_LOG)
                .add(ModBlocks.STRIPPED_PALM_WOOD)
                .add(ModBlocks.PALM_LEAVES)
                .add(ModBlocks.PALM_PLANKS);

        getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE)
                .add(ModBlocks.SOUL_SAND_MAGMA_ORE);

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.TITANIUM_ORE)
                .add(ModBlocks.DEEPSLATE_TITANIUM_ORE)
                .add(ModBlocks.RAW_TITANIUM_BLOCK)
                .add(ModBlocks.TITANIUM_BLOCK);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.LIGNITE_ORE)
                .add(ModBlocks.DEEPSLATE_LIGNITE_ORE)
                .add(ModBlocks.LIGNITE_BLOCK)
                .add(ModBlocks.STEEL_ORE)
                .add(ModBlocks.DEEPSLATE_STEEL_ORE)
                .add(ModBlocks.STEEL_BLOCK)
                .add(ModBlocks.RAW_STEEL_BLOCK)
                .add(ModBlocks.NETHERRACK_MAGMA_ORE)
                .add(ModBlocks.SOUL_SAND_MAGMA_ORE);


        getOrCreateTagBuilder(BlockTags.BEACON_BASE_BLOCKS)
                .add(ModBlocks.STEEL_BLOCK)
                .add(ModBlocks.TITANIUM_BLOCK)
                .add(ModBlocks.RUBY_BLOCK);

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK,
                new Identifier("fabric", "need_tool_level_4")))
                .add(ModBlocks.RUBY_ORE)
                .add(ModBlocks.DEEPSLATE_RUBY_ORE)
                .add(ModBlocks.DEEPSLATE_RUBY_ORE);

        getOrCreateTagBuilder(BlockTags.LOGS)
                .add(ModBlocks.PALM_LOG)
                .add(ModBlocks.PALM_WOOD)
                .add(ModBlocks.STRIPPED_PALM_LOG)
                .add(ModBlocks.STRIPPED_PALM_WOOD);

        getOrCreateTagBuilder(BlockTags.PLANKS)
                .setReplace(false)
                .add(ModBlocks.PALM_PLANKS);

        getOrCreateTagBuilder(BlockTags.LEAVES)
                .add(ModBlocks.PALM_LEAVES);

        getOrCreateTagBuilder(FabricMineableTags.SHEARS_MINEABLE)
                .add(ModBlocks.PALM_LEAVES);

        getOrCreateTagBuilder(BlockTags.WOODEN_FENCES)
                .add(ModBlocks.PALM_FENCE);

        getOrCreateTagBuilder(BlockTags.WOODEN_STAIRS)
                .add(ModBlocks.PALM_STAIRS);

        getOrCreateTagBuilder(BlockTags.WOODEN_BUTTONS)
                .add(ModBlocks.PALM_BUTTON);

        getOrCreateTagBuilder(BlockTags.WOODEN_DOORS)
                .add(ModBlocks.PALM_DOOR);

        getOrCreateTagBuilder(BlockTags.WOODEN_SLABS)
                .add(ModBlocks.PALM_SLAB);

        getOrCreateTagBuilder(BlockTags.WOODEN_PRESSURE_PLATES)
                .add(ModBlocks.PALM_PRESSURE_PLATE);

        getOrCreateTagBuilder(BlockTags.WOODEN_TRAPDOORS)
                .add(ModBlocks.PALM_TRAPDOOR);

        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.PALM_WALL);

        getOrCreateTagBuilder(ModTags.Blocks.SOUL_SAND_REPLACEABLES)
                .add(Blocks.SOUL_SAND)
                .add(Blocks.SOUL_SOIL);
    }
}
