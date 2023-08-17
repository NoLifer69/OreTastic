package net.zeropercent.oretastic.fluid;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.zeropercent.oretastic.OreTastic;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.util.Identifier;

public class ModFluids {
    public static final FlowableFluid OIL_STILL = register("oil_still", new OilFluid.Still());
    public static final FlowableFluid OIL_FLOWING = register("oil_flowing", new OilFluid.Flowing());

    private static FlowableFluid register(String name, FlowableFluid flowableFluid) {
        return Registry.register(Registries.FLUID, new Identifier(OreTastic.MOD_ID, name), flowableFluid);
    }
}
