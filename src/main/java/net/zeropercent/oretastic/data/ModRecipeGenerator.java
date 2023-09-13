package net.zeropercent.oretastic.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.Identifier;
import net.zeropercent.oretastic.block.ModBlocks;
import net.zeropercent.oretastic.item.ModItems;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerSmelting(exporter, List.of(ModItems.RAW_TITANIUM), RecipeCategory.MISC,
                ModItems.TITANIUM, 3f, 200, "titanium");
        offerBlasting(exporter, List.of(ModItems.RAW_TITANIUM), RecipeCategory.MISC,
                ModItems.TITANIUM, 3f,100, "titanium");

        offerSmelting(exporter, List.of(ModBlocks.TITANIUM_ORE), RecipeCategory.MISC,
                ModItems.TITANIUM, 3f, 200, "titanium");
        offerBlasting(exporter, List.of(ModBlocks.TITANIUM_ORE), RecipeCategory.MISC,
                ModItems.TITANIUM, 3f, 100, "titanium");

        offerSmelting(exporter, List.of(ModBlocks.DEEPSLATE_TITANIUM_ORE), RecipeCategory.MISC,
                ModItems.TITANIUM, 3f, 200, "titanium");
        offerBlasting(exporter, List.of(ModBlocks.DEEPSLATE_TITANIUM_ORE), RecipeCategory.MISC,
                ModItems.TITANIUM, 3f,100, "titanium");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS,
                ModItems.TITANIUM, RecipeCategory.DECORATIONS, ModBlocks.TITANIUM_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS,
                ModItems.RAW_TITANIUM, RecipeCategory.DECORATIONS, ModBlocks.RAW_TITANIUM_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TITANIUM_HELMET)
                .pattern("###")
                .pattern("# #")
                .input('#', ModItems.TITANIUM)
                .criterion(hasItem(ModItems.TITANIUM),
                        conditionsFromItem(ModItems.TITANIUM))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TITANIUM_LEGGINGS)
                .pattern("###")
                .pattern("# #")
                .pattern("# #")
                .input('#', ModItems.TITANIUM)
                .criterion(hasItem(ModItems.TITANIUM),
                        conditionsFromItem(ModItems.TITANIUM))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TITANIUM_CHESTPLATE)
                .pattern("# #")
                .pattern("###")
                .pattern("###")
                .input('#', ModItems.TITANIUM)
                .criterion(hasItem(ModItems.TITANIUM),
                        conditionsFromItem(ModItems.TITANIUM))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TITANIUM_BOOTS)
                .pattern("# #")
                .pattern("# #")
                .input('#', ModItems.TITANIUM)
                .criterion(hasItem(ModItems.TITANIUM),
                        conditionsFromItem(ModItems.TITANIUM))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.TITANIUM_SWORD)
                .pattern(" # ")
                .pattern(" # ")
                .pattern(" $ ")
                .input('#', ModItems.TITANIUM)
                .input('$', Items.STICK)
                .criterion(hasItem(ModItems.TITANIUM),
                        conditionsFromItem(ModItems.TITANIUM))
                .criterion(hasItem(Items.STICK),
                        conditionsFromItem(Items.STICK))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.TITANIUM_AXE)
                .pattern("## ")
                .pattern("#$ ")
                .pattern(" $ ")
                .input('#', ModItems.TITANIUM)
                .input('$', Items.STICK)
                .criterion(hasItem(ModItems.TITANIUM),
                        conditionsFromItem(ModItems.TITANIUM))
                .criterion(hasItem(Items.STICK),
                        conditionsFromItem(Items.STICK))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.TITANIUM_PICKAXE)
                .pattern("###")
                .pattern(" $ ")
                .pattern(" $ ")
                .input('#', ModItems.TITANIUM)
                .input('$', Items.STICK)
                .criterion(hasItem(ModItems.TITANIUM),
                        conditionsFromItem(ModItems.TITANIUM))
                .criterion(hasItem(Items.STICK),
                        conditionsFromItem(Items.STICK))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.TITANIUM_SHOVEL)
                .pattern(" # ")
                .pattern(" $ ")
                .pattern(" $ ")
                .input('#', ModItems.TITANIUM)
                .input('$', Items.STICK)
                .criterion(hasItem(ModItems.TITANIUM),
                        conditionsFromItem(ModItems.TITANIUM))
                .criterion(hasItem(Items.STICK),
                        conditionsFromItem(Items.STICK))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.TITANIUM_HOE)
                .pattern("## ")
                .pattern(" $ ")
                .pattern(" $ ")
                .input('#', ModItems.TITANIUM)
                .input('$', Items.STICK)
                .criterion(hasItem(ModItems.TITANIUM),
                        conditionsFromItem(ModItems.TITANIUM))
                .criterion(hasItem(Items.STICK),
                        conditionsFromItem(Items.STICK))
                .offerTo(exporter);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS,
                ModItems.RUBY, RecipeCategory.DECORATIONS, ModBlocks.RUBY_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.RUBY_SWORD)
                .pattern(" # ")
                .pattern(" # ")
                .pattern(" $ ")
                .input('#', ModItems.RUBY)
                .input('$', Items.STICK)
                .criterion(hasItem(ModItems.RUBY),
                        conditionsFromItem(ModItems.RUBY))
                .criterion(hasItem(Items.STICK),
                        conditionsFromItem(Items.STICK))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.RUBY_AXE)
                .pattern("## ")
                .pattern("#$ ")
                .pattern(" $ ")
                .input('#', ModItems.RUBY)
                .input('$', Items.STICK)
                .criterion(hasItem(ModItems.RUBY),
                        conditionsFromItem(ModItems.RUBY))
                .criterion(hasItem(Items.STICK),
                        conditionsFromItem(Items.STICK))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.RUBY_PICKAXE)
                .pattern("###")
                .pattern(" $ ")
                .pattern(" $ ")
                .input('#', ModItems.RUBY)
                .input('$', Items.STICK)
                .criterion(hasItem(ModItems.RUBY),
                        conditionsFromItem(ModItems.RUBY))
                .criterion(hasItem(Items.STICK),
                        conditionsFromItem(Items.STICK))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.RUBY_SHOVEL)
                .pattern(" # ")
                .pattern(" $ ")
                .pattern(" $ ")
                .input('#', ModItems.RUBY)
                .input('$', Items.STICK)
                .criterion(hasItem(ModItems.RUBY),
                        conditionsFromItem(ModItems.RUBY))
                .criterion(hasItem(Items.STICK),
                        conditionsFromItem(Items.STICK))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.RUBY_HOE)
                .pattern("## ")
                .pattern(" $ ")
                .pattern(" $ ")
                .input('#', ModItems.RUBY)
                .input('$', Items.STICK)
                .criterion(hasItem(ModItems.RUBY),
                        conditionsFromItem(ModItems.RUBY))
                .criterion(hasItem(Items.STICK),
                        conditionsFromItem(Items.STICK))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RUBY_HELMET)
                .pattern("###")
                .pattern("# #")
                .input('#', ModItems.RUBY)
                .criterion(hasItem(ModItems.RUBY),
                        conditionsFromItem(ModItems.RUBY))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RUBY_LEGGINGS)
                .pattern("###")
                .pattern("# #")
                .pattern("# #")
                .input('#', ModItems.RUBY)
                .criterion(hasItem(ModItems.RUBY),
                        conditionsFromItem(ModItems.RUBY))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RUBY_CHESTPLATE)
                .pattern("# #")
                .pattern("###")
                .pattern("###")
                .input('#', ModItems.RUBY)
                .criterion(hasItem(ModItems.RUBY),
                        conditionsFromItem(ModItems.RUBY))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RUBY_BOOTS)
                .pattern("# #")
                .pattern("# #")
                .input('#', ModItems.RUBY)
                .criterion(hasItem(ModItems.RUBY),
                        conditionsFromItem(ModItems.RUBY))
                .offerTo(exporter);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS,
                ModItems.LIGNITE, RecipeCategory.DECORATIONS, ModBlocks.LIGNITE_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.METAL_DETECTOR)
                .pattern("#@#")
                .pattern(" ! ")
                .pattern("***")
                .input('#', ItemTags.PLANKS)
                .input('@', Items.GLASS)
                .input('!', Items.STICK)
                .input('*', ModItems.TITANIUM)
                .criterion(hasItem(Items.GLASS),
                        conditionsFromItem(Items.GLASS))
                .criterion(hasItem(ModItems.TITANIUM),
                        conditionsFromItem(ModItems.TITANIUM))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.STEEL_SWORD)
                .pattern(" # ")
                .pattern(" # ")
                .pattern(" $ ")
                .input('#', ModItems.STEEL_INGOT)
                .input('$', Items.STICK)
                .criterion(hasItem(ModItems.STEEL_INGOT),
                        conditionsFromItem(ModItems.STEEL_INGOT))
                .criterion(hasItem(Items.STICK),
                        conditionsFromItem(Items.STICK))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.STEEL_AXE)
                .pattern("## ")
                .pattern("#$ ")
                .pattern(" $ ")
                .input('#', ModItems.STEEL_INGOT)
                .input('$', Items.STICK)
                .criterion(hasItem(ModItems.STEEL_INGOT),
                        conditionsFromItem(ModItems.STEEL_INGOT))
                .criterion(hasItem(Items.STICK),
                        conditionsFromItem(Items.STICK))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.STEEL_PICKAXE)
                .pattern("###")
                .pattern(" $ ")
                .pattern(" $ ")
                .input('#', ModItems.STEEL_INGOT)
                .input('$', Items.STICK)
                .criterion(hasItem(ModItems.STEEL_INGOT),
                        conditionsFromItem(ModItems.STEEL_INGOT))
                .criterion(hasItem(Items.STICK),
                        conditionsFromItem(Items.STICK))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.STEEL_SHOVEL)
                .pattern(" # ")
                .pattern(" $ ")
                .pattern(" $ ")
                .input('#', ModItems.STEEL_INGOT)
                .input('$', Items.STICK)
                .criterion(hasItem(ModItems.STEEL_INGOT),
                        conditionsFromItem(ModItems.STEEL_INGOT))
                .criterion(hasItem(Items.STICK),
                        conditionsFromItem(Items.STICK))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.STEEL_HOE)
                .pattern("## ")
                .pattern(" $ ")
                .pattern(" $ ")
                .input('#', ModItems.STEEL_INGOT)
                .input('$', Items.STICK)
                .criterion(hasItem(ModItems.STEEL_INGOT),
                        conditionsFromItem(ModItems.STEEL_INGOT))
                .criterion(hasItem(Items.STICK),
                        conditionsFromItem(Items.STICK))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STEEL_HELMET)
                .pattern("###")
                .pattern("# #")
                .input('#', ModItems.STEEL_INGOT)
                .criterion(hasItem(ModItems.STEEL_INGOT),
                        conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STEEL_LEGGINGS)
                .pattern("###")
                .pattern("# #")
                .pattern("# #")
                .input('#', ModItems.STEEL_INGOT)
                .criterion(hasItem(ModItems.STEEL_INGOT),
                        conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STEEL_BOOTS)
                .pattern("# #")
                .pattern("# #")
                .input('#', ModItems.STEEL_INGOT)
                .criterion(hasItem(ModItems.STEEL_INGOT),
                        conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STEEL_CHESTPLATE)
                .pattern("# #")
                .pattern("###")
                .pattern("###")
                .input('#', ModItems.STEEL_INGOT)
                .criterion(hasItem(ModItems.STEEL_INGOT),
                        conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(exporter);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS,
                ModItems.STEEL_INGOT, RecipeCategory.DECORATIONS, ModBlocks.STEEL_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS,
                ModItems.RAW_STEEL, RecipeCategory.DECORATIONS, ModBlocks.RAW_STEEL_BLOCK);

        offerSmelting(exporter, List.of(ModItems.RAW_STEEL), RecipeCategory.MISC,
                ModItems.STEEL_INGOT, 3f, 200, "steel");
        offerBlasting(exporter, List.of(ModItems.RAW_STEEL), RecipeCategory.MISC,
                ModItems.STEEL_INGOT, 3f, 100, "steel");

        offerBlasting(exporter, List.of(Items.MILK_BUCKET), RecipeCategory.MISC,
                ModBlocks.CHEESE_BLOCK, 3f, 300, "cheese");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS,
                ModItems.CHEESE, RecipeCategory.DECORATIONS, ModBlocks.CHEESE_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.SANDWICH)
                .pattern("$$$")
                .pattern("***")
                .pattern("###")
                .input('#', Items.BREAD)
                .input('*', Items.COOKED_BEEF)
                .input('$', ModItems.CHEESE)
                .criterion(hasItem(ModItems.CHEESE),
                        conditionsFromItem(ModItems.CHEESE))
                .criterion(hasItem(Items.BREAD),
                        conditionsFromItem(Items.BREAD))
                .criterion(hasItem(Items.COOKED_BEEF),
                        conditionsFromItem(Items.COOKED_BEEF))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PALM_PLANKS, 4)
                .input(ModBlocks.STRIPPED_PALM_LOG)
                .criterion(hasItem(ModBlocks.STRIPPED_PALM_LOG),
                        conditionsFromItem(ModBlocks.STRIPPED_PALM_LOG))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModBlocks.PALM_PLANKS)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PALM_PLANKS, 4)
                .input(ModBlocks.PALM_LOG)
                .criterion(hasItem(ModBlocks.PALM_LOG),
                        conditionsFromItem(ModBlocks.PALM_LOG))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModBlocks.PALM_WOOD, 3)
                .pattern("##")
                .pattern("##")
                .input('#', ModBlocks.PALM_LOG)
                .criterion(hasItem(ModBlocks.PALM_LOG),
                        conditionsFromItem(ModBlocks.PALM_LOG))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModBlocks.STRIPPED_PALM_WOOD, 3)
                .pattern("##")
                .pattern("##")
                .input('#', ModBlocks.STRIPPED_PALM_LOG)
                .criterion(hasItem(ModBlocks.STRIPPED_PALM_LOG),
                        conditionsFromItem(ModBlocks.STRIPPED_PALM_LOG))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PALM_PLANKS, 4)
                .input(ModBlocks.PALM_WOOD)
                .criterion(hasItem(ModBlocks.PALM_WOOD),
                        conditionsFromItem(ModBlocks.PALM_WOOD))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PALM_PLANKS, 4)
                .input(ModBlocks.STRIPPED_PALM_WOOD)
                .criterion(hasItem(ModBlocks.STRIPPED_PALM_WOOD),
                        conditionsFromItem(ModBlocks.STRIPPED_PALM_WOOD))
                .offerTo(exporter);

        createDoorRecipe(ModBlocks.PALM_DOOR, Ingredient.ofItems(ModBlocks.PALM_PLANKS))
                .criterion(hasItem(ModBlocks.PALM_PLANKS),
                        conditionsFromItem(ModBlocks.PALM_PLANKS))
                .offerTo(exporter);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PALM_SLAB, ModBlocks.PALM_PLANKS);

        createStairsRecipe(ModBlocks.PALM_STAIRS, Ingredient.ofItems(ModBlocks.PALM_PLANKS))
                .criterion(hasItem(ModBlocks.PALM_PLANKS),
                        conditionsFromItem(ModBlocks.PALM_PLANKS))
                .offerTo(exporter);

        offerPressurePlateRecipe(exporter, ModBlocks.PALM_PRESSURE_PLATE, ModBlocks.PALM_PLANKS);

        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PALM_WALL, ModBlocks.PALM_PLANKS);

        createFenceRecipe(ModBlocks.PALM_FENCE, Ingredient.ofItems(ModBlocks.PALM_PLANKS))
                .criterion(hasItem(ModBlocks.PALM_PLANKS),
                        conditionsFromItem(ModBlocks.PALM_PLANKS))
                .offerTo(exporter);

        createFenceGateRecipe(ModBlocks.PALM_FENCE_GATE, Ingredient.ofItems(ModBlocks.PALM_PLANKS))
                .criterion(hasItem(ModBlocks.PALM_PLANKS),
                        conditionsFromItem(ModBlocks.PALM_PLANKS))
                .offerTo(exporter);

        createTrapdoorRecipe(ModBlocks.PALM_TRAPDOOR, Ingredient.ofItems(ModBlocks.PALM_PLANKS))
                .criterion(hasItem(ModBlocks.PALM_PLANKS),
                        conditionsFromItem(ModBlocks.PALM_PLANKS))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PALM_BUTTON)
                .input(ModBlocks.PALM_PLANKS)
                .criterion(hasItem(ModBlocks.PALM_PLANKS),
                        conditionsFromItem(ModBlocks.PALM_PLANKS))
                .offerTo(exporter);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS,
                ModItems.MAGMA_SHARD, RecipeCategory.DECORATIONS, Blocks.MAGMA_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MAGMA_INGOT)
                .pattern("##")
                .pattern("##")
                .input('#', ModItems.MAGMA_SHARD)
                .criterion(hasItem(ModItems.MAGMA_SHARD),
                        conditionsFromItem(ModItems.MAGMA_SHARD))
                .offerTo(exporter);
    }
}
