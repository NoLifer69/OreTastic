package net.zeropercent.oretastic.util;

import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.zeropercent.oretastic.block.ModBlocks;

public class ModStrippableBlocks {
    public static void registerStrippables(){
        StrippableBlockRegistry.register(ModBlocks.PALM_LOG, ModBlocks.STRIPPED_PALM_LOG);
        StrippableBlockRegistry.register(ModBlocks.PALM_WOOD, ModBlocks.STRIPPED_PALM_WOOD);
    }
}
