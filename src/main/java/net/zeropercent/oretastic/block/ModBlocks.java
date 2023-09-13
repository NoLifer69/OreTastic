package net.zeropercent.oretastic.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.zeropercent.oretastic.OreTastic;
import net.zeropercent.oretastic.fluid.ModFluids;
import net.zeropercent.oretastic.world.tree.PalmWoodSaplingGenerator;

public class ModBlocks {

    public static final Block TITANIUM_BLOCK = registerBlock("titanium_block",
            new Block(FabricBlockSettings.create().mapColor(MapColor.GRAY).strength(4.0f).requiresTool()
                    .sounds(BlockSoundGroup.METAL)));
    public static final Block RAW_TITANIUM_BLOCK = registerBlock("raw_titanium_block",
            new Block(FabricBlockSettings.create().mapColor(MapColor.GRAY).strength(4.0f).requiresTool()
                    .sounds(BlockSoundGroup.METAL)));
    public static final Block TITANIUM_ORE = registerBlock("titanium_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).strength(4.0f).requiresTool()
                    .sounds(BlockSoundGroup.STONE), UniformIntProvider.create(6, 8)));
    public static final Block DEEPSLATE_TITANIUM_ORE = registerBlock("deepslate_titanium_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).strength(4.0f).requiresTool()
                    .sounds(BlockSoundGroup.STONE), UniformIntProvider.create(6, 8)));

    public static final Block RUBY_BLOCK = registerBlock("ruby_block",
            new Block(FabricBlockSettings.create().mapColor(MapColor.GRAY).strength(4.0f).requiresTool()
                    .sounds(BlockSoundGroup.METAL)));
    public static final Block RUBY_ORE = registerBlock("ruby_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).strength(4.0f).requiresTool()
                    .sounds(BlockSoundGroup.STONE), UniformIntProvider.create(8, 10)));
    public static final Block DEEPSLATE_RUBY_ORE = registerBlock("deepslate_ruby_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).strength(4.0f).requiresTool()
                    .sounds(BlockSoundGroup.STONE), UniformIntProvider.create(8, 10)));

    public static final Block LIGNITE_ORE = registerBlock("lignite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).strength(4.0f).requiresTool()
                    .sounds(BlockSoundGroup.STONE), UniformIntProvider.create(8, 10)));
    public static final Block DEEPSLATE_LIGNITE_ORE = registerBlock("deepslate_lignite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).strength(4.0f).requiresTool()
                    .sounds(BlockSoundGroup.STONE), UniformIntProvider.create(8, 10)));
    public static final Block LIGNITE_BLOCK = registerBlock("lignite_block",
            new Block(FabricBlockSettings.create().mapColor(MapColor.GRAY).strength(4.0f).requiresTool()
                    .sounds(BlockSoundGroup.METAL)));

    public static final Block STEEL_BLOCK = registerBlock("steel_block",
            new Block(FabricBlockSettings.create().mapColor(MapColor.GRAY).strength(4.0f).requiresTool()
                    .sounds(BlockSoundGroup.METAL)));
    public static final Block RAW_STEEL_BLOCK = registerBlock("raw_steel_block",
            new Block(FabricBlockSettings.create().mapColor(MapColor.GRAY).strength(4.0f).requiresTool()
                    .sounds(BlockSoundGroup.METAL)));
    public static final Block STEEL_ORE = registerBlock("steel_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).strength(4.0f).requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block DEEPSLATE_STEEL_ORE = registerBlock("deepslate_steel_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).strength(4.0f).requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block CHEESE_BLOCK = registerBlock("cheese_block",
            new Block(FabricBlockSettings.create().mapColor(MapColor.GRAY).strength(0.5f)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block PALM_LOG = registerBlock("palm_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG).strength(3f)));
    public static final Block PALM_WOOD = registerBlock("palm_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final Block STRIPPED_PALM_LOG = registerBlock("stripped_palm_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG).strength(3f)));
    public static final Block STRIPPED_PALM_WOOD = registerBlock("stripped_palm_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD).strength(3f)));

    public static final Block PALM_PLANKS = registerBlock("palm_planks",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).strength(3f)));
    public static final Block PALM_LEAVES = registerBlock("palm_leaves",
            new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES).strength(.1f).requiresTool()));

    public static final Block PALM_SAPLING = registerBlock("palm_sapling",
            new SaplingBlock(new PalmWoodSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));

    public static final Block PALM_STAIRS = registerBlock("palm_stairs",
            new StairsBlock(ModBlocks.PALM_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)));
    public static final Block PALM_SLAB = registerBlock("palm_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB)));

    public static final Block PALM_BUTTON = registerBlock("palm_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_BUTTON), BlockSetType.OAK, 10, true));
    public static final Block PALM_PRESSURE_PLATE = registerBlock("palm_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));

    public static final Block PALM_FENCE = registerBlock("palm_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));
    public static final Block PALM_FENCE_GATE = registerBlock("palm_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE), WoodType.OAK));
    public static final Block PALM_WALL = registerBlock("palm_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block PALM_DOOR = registerBlock("palm_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR).nonOpaque(), BlockSetType.OAK));
    public static final Block PALM_TRAPDOOR = registerBlock("palm_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR).nonOpaque(), BlockSetType.OAK));

    public static final Block OIL_FLUID_BLOCK = registerBlock("oil_fluid_block",
            new FluidBlock(ModFluids.OIL_STILL, AbstractBlock.Settings.create()
                    .mapColor(MapColor.BLACK).replaceable().noCollision()
                    .pistonBehavior(PistonBehavior.DESTROY).dropsNothing().liquid()));

    public static final Block NETHERRACK_MAGMA_ORE = registerBlock("netherrack_magma_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.create().mapColor(MapColor.RED).strength(3.0f).requiresTool()
                    .sounds(BlockSoundGroup.NETHERRACK), UniformIntProvider.create(4, 6)));
    public static final Block SOUL_SAND_MAGMA_ORE = registerBlock("soul_sand_magma_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.create().mapColor(MapColor.RED).strength(0.5f)
                    .sounds(BlockSoundGroup.SOUL_SAND), UniformIntProvider.create(4, 6)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK,
                new  Identifier(OreTastic.MOD_ID, name), block);
    }

    public static void registerModBlocks() {
        OreTastic.LOGGER.info("Registering Mod Blocks For "+OreTastic.MOD_ID);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM,
                new Identifier(OreTastic.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }
}
