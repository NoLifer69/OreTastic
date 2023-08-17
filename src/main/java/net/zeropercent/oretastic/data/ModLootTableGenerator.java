package net.zeropercent.oretastic.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
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
        addDrop(ModBlocks.PALM_LEAVES);
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
        addDrop(ModBlocks.PALM_DOOR, slabDrops(ModBlocks.PALM_SLAB));

        oreDrops(ModBlocks.TITANIUM_ORE, ModItems.RAW_TITANIUM);
        oreDrops(ModBlocks.DEEPSLATE_TITANIUM_ORE, ModItems.RAW_TITANIUM);
        oreDrops(ModBlocks.RUBY_ORE, ModItems.RUBY);
        oreDrops(ModBlocks.DEEPSLATE_RUBY_ORE, ModItems.RUBY);
        oreDrops(ModBlocks.LIGNITE_ORE, ModItems.LIGNITE);
        oreDrops(ModBlocks.DEEPSLATE_LIGNITE_ORE, ModItems.LIGNITE);
        oreDrops(ModBlocks.STEEL_ORE, ModItems.STEEL_INGOT);
        oreDrops(ModBlocks.DEEPSLATE_STEEL_ORE, ModItems.STEEL_INGOT);
    }
}
