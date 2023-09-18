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
                ModItems.TITANIUM, 3f,200,"titanium");
        offerBlasting(exporter, List.of(ModItems.RAW_TITANIUM), RecipeCategory.MISC,
                ModItems.TITANIUM, 3f,100,"titanium");

        offerSmelting(exporter, List.of(ModBlocks.TITANIUM_ORE), RecipeCategory.MISC,
                ModItems.TITANIUM, 3f,200,"titanium");
        offerBlasting(exporter, List.of(ModBlocks.TITANIUM_ORE), RecipeCategory.MISC,
                ModItems.TITANIUM, 3f,100,"titanium");

        offerSmelting(exporter, List.of(ModBlocks.DEEPSLATE_TITANIUM_ORE), RecipeCategory.MISC,
                ModItems.TITANIUM, 3f,200,"titanium");
        offerBlasting(exporter, List.of(ModBlocks.DEEPSLATE_TITANIUM_ORE), RecipeCategory.MISC,
                ModItems.TITANIUM, 3f,100,"titanium");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS,
                ModItems.TITANIUM, RecipeCategory.DECORATIONS, ModBlocks.TITANIUM_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS,
                ModItems.RAW_TITANIUM, RecipeCategory.DECORATIONS, ModBlocks.RAW_TITANIUM_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TITANIUM_HELMET)
                .pattern("###")
                .pattern("# #")
                .input('#', ModItems.TITANIUM)
                .criterion(FabricRecipeProvider.hasItem(ModItems.TITANIUM),
                        FabricRecipeProvider.conditionsFromItem(ModItems.TITANIUM))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.TITANIUM_HELMET)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TITANIUM_LEGGINGS)
                .pattern("###")
                .pattern("# #")
                .pattern("# #")
                .input('#', ModItems.TITANIUM)
                .criterion(FabricRecipeProvider.hasItem(ModItems.TITANIUM),
                        FabricRecipeProvider.conditionsFromItem(ModItems.TITANIUM))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.TITANIUM_LEGGINGS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TITANIUM_CHESTPLATE)
                .pattern("# #")
                .pattern("###")
                .pattern("###")
                .input('#', ModItems.TITANIUM)
                .criterion(FabricRecipeProvider.hasItem(ModItems.TITANIUM),
                        FabricRecipeProvider.conditionsFromItem(ModItems.TITANIUM))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.TITANIUM_CHESTPLATE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TITANIUM_BOOTS)
                .pattern("# #")
                .pattern("# #")
                .input('#', ModItems.TITANIUM)
                .criterion(FabricRecipeProvider.hasItem(ModItems.TITANIUM),
                        FabricRecipeProvider.conditionsFromItem(ModItems.TITANIUM))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.TITANIUM_BOOTS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.TITANIUM_SWORD)
                .pattern(" # ")
                .pattern(" # ")
                .pattern(" $ ")
                .input('#', ModItems.TITANIUM)
                .input('$', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.TITANIUM),
                        FabricRecipeProvider.conditionsFromItem(ModItems.TITANIUM))
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.TITANIUM_SWORD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.TITANIUM_AXE)
                .pattern("## ")
                .pattern("#$ ")
                .pattern(" $ ")
                .input('#', ModItems.TITANIUM)
                .input('$', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.TITANIUM),
                        FabricRecipeProvider.conditionsFromItem(ModItems.TITANIUM))
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.TITANIUM_AXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.TITANIUM_PICKAXE)
                .pattern("###")
                .pattern(" $ ")
                .pattern(" $ ")
                .input('#', ModItems.TITANIUM)
                .input('$', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.TITANIUM),
                        FabricRecipeProvider.conditionsFromItem(ModItems.TITANIUM))
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.TITANIUM_PICKAXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.TITANIUM_SHOVEL)
                .pattern(" # ")
                .pattern(" $ ")
                .pattern(" $ ")
                .input('#', ModItems.TITANIUM)
                .input('$', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.TITANIUM),
                        FabricRecipeProvider.conditionsFromItem(ModItems.TITANIUM))
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.TITANIUM_SHOVEL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.TITANIUM_HOE)
                .pattern("## ")
                .pattern(" $ ")
                .pattern(" $ ")
                .input('#', ModItems.TITANIUM)
                .input('$', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.TITANIUM),
                        FabricRecipeProvider.conditionsFromItem(ModItems.TITANIUM))
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.TITANIUM_HOE)));

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS,
                ModItems.RUBY, RecipeCategory.DECORATIONS, ModBlocks.RUBY_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.RUBY_SWORD)
                .pattern(" # ")
                .pattern(" # ")
                .pattern(" $ ")
                .input('#', ModItems.RUBY)
                .input('$', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.RUBY),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RUBY))
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.RUBY_SWORD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.RUBY_AXE)
                .pattern("## ")
                .pattern("#$ ")
                .pattern(" $ ")
                .input('#', ModItems.RUBY)
                .input('$', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.RUBY),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RUBY))
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.RUBY_AXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.RUBY_PICKAXE)
                .pattern("###")
                .pattern(" $ ")
                .pattern(" $ ")
                .input('#', ModItems.RUBY)
                .input('$', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.RUBY),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RUBY))
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.RUBY_PICKAXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.RUBY_SHOVEL)
                .pattern(" # ")
                .pattern(" $ ")
                .pattern(" $ ")
                .input('#', ModItems.RUBY)
                .input('$', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.RUBY),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RUBY))
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.RUBY_SHOVEL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.RUBY_HOE)
                .pattern("## ")
                .pattern(" $ ")
                .pattern(" $ ")
                .input('#', ModItems.RUBY)
                .input('$', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.RUBY),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RUBY))
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.RUBY_HOE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RUBY_HELMET)
                .pattern("###")
                .pattern("# #")
                .input('#', ModItems.RUBY)
                .criterion(FabricRecipeProvider.hasItem(ModItems.RUBY),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RUBY))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.RUBY_HELMET)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RUBY_LEGGINGS)
                .pattern("###")
                .pattern("# #")
                .pattern("# #")
                .input('#', ModItems.RUBY)
                .criterion(FabricRecipeProvider.hasItem(ModItems.RUBY),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RUBY))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.RUBY_LEGGINGS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RUBY_CHESTPLATE)
                .pattern("# #")
                .pattern("###")
                .pattern("###")
                .input('#', ModItems.RUBY)
                .criterion(FabricRecipeProvider.hasItem(ModItems.RUBY),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RUBY))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.RUBY_CHESTPLATE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RUBY_BOOTS)
                .pattern("# #")
                .pattern("# #")
                .input('#', ModItems.RUBY)
                .criterion(FabricRecipeProvider.hasItem(ModItems.RUBY),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RUBY))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.RUBY_BOOTS)));

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
                .criterion(FabricRecipeProvider.hasItem(Items.GLASS),
                        FabricRecipeProvider.conditionsFromItem(Items.GLASS))
                .criterion(FabricRecipeProvider.hasItem(ModItems.TITANIUM),
                        FabricRecipeProvider.conditionsFromItem(ModItems.TITANIUM))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.METAL_DETECTOR)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.STEEL_SWORD)
                .pattern(" # ")
                .pattern(" # ")
                .pattern(" $ ")
                .input('#', ModItems.STEEL_INGOT)
                .input('$', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.STEEL_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.STEEL_INGOT))
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.STEEL_SWORD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.STEEL_AXE)
                .pattern("## ")
                .pattern("#$ ")
                .pattern(" $ ")
                .input('#', ModItems.STEEL_INGOT)
                .input('$', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.STEEL_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.STEEL_INGOT))
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.STEEL_AXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.STEEL_PICKAXE)
                .pattern("###")
                .pattern(" $ ")
                .pattern(" $ ")
                .input('#', ModItems.STEEL_INGOT)
                .input('$', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.STEEL_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.STEEL_INGOT))
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.STEEL_PICKAXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.STEEL_SHOVEL)
                .pattern(" # ")
                .pattern(" $ ")
                .pattern(" $ ")
                .input('#', ModItems.STEEL_INGOT)
                .input('$', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.STEEL_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.STEEL_INGOT))
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.STEEL_SHOVEL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.STEEL_HOE)
                .pattern("## ")
                .pattern(" $ ")
                .pattern(" $ ")
                .input('#', ModItems.STEEL_INGOT)
                .input('$', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.STEEL_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.STEEL_INGOT))
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.STEEL_HOE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STEEL_HELMET)
                .pattern("###")
                .pattern("# #")
                .input('#', ModItems.STEEL_INGOT)
                .criterion(FabricRecipeProvider.hasItem(ModItems.STEEL_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.STEEL_HELMET)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STEEL_LEGGINGS)
                .pattern("###")
                .pattern("# #")
                .pattern("# #")
                .input('#', ModItems.STEEL_INGOT)
                .criterion(FabricRecipeProvider.hasItem(ModItems.STEEL_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.STEEL_LEGGINGS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STEEL_BOOTS)
                .pattern("# #")
                .pattern("# #")
                .input('#', ModItems.STEEL_INGOT)
                .criterion(FabricRecipeProvider.hasItem(ModItems.STEEL_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.STEEL_BOOTS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STEEL_CHESTPLATE)
                .pattern("# #")
                .pattern("###")
                .pattern("###")
                .input('#', ModItems.STEEL_INGOT)
                .criterion(FabricRecipeProvider.hasItem(ModItems.STEEL_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.STEEL_CHESTPLATE)));

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS,
                ModItems.STEEL_INGOT, RecipeCategory.DECORATIONS, ModBlocks.STEEL_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS,
                ModItems.RAW_STEEL, RecipeCategory.DECORATIONS, ModBlocks.RAW_STEEL_BLOCK);

        offerSmelting(exporter, List.of(ModItems.RAW_STEEL), RecipeCategory.MISC,
                ModItems.STEEL_INGOT, 3f,200,"steel");
        offerBlasting(exporter, List.of(ModItems.RAW_STEEL), RecipeCategory.MISC,
                ModItems.STEEL_INGOT, 3f,100,"steel");

        offerBlasting(exporter, List.of(Items.MILK_BUCKET), RecipeCategory.MISC,
                ModBlocks.CHEESE_BLOCK, 3f,300,"cheese");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS,
                ModItems.CHEESE, RecipeCategory.DECORATIONS, ModBlocks.CHEESE_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.SANDWICH)
                .pattern("$$$")
                .pattern("***")
                .pattern("###")
                .input('#', Items.BREAD)
                .input('*', Items.COOKED_BEEF)
                .input('$', ModItems.CHEESE)
                .criterion(FabricRecipeProvider.hasItem(ModItems.CHEESE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.CHEESE))
                .criterion(FabricRecipeProvider.hasItem(Items.BREAD),
                        FabricRecipeProvider.conditionsFromItem(Items.BREAD))
                .criterion(FabricRecipeProvider.hasItem(Items.COOKED_BEEF),
                        FabricRecipeProvider.conditionsFromItem(Items.COOKED_BEEF))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.SANDWICH)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PALM_PLANKS, 4)
                .input(ModBlocks.STRIPPED_PALM_LOG)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.STRIPPED_PALM_LOG),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.STRIPPED_PALM_LOG))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModBlocks.PALM_PLANKS)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PALM_PLANKS, 4)
                .input(ModBlocks.PALM_LOG)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.PALM_LOG),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.PALM_LOG))
                .offerTo(exporter, new Identifier("palm_planks_from_palm_log", "pal_planks_from_palm_log"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModBlocks.PALM_WOOD, 3)
                .pattern("##")
                .pattern("##")
                .input('#', ModBlocks.PALM_LOG)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.PALM_LOG),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.PALM_LOG))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModBlocks.PALM_WOOD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModBlocks.STRIPPED_PALM_WOOD, 3)
                .pattern("##")
                .pattern("##")
                .input('#', ModBlocks.STRIPPED_PALM_LOG)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.STRIPPED_PALM_LOG),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.STRIPPED_PALM_LOG))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModBlocks.STRIPPED_PALM_WOOD)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PALM_PLANKS, 4)
                .input(ModBlocks.PALM_WOOD)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.PALM_WOOD),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.PALM_WOOD))
                .offerTo(exporter, new Identifier("palm_planks_from_palm_wood", "palm_planks_from_palm_wood"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PALM_PLANKS, 4)
                .input(ModBlocks.STRIPPED_PALM_WOOD)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.STRIPPED_PALM_WOOD),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.STRIPPED_PALM_WOOD))
                .offerTo(exporter, new Identifier("palm_planks_from_stripped_palm_wood", "palm_planks_from_stripped_palm_wood"));

        createDoorRecipe(ModBlocks.PALM_DOOR, Ingredient.ofItems(ModBlocks.PALM_PLANKS))
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.PALM_PLANKS),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.PALM_PLANKS))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModBlocks.PALM_DOOR)));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PALM_SLAB, ModBlocks.PALM_PLANKS);

        createStairsRecipe(ModBlocks.PALM_STAIRS, Ingredient.ofItems(ModBlocks.PALM_PLANKS))
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.PALM_PLANKS),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.PALM_PLANKS))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModBlocks.PALM_STAIRS)));

        offerPressurePlateRecipe(exporter, ModBlocks.PALM_PRESSURE_PLATE, ModBlocks.PALM_PLANKS);

        offerWallRecipe(exporter,RecipeCategory.BUILDING_BLOCKS , ModBlocks.PALM_WALL, ModBlocks.PALM_PLANKS);

        createFenceRecipe(ModBlocks.PALM_FENCE, Ingredient.ofItems(ModBlocks.PALM_PLANKS))
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.PALM_PLANKS),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.PALM_PLANKS))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModBlocks.PALM_FENCE)));

        createFenceGateRecipe(ModBlocks.PALM_FENCE_GATE, Ingredient.ofItems(ModBlocks.PALM_PLANKS))
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.PALM_PLANKS),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.PALM_PLANKS))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModBlocks.PALM_FENCE_GATE)));

        createTrapdoorRecipe(ModBlocks.PALM_TRAPDOOR, Ingredient.ofItems(ModBlocks.PALM_PLANKS))
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.PALM_PLANKS),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.PALM_PLANKS))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModBlocks.PALM_TRAPDOOR)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PALM_BUTTON)
                .input(ModBlocks.PALM_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.PALM_PLANKS),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.PALM_PLANKS))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModBlocks.PALM_BUTTON)));

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS,
                ModItems.MAGMA_SHARD, RecipeCategory.DECORATIONS, Blocks.MAGMA_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MAGMA_INGOT, 1)
                .pattern("##")
                .pattern("##")
                .input('#', ModItems.MAGMA_SHARD)
                .criterion(FabricRecipeProvider.hasItem(ModItems.MAGMA_SHARD),
                        FabricRecipeProvider.conditionsFromItem(ModItems.MAGMA_SHARD))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.MAGMA_INGOT)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.NETHERITE_RING)
                .pattern(" # ")
                .pattern("# #")
                .pattern(" # ")
                .input('#', Items.NETHERITE_INGOT)
                .criterion(FabricRecipeProvider.hasItem(Items.NETHERITE_INGOT),
                        FabricRecipeProvider.conditionsFromItem(Items.NETHERITE_INGOT))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.NETHERITE_RING)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.EMERALD_RING)
                .pattern("###")
                .pattern("#$#")
                .pattern("###")
                .input('#', Items.EMERALD)
                .input('$', ModItems.NETHERITE_RING)
                .criterion(FabricRecipeProvider.hasItem(Items.EMERALD),
                        FabricRecipeProvider.conditionsFromItem(Items.EMERALD))
                .criterion(FabricRecipeProvider.hasItem(ModItems.NETHERITE_RING),
                        FabricRecipeProvider.conditionsFromItem(ModItems.NETHERITE_RING))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.EMERALD_RING)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.RUBY_RING)
                .pattern("###")
                .pattern("#$#")
                .pattern("###")
                .input('#', ModItems.RUBY)
                .input('$', ModItems.NETHERITE_RING)
                .criterion(FabricRecipeProvider.hasItem(ModItems.RUBY),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RUBY))
                .criterion(FabricRecipeProvider.hasItem(ModItems.NETHERITE_RING),
                        FabricRecipeProvider.conditionsFromItem(ModItems.NETHERITE_RING))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.RUBY_RING)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.DIAMOND_RING)
                .pattern("###")
                .pattern("#$#")
                .pattern("###")
                .input('#', Items.DIAMOND)
                .input('$', ModItems.NETHERITE_RING)
                .criterion(FabricRecipeProvider.hasItem(Items.DIAMOND),
                        FabricRecipeProvider.conditionsFromItem(Items.DIAMOND))
                .criterion(FabricRecipeProvider.hasItem(ModItems.NETHERITE_RING),
                        FabricRecipeProvider.conditionsFromItem(ModItems.NETHERITE_RING))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.DIAMOND_RING)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.MAGMA_RING)
                .pattern("###")
                .pattern("#$#")
                .pattern("###")
                .input('#', ModItems.MAGMA_INGOT)
                .input('$', ModItems.NETHERITE_RING)
                .criterion(FabricRecipeProvider.hasItem(ModItems.MAGMA_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.MAGMA_INGOT))
                .criterion(FabricRecipeProvider.hasItem(ModItems.NETHERITE_RING),
                        FabricRecipeProvider.conditionsFromItem(ModItems.NETHERITE_RING))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.MAGMA_RING)));
    }
}
