package net.zeropercent.oretastic.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.enchantment.SilkTouchEnchantment;
import net.minecraft.loot.entry.LootPoolEntry;
import net.zeropercent.oretastic.block.ModBlocks;
import net.zeropercent.oretastic.item.ModItems;

public class ModLootTableGenerator extends FabricBlockLootTableProvider {
    public ModLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.TITANIUM_BLOCK);
        addDrop(ModBlocks.RAW_TITANIUM_BLOCK);
        addDrop(ModBlocks.RUBY_BLOCK);
        addDrop(ModBlocks.LIGNITE_BLOCK);
        addDrop(ModBlocks.STEEL_BLOCK);
        addDrop(ModBlocks.RAW_STEEL_BLOCK);
        addDrop(ModBlocks.CHEESE_BLOCK);
        addDrop(ModBlocks.PALM_LOG);
        addDrop(ModBlocks.PALM_PLANKS);
        addDrop(ModBlocks.PALM_WOOD);
        addDrop(ModBlocks.STRIPPED_PALM_WOOD);
        addDrop(ModBlocks.STRIPPED_PALM_LOG);
        addDrop(ModBlocks.PALM_SAPLING);

        addDrop(ModBlocks.PALM_STAIRS);
        addDrop(ModBlocks.PALM_TRAPDOOR);
        addDrop(ModBlocks.PALM_WALL);
        addDrop(ModBlocks.PALM_FENCE);
        addDrop(ModBlocks.PALM_FENCE_GATE);
        addDrop(ModBlocks.PALM_BUTTON);
        addDrop(ModBlocks.PALM_PRESSURE_PLATE);

        addDrop(ModBlocks.PALM_DOOR, doorDrops(ModBlocks.PALM_DOOR));
        addDrop(ModBlocks.PALM_SLAB, slabDrops(ModBlocks.PALM_SLAB));

        addDrop(ModBlocks.PALM_LEAVES, oakLeavesDrops(ModBlocks.PALM_LEAVES, ModBlocks.PALM_LEAVES, 0.05f, 0.0625f, 0.083333336f, 0.1f));

        addDrop(ModBlocks.TITANIUM_ORE, oreDrops(ModBlocks.TITANIUM_ORE, ModItems.RAW_TITANIUM));
        addDrop(ModBlocks.DEEPSLATE_TITANIUM_ORE, oreDrops(ModBlocks.DEEPSLATE_TITANIUM_ORE, ModItems.RAW_TITANIUM));
        addDrop(ModBlocks.RUBY_ORE, oreDrops(ModBlocks.RUBY_ORE, ModItems.RUBY));
        addDrop(ModBlocks.DEEPSLATE_RUBY_ORE, oreDrops(ModBlocks.DEEPSLATE_RUBY_ORE, ModItems.RUBY));
        addDrop(ModBlocks.STEEL_ORE, oreDrops(ModBlocks.STEEL_ORE, ModItems.RAW_STEEL));
        addDrop(ModBlocks.DEEPSLATE_STEEL_ORE, oreDrops(ModBlocks.DEEPSLATE_STEEL_ORE, ModItems.RAW_STEEL));
        addDrop(ModBlocks.LIGNITE_ORE, oreDrops(ModBlocks.LIGNITE_ORE, ModItems.LIGNITE));
        addDrop(ModBlocks.DEEPSLATE_LIGNITE_ORE, oreDrops(ModBlocks.DEEPSLATE_LIGNITE_ORE, ModItems.LIGNITE));
        addDrop(ModBlocks.NETHERRACK_MAGMA_ORE, oreDrops(ModBlocks.NETHERRACK_MAGMA_ORE, ModItems.MAGMA_SHARD));
        addDrop(ModBlocks.SOUL_SAND_MAGMA_ORE, oreDrops(ModBlocks.SOUL_SAND_MAGMA_ORE, ModItems.MAGMA_SHARD));
    }
}
