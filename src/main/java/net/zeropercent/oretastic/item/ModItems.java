package net.zeropercent.oretastic.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Colors;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.zeropercent.oretastic.OreTastic;
import net.zeropercent.oretastic.entity.ModEntities;
import net.zeropercent.oretastic.fluid.ModFluids;
import net.zeropercent.oretastic.item.custom.*;

public class ModItems {
    public static final Item TITANIUM = registerItem("titanium",
        new Item(new FabricItemSettings()));

    public static final Item RAW_TITANIUM = registerItem("raw_titanium",
            new Item(new FabricItemSettings()));

    public static final Item TITANIUM_BOOTS = registerItem("titanium_boots",
            new ArmorItem(ModArmorMaterials.TITANIUM, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    public static final Item TITANIUM_LEGGINGS = registerItem("titanium_leggings",
            new ArmorItem(ModArmorMaterials.TITANIUM, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item TITANIUM_CHESTPLATE = registerItem("titanium_chestplate",
            new ArmorItem(ModArmorMaterials.TITANIUM, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item TITANIUM_HELMET = registerItem("titanium_helmet",
            new ArmorItem(ModArmorMaterials.TITANIUM, ArmorItem.Type.HELMET, new FabricItemSettings()));

    public static final Item TITANIUM_SWORD = registerItem("titanium_sword",
            new SwordItem(ModToolMaterials.TITANIUM, 3, -2.4f, new FabricItemSettings()));
    public static final Item TITANIUM_AXE = registerItem("titanium_axe",
            new AxeItem(ModToolMaterials.TITANIUM, 5,-3.0f , new FabricItemSettings()));
    public static final Item TITANIUM_PICKAXE = registerItem("titanium_pickaxe",
            new PickaxeItem(ModToolMaterials.TITANIUM, 1,-2.8f, new FabricItemSettings()));
    public static final Item TITANIUM_SHOVEL = registerItem("titanium_shovel",
            new ShovelItem(ModToolMaterials.TITANIUM, 1.5f, -3.0f, new FabricItemSettings()));
    public static final Item TITANIUM_HOE = registerItem("titanium_hoe",
            new HoeItem(ModToolMaterials.TITANIUM, -3, 0f, new FabricItemSettings()));

    public static final Item RUBY = registerItem("ruby",
            new Item(new FabricItemSettings()));

    public static final Item RUBY_SWORD = registerItem("ruby_sword",
            new SwordItem(ModToolMaterials.RUBY, 3, -2.4f, new FabricItemSettings()));
    public static final Item RUBY_AXE = registerItem("ruby_axe",
            new AxeItem(ModToolMaterials.RUBY, 5,-3.0f , new FabricItemSettings()));
    public static final Item RUBY_PICKAXE = registerItem("ruby_pickaxe",
            new PickaxeItem(ModToolMaterials.RUBY, 1,-2.8f, new FabricItemSettings()));
    public static final Item RUBY_SHOVEL = registerItem("ruby_shovel",
            new ShovelItem(ModToolMaterials.RUBY, 1.5f, -3.0f, new FabricItemSettings()));
    public static final Item RUBY_HOE = registerItem("ruby_hoe",
            new HoeItem(ModToolMaterials.RUBY, -3, 0f, new FabricItemSettings()));

    public static final Item RUBY_BOOTS = registerItem("ruby_boots",
            new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    public static final Item RUBY_LEGGINGS = registerItem("ruby_leggings",
            new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item RUBY_CHESTPLATE = registerItem("ruby_chestplate",
            new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item RUBY_HELMET = registerItem("ruby_helmet",
            new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.HELMET, new FabricItemSettings()));

    public static final Item LIGNITE = registerItem("lignite",
            new Item(new FabricItemSettings()));

    public static final Item METAL_DETECTOR = registerItem("metal_detector",
            new MetalDetectorItem(new FabricItemSettings().maxDamage(64)));

    public static final Item STEEL_INGOT = registerItem("steel_ingot",
            new Item(new FabricItemSettings()));

    public static final Item RAW_STEEL = registerItem("raw_steel",
            new Item(new FabricItemSettings()));

    public static final Item STEEL_BOOTS = registerItem("steel_boots",
            new ArmorItem(ModArmorMaterials.STEEL, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    public static final Item STEEL_LEGGINGS = registerItem("steel_leggings",
            new ArmorItem(ModArmorMaterials.STEEL, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item STEEL_CHESTPLATE = registerItem("steel_chestplate",
            new ArmorItem(ModArmorMaterials.STEEL, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item STEEL_HELMET = registerItem("steel_helmet",
            new ArmorItem(ModArmorMaterials.STEEL, ArmorItem.Type.HELMET, new FabricItemSettings()));

    public static final Item STEEL_SWORD = registerItem("steel_sword",
            new SwordItem(ModToolMaterials.STEEL, 3, -2.4f, new FabricItemSettings()));
    public static final Item STEEL_AXE = registerItem("steel_axe",
            new AxeItem(ModToolMaterials.STEEL, 5,-3.0f , new FabricItemSettings()));
    public static final Item STEEL_PICKAXE = registerItem("steel_pickaxe",
            new PickaxeItem(ModToolMaterials.STEEL, 1,-2.8f, new FabricItemSettings()));
    public static final Item STEEL_SHOVEL = registerItem("steel_shovel",
            new ShovelItem(ModToolMaterials.STEEL, 1.5f, -3.0f, new FabricItemSettings()));
    public static final Item STEEL_HOE = registerItem("steel_hoe",
            new HoeItem(ModToolMaterials.STEEL, -3, 0f, new FabricItemSettings()));
    public static final Item CHEESE = registerItem("cheese",
            new Item(new FabricItemSettings().food(ModFoodComponents.CHEESE)));
    public static final Item SANDWICH = registerItem("sandwich",
            new Item(new FabricItemSettings().food(ModFoodComponents.SANDWICH)));

    public static final Item OIL_BUCKET = registerItem("oil_bucket",
            new BucketItem(ModFluids.OIL_STILL, new FabricItemSettings().maxCount(1)));

    public static final Item MAGMA_SHARD = registerItem("magma_shard",
            new Item(new FabricItemSettings()));

    public static final Item MAGMA_INGOT = registerItem("magma_ingot",
            new Item(new FabricItemSettings()));

    public static final Item NETHERITE_RING = registerItem("netherite_ring",
            new NetheriteRing(new FabricItemSettings().maxCount(1)));


    public static final Item EMERALD_RING = registerItem("emerald_ring",
            new EmeraldRing(new FabricItemSettings().maxCount(1)));

    public static final Item RUBY_RING = registerItem("ruby_ring",
            new RubyRing(new FabricItemSettings().maxCount(1)));

    public static final Item DIAMOND_RING = registerItem("diamond_ring",
            new DiamondRing(new FabricItemSettings().maxCount(1)));

    public static final Item MAGMA_RING = registerItem("magma_ring",
            new MagmaRing(new FabricItemSettings().maxCount(1)));

    public static final Item TITANIUM_RING = registerItem("titanium_ring",
            new TitaniumRing(new FabricItemSettings().maxCount(1)));

    public static final Item STEEL_RING = registerItem("steel_ring",
            new SteelRing(new FabricItemSettings().maxCount(1)));

    public static final Item GOLD_RING = registerItem("gold_ring",
            new GoldRing(new FabricItemSettings().maxCount(1)));

    public static final Item COPPER_RING = registerItem("copper_ring",
            new CopperRing(new FabricItemSettings().maxCount(1)));

    public static final Item ULTIMATE_RING = registerItem("ultimate_ring",
            new UltimateRing(new FabricItemSettings().maxCount(1)));

    public static final Item NETHER_BOOK = registerItem("nether_book",
            new WrittenBookItem(new FabricItemSettings().maxCount(1).fireproof().rarity(Rarity.EPIC)));

    public static final Item FROST_ELEMENTAL_SPAWN_EGG = registerItem("frost_elemental_spawn_egg",
            new SpawnEggItem(ModEntities.FROST_ELEMENTAL, 1001033, 9433559, new FabricItemSettings()));

    public static final Item STONE_VILLAGER_SPAWN_EGG = registerItem("stone_vilager_spawn_egg",
            new SpawnEggItem(ModEntities.STONE_VILLAGER, 999999, 535353, new FabricItemSettings()));

    //public static final Item ICE_GOBLIN_SPAWN_EGG = registerItem("ice_goblin_spawn_egg",
            //new SpawnEggItem(ModEntities.ICE_GOBLIN, 92176255, 255255255, new FabricItemSettings()));

    public static final Item PORCUPINE_SPAWN_EGG = registerItem("porcupine_spawn_egg",
            new SpawnEggItem(ModEntities.PORCUPINE, 0xa86518, 0x3b260f, new FabricItemSettings()));
    public static final Item FORGE_KEY = registerItem("forge_key",
            new Item(new FabricItemSettings().maxCount(1)));

    public static Item registerItem(String name, Item item){
        return  Registry.register(Registries.ITEM, new Identifier(OreTastic.MOD_ID, name), item);
    }

    public static void registerModItems(){
        OreTastic.LOGGER.info("Registering Mod Items For "+ OreTastic.MOD_ID);
    }
}
