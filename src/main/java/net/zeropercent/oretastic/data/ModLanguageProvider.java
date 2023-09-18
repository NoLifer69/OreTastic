package net.zeropercent.oretastic.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.zeropercent.oretastic.block.ModBlocks;
import net.zeropercent.oretastic.enchantment.ModEnchantments;
import net.zeropercent.oretastic.item.ModItems;
import net.zeropercent.oretastic.item.ModItemGroup;

import java.nio.file.Path;

public class ModLanguageProvider extends FabricLanguageProvider {
    public ModLanguageProvider(FabricDataOutput dataOutput) {
        super(dataOutput, "en_us");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add(ModItems.TITANIUM, "Titanium Ingot");
        translationBuilder.add(ModItems.RAW_TITANIUM, "Raw Titanium");
        translationBuilder.add(ModItems.STEEL_INGOT, "Steel Ingot");
        translationBuilder.add(ModItems.RAW_STEEL, "Raw Steel");
        translationBuilder.add(ModItems.RUBY, "Ruby");
        translationBuilder.add(ModItems.LIGNITE, "Lignite");
        translationBuilder.add(ModItems.STONE_VILLAGER_SPAWN_EGG, "Stone Villager Spawn Egg");
        translationBuilder.add(ModItems.METAL_DETECTOR, "Metal Detector");

        translationBuilder.add("itemgroup.oretastic","OreTastic");

        translationBuilder.add(ModItems.TITANIUM_HELMET, "Titanium Helmet");
        translationBuilder.add(ModItems.TITANIUM_CHESTPLATE, "Titanium Chestplate");
        translationBuilder.add(ModItems.TITANIUM_LEGGINGS, "Titanium Leggings");
        translationBuilder.add(ModItems.TITANIUM_BOOTS, "Titanium Boots");
        translationBuilder.add(ModItems.RUBY_HELMET, "Ruby Helmet");
        translationBuilder.add(ModItems.RUBY_CHESTPLATE, "Ruby Chestplate");
        translationBuilder.add(ModItems.RUBY_LEGGINGS, "Ruby Leggings");
        translationBuilder.add(ModItems.RUBY_BOOTS, "Ruby Boots");
        translationBuilder.add(ModItems.STEEL_HELMET, "Steel Helmet");
        translationBuilder.add(ModItems.STEEL_CHESTPLATE, "Steel Chestplate");
        translationBuilder.add(ModItems.STEEL_LEGGINGS, "Steel Leggings");
        translationBuilder.add(ModItems.STEEL_BOOTS, "Steel Boots");

        translationBuilder.add(ModItems.TITANIUM_SWORD, "Titanium Sword");
        translationBuilder.add(ModItems.TITANIUM_AXE, "Titanium Axe");
        translationBuilder.add(ModItems.TITANIUM_PICKAXE, "Titanium Pickaxe");
        translationBuilder.add(ModItems.TITANIUM_SHOVEL, "Titanium Shovel");
        translationBuilder.add(ModItems.TITANIUM_HOE, "Titanium Hoe");
        translationBuilder.add(ModItems.RUBY_SWORD, "Ruby Sword");
        translationBuilder.add(ModItems.RUBY_AXE, "Ruby Axe");
        translationBuilder.add(ModItems.RUBY_PICKAXE, "Ruby Pickaxe");
        translationBuilder.add(ModItems.RUBY_SHOVEL, "Ruby Shovel");
        translationBuilder.add(ModItems.RUBY_HOE, "Ruby Hoe");
        translationBuilder.add(ModItems.STEEL_SWORD, "Steel Sword");
        translationBuilder.add(ModItems.STEEL_AXE, "Steel Axe");
        translationBuilder.add(ModItems.STEEL_PICKAXE, "Steel Pickaxe");
        translationBuilder.add(ModItems.STEEL_SHOVEL, "Steel Shovel");
        translationBuilder.add(ModItems.STEEL_HOE, "Steel Hoe");
        translationBuilder.add(ModItems.CHEESE, "Cheese");
        translationBuilder.add(ModItems.SANDWICH, "Sandwich");

        translationBuilder.add(ModBlocks.TITANIUM_BLOCK, "Block Of Titanium");
        translationBuilder.add(ModBlocks.RAW_TITANIUM_BLOCK, "Block Of Raw Titanium");
        translationBuilder.add(ModBlocks.TITANIUM_ORE, "Titanium Ore");
        translationBuilder.add(ModBlocks.DEEPSLATE_TITANIUM_ORE, "Deepslate Titanium Ore");
        translationBuilder.add(ModBlocks.RUBY_BLOCK, "Block Of Ruby");
        translationBuilder.add(ModBlocks.RUBY_ORE, "Ruby Ore");
        translationBuilder.add(ModBlocks.DEEPSLATE_RUBY_ORE, "Deepslate Ruby Ore");
        translationBuilder.add(ModBlocks.LIGNITE_BLOCK, "Block Of Lignite");
        translationBuilder.add(ModBlocks.LIGNITE_ORE, "Lignite Ore");
        translationBuilder.add(ModBlocks.DEEPSLATE_LIGNITE_ORE, "Deepslate Lignite Ore");
        translationBuilder.add(ModBlocks.STEEL_BLOCK, "Block Of Steel");
        translationBuilder.add(ModBlocks.RAW_STEEL_BLOCK, "Block Of Raw Steel");
        translationBuilder.add(ModBlocks.STEEL_ORE, "Steel Ore");
        translationBuilder.add(ModBlocks.DEEPSLATE_STEEL_ORE, "Deepslate Steel Ore");
        translationBuilder.add(ModBlocks.CHEESE_BLOCK, "Block Of Cheese");
        translationBuilder.add(ModBlocks.PALM_LEAVES, "Palm Leaves");
        translationBuilder.add(ModBlocks.PALM_LOG, "Palm Log");
        translationBuilder.add(ModBlocks.PALM_PLANKS, "Palm Planks");
        translationBuilder.add(ModBlocks.PALM_WOOD, "Palm Wood");
        translationBuilder.add(ModBlocks.PALM_SAPLING, "Palm Sapling");
        translationBuilder.add(ModBlocks.STRIPPED_PALM_LOG, "Stripped Palm Log");
        translationBuilder.add(ModBlocks.STRIPPED_PALM_WOOD, "Stripped Palm Wood");
        translationBuilder.add(ModBlocks.PALM_STAIRS, "Palm Stairs");
        translationBuilder.add(ModBlocks.PALM_SLAB, "Palm Slab");
        translationBuilder.add(ModBlocks.PALM_BUTTON, "Palm Button");
        translationBuilder.add(ModBlocks.PALM_FENCE, "Palm Fence");
        translationBuilder.add(ModBlocks.PALM_FENCE_GATE, "Palm Fence Gate");
        translationBuilder.add(ModBlocks.PALM_PRESSURE_PLATE, "Palm Pressure Plate");
        translationBuilder.add(ModBlocks.PALM_DOOR, "Palm Door");
        translationBuilder.add(ModBlocks.PALM_WALL, "Palm Wall");
        translationBuilder.add(ModBlocks.PALM_TRAPDOOR, "Palm Trapdoor");

        translationBuilder.add(ModItems.MAGMA_SHARD, "Magma Shard");
        translationBuilder.add(ModItems.MAGMA_INGOT, "Magma Ingot");
        translationBuilder.add(ModBlocks.NETHERRACK_MAGMA_ORE, "Netherrack Magma Ore");
        translationBuilder.add(ModBlocks.SOUL_SAND_MAGMA_ORE, "Soul Sand Magma Ore");

        translationBuilder.add(ModItems.OIL_BUCKET, "Oil Bucket");

        translationBuilder.add(ModEnchantments.LIGHTING_STRIKER, "Lighting Striker");

        translationBuilder.add(ModItems.NETHERITE_RING, "Netherite Ring");
        translationBuilder.add(ModItems.EMERALD_RING, "Emerald Ring");
        translationBuilder.add(ModItems.RUBY_RING, "Ruby Ring");
        translationBuilder.add(ModItems.DIAMOND_RING, "Diamond Ring");
        translationBuilder.add(ModItems.MAGMA_RING, "Magma Ring");
        translationBuilder.add(ModItems.TITANIUM_RING, "Titanium Ring");
        translationBuilder.add(ModItems.STEEL_RING, "Steel Ring");
        translationBuilder.add(ModItems.GOLD_RING, "Gold Ring");
        translationBuilder.add(ModItems.COPPER_RING, "Copper Ring");
        translationBuilder.add(ModItems.ULTIMATE_RING, "The Ultimate Ring");

        translationBuilder.add("trim_material.oretastic.magma", "Magma Material");
        translationBuilder.add("trim_material.oretastic.ruby", "Ruby Material");
        translationBuilder.add("trim_material.oretastic.titanium", "Titanium Material");
        translationBuilder.add("trim_material.oretastic.steel", "Steel Material");

        translationBuilder.add("entity.oretastic.stone_villager.toolsmith", "Stone Toolsmith");
        translationBuilder.add("entity.oretastic.stone_villager.armorer", "Stone Armorer");
        translationBuilder.add("entity.oretastic.stone_villager.farmer", "Stone Farmer");
        translationBuilder.add("entity.oretastic.stone_villager.butcher", "Stone Butcher");
        translationBuilder.add("entity.oretastic.stone_villager.weaponsmith", "Stone Weaponsmith");
        translationBuilder.add("entity.oretastic.stone_villager.librarian", "Stone Librarian");
        translationBuilder.add("entity.oretastic.stone_villager.fisherman", "Stone Fisherman");
        translationBuilder.add("entity.oretastic.stone_villager.cartographer", "Stone Cartographer");
        translationBuilder.add("entity.oretastic.stone_villager.shepherd", "Stone Shepherd");

        translationBuilder.add("tooltip.oretastic.metal_detector.tooltip", "§eFinds Iron, Steel And Copper Ores In A 64 Block Depth.§r");
    }
}
