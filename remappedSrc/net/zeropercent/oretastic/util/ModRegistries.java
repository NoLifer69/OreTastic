package net.zeropercent.oretastic.util;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.tinyremapper.extension.mixin.common.Logger;
import net.zeropercent.oretastic.OreTastic;
import net.zeropercent.oretastic.item.ModItems;

public class ModRegistries {
    public static void registerModStuff(){
        registerFuels();
    }

    public static void registerFuels(){
        OreTastic.LOGGER.info("Registering Fuels for" + OreTastic.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(ModItems.LIGNITE, 200);
    }
}
