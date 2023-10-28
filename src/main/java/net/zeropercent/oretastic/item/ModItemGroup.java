package net.zeropercent.oretastic.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.zeropercent.oretastic.OreTastic;
import net.zeropercent.oretastic.block.ModBlocks;
import net.zeropercent.oretastic.enchantment.ModEnchantments;

public class ModItemGroup {
    public static ItemGroup ORETASTIC = Registry.register(Registries.ITEM_GROUP, new Identifier(OreTastic.MOD_ID, "oretastic"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.oretastic"))
                    .icon(() -> new ItemStack(ModItems.METAL_DETECTOR)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.TITANIUM_BLOCK);
                        entries.add(ModBlocks.RAW_TITANIUM_BLOCK);
                        entries.add(ModBlocks.TITANIUM_ORE);
                        entries.add(ModBlocks.DEEPSLATE_TITANIUM_ORE);

                        entries.add(ModItems.RAW_TITANIUM);
                        entries.add(ModItems.TITANIUM);

                        entries.add(ModItems.TITANIUM_SWORD);
                        entries.add(ModItems.TITANIUM_AXE);
                        entries.add(ModItems.TITANIUM_PICKAXE);
                        entries.add(ModItems.TITANIUM_SHOVEL);
                        entries.add(ModItems.TITANIUM_HOE);

                        entries.add(ModItems.TITANIUM_HELMET);
                        entries.add(ModItems.TITANIUM_CHESTPLATE);
                        entries.add(ModItems.TITANIUM_LEGGINGS);
                        entries.add(ModItems.TITANIUM_BOOTS);

                        entries.add(ModBlocks.RUBY_BLOCK);
                        entries.add(ModBlocks.RUBY_ORE);
                        entries.add(ModBlocks.DEEPSLATE_RUBY_ORE);

                        entries.add(ModItems.RUBY);

                        entries.add(ModItems.RUBY_SWORD);
                        entries.add(ModItems.RUBY_AXE);
                        entries.add(ModItems.RUBY_PICKAXE);
                        entries.add(ModItems.RUBY_SHOVEL);
                        entries.add(ModItems.RUBY_HOE);

                        entries.add(ModItems.RUBY_HELMET);
                        entries.add(ModItems.RUBY_CHESTPLATE);
                        entries.add(ModItems.RUBY_LEGGINGS);
                        entries.add(ModItems.RUBY_BOOTS);

                        entries.add(ModBlocks.STEEL_BLOCK);
                        entries.add(ModBlocks.RAW_STEEL_BLOCK);
                        entries.add(ModBlocks.STEEL_ORE);
                        entries.add(ModBlocks.DEEPSLATE_STEEL_ORE);

                        entries.add(ModItems.STEEL_INGOT);
                        entries.add(ModItems.RAW_STEEL);

                        entries.add(ModItems.STEEL_SWORD);
                        entries.add(ModItems.STEEL_AXE);
                        entries.add(ModItems.STEEL_PICKAXE);
                        entries.add(ModItems.STEEL_SHOVEL);
                        entries.add(ModItems.STEEL_HOE);

                        entries.add(ModItems.STEEL_HELMET);
                        entries.add(ModItems.STEEL_CHESTPLATE);
                        entries.add(ModItems.STEEL_LEGGINGS);
                        entries.add(ModItems.STEEL_BOOTS);

                        entries.add(ModBlocks.LIGNITE_BLOCK);
                        entries.add(ModBlocks.LIGNITE_ORE);
                        entries.add(ModBlocks.DEEPSLATE_LIGNITE_ORE);

                        entries.add(ModItems.LIGNITE);

                        entries.add(ModBlocks.NETHERRACK_MAGMA_ORE);
                        entries.add(ModBlocks.SOUL_SAND_MAGMA_ORE);


                        entries.add(ModItems.MAGMA_INGOT);
                        entries.add(ModItems.MAGMA_SHARD);

                        entries.add(ModBlocks.PALM_LEAVES);
                        entries.add(ModBlocks.PALM_LOG);
                        entries.add(ModBlocks.STRIPPED_PALM_LOG);
                        entries.add(ModBlocks.PALM_WOOD);
                        entries.add(ModBlocks.STRIPPED_PALM_WOOD);
                        entries.add(ModBlocks.PALM_PLANKS);
                        entries.add(ModBlocks.PALM_STAIRS);
                        entries.add(ModBlocks.PALM_SLAB);
                        entries.add(ModBlocks.PALM_WALL);
                        entries.add(ModBlocks.PALM_FENCE);
                        entries.add(ModBlocks.PALM_FENCE_GATE);
                        entries.add(ModBlocks.PALM_SAPLING);

                        entries.add(ModBlocks.PALM_DOOR);
                        entries.add(ModBlocks.PALM_TRAPDOOR);
                        entries.add(ModBlocks.PALM_PRESSURE_PLATE);
                        entries.add(ModBlocks.PALM_BUTTON);

                        entries.add(ModItems.METAL_DETECTOR);

                        entries.add(ModBlocks.CHEESE_BLOCK);

                        entries.add(ModItems.CHEESE);
                        entries.add(ModItems.SANDWICH);

                        entries.add(ModItems.OIL_BUCKET);

                        entries.add(ModItems.NETHERITE_RING);
                        entries.add(ModItems.EMERALD_RING);
                        entries.add(ModItems.RUBY_RING);
                        entries.add(ModItems.DIAMOND_RING);
                        entries.add(ModItems.MAGMA_RING);
                        entries.add(ModItems.TITANIUM_RING);
                        entries.add(ModItems.STEEL_RING);
                        entries.add(ModItems.GOLD_RING);
                        entries.add(ModItems.COPPER_RING);
                        entries.add(ModItems.ULTIMATE_RING);

                        entries.add(ModItems.FROST_ELEMENTAL_SPAWN_EGG);
                        entries.add(ModItems.STONE_VILLAGER_SPAWN_EGG);
                        //entries.add(ModItems.ICE_GOBLIN_SPAWN_EGG);
                        entries.add(ModItems.PORCUPINE_SPAWN_EGG);
                    }).build());

    public static void registerItemGroups() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
        });
    }
}