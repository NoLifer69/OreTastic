package net.zeropercent.oretastic.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.ModelIds;
import net.minecraft.data.client.Models;
import net.zeropercent.oretastic.block.ModBlocks;
import net.zeropercent.oretastic.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.TITANIUM_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.TITANIUM_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DEEPSLATE_TITANIUM_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RAW_TITANIUM_BLOCK);

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RUBY_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DEEPSLATE_RUBY_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RUBY_BLOCK);

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LIGNITE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DEEPSLATE_LIGNITE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LIGNITE_BLOCK);

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.STEEL_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.STEEL_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DEEPSLATE_STEEL_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RAW_STEEL_BLOCK);

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CHEESE_BLOCK);

        blockStateModelGenerator.registerLog(ModBlocks.PALM_LOG).log(ModBlocks.PALM_LOG).wood(ModBlocks.PALM_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_PALM_LOG).log(ModBlocks.STRIPPED_PALM_LOG).wood(ModBlocks.STRIPPED_PALM_WOOD);

        BlockStateModelGenerator.BlockTexturePool palmPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PALM_PLANKS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PALM_LEAVES);
        blockStateModelGenerator.registerTintableCrossBlockState(ModBlocks.PALM_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);

        palmPool.stairs(ModBlocks.PALM_STAIRS);
        palmPool.slab(ModBlocks.PALM_SLAB);
        palmPool.fence(ModBlocks.PALM_FENCE);
        palmPool.fenceGate(ModBlocks.PALM_FENCE_GATE);
        palmPool.button(ModBlocks.PALM_BUTTON);
        palmPool.pressurePlate(ModBlocks.PALM_PRESSURE_PLATE);
        palmPool.wall(ModBlocks.PALM_WALL);

        blockStateModelGenerator.registerDoor(ModBlocks.PALM_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.PALM_TRAPDOOR);

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.NETHERRACK_MAGMA_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SOUL_SAND_MAGMA_ORE);


        blockStateModelGenerator.registerParentedItemModel(ModItems.STONE_VILLAGER_SPAWN_EGG,
                ModelIds.getMinecraftNamespacedItem("template_spawn_egg"));
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.TITANIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_TITANIUM, Models.GENERATED);

        itemModelGenerator.register(ModItems.TITANIUM_BOOTS, Models.GENERATED);
        itemModelGenerator.register(ModItems.TITANIUM_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(ModItems.TITANIUM_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.TITANIUM_HELMET, Models.GENERATED);

        itemModelGenerator.register(ModItems.TITANIUM_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TITANIUM_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TITANIUM_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TITANIUM_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TITANIUM_HOE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.RUBY, Models.GENERATED);

        itemModelGenerator.register(ModItems.RUBY_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUBY_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUBY_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUBY_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUBY_HOE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.RUBY_BOOTS, Models.GENERATED);
        itemModelGenerator.register(ModItems.RUBY_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(ModItems.RUBY_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.RUBY_HELMET, Models.GENERATED);

        itemModelGenerator.register(ModItems.LIGNITE, Models.GENERATED);

        itemModelGenerator.register(ModItems.METAL_DETECTOR, Models.GENERATED);

        itemModelGenerator.register(ModItems.RAW_STEEL,  Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_INGOT, Models.GENERATED);

        itemModelGenerator.register(ModItems.STEEL_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STEEL_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STEEL_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STEEL_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STEEL_HOE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.STEEL_BOOTS, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_HELMET, Models.GENERATED);

        itemModelGenerator.register(ModItems.CHEESE, Models.GENERATED);
        itemModelGenerator.register(ModItems.SANDWICH, Models.GENERATED);

        itemModelGenerator.register(ModBlocks.PALM_SAPLING.asItem(), Models.GENERATED);

        itemModelGenerator.register(ModItems.OIL_BUCKET, Models.GENERATED);

        itemModelGenerator.register(ModItems.MAGMA_SHARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.MAGMA_INGOT, Models.GENERATED);

        itemModelGenerator.register(ModItems.NETHERITE_RING, Models.GENERATED);
        itemModelGenerator.register(ModItems.EMERALD_RING, Models.GENERATED);
        itemModelGenerator.register(ModItems.RUBY_RING, Models.GENERATED);
        itemModelGenerator.register(ModItems.DIAMOND_RING, Models.GENERATED);
        itemModelGenerator.register(ModItems.MAGMA_RING, Models.GENERATED);
    }
}
