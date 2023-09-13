package net.zeropercent.oretastic.util;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.zeropercent.oretastic.block.ModBlocks;

public class ModFlammableBlocks {
    public static void registerFlammableBlocks() {
        FlammableBlockRegistry registry = FlammableBlockRegistry.getDefaultInstance();

        registry.add(ModBlocks.PALM_LOG,  5, 5);
        registry.add(ModBlocks.PALM_WOOD,  5, 5);
        registry.add(ModBlocks.STRIPPED_PALM_LOG,  5, 5);
        registry.add(ModBlocks.PALM_PLANKS,  5, 20);
        registry.add(ModBlocks.PALM_LEAVES,  30, 60);
    }
}
