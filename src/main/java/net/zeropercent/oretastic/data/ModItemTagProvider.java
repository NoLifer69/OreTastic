package net.zeropercent.oretastic.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.Identifier;
import net.zeropercent.oretastic.OreTastic;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(new Identifier(OreTastic.MOD_ID, "palm_planks"));

        getOrCreateTagBuilder(ItemTags.SAPLINGS)
                .add(new Identifier(OreTastic.MOD_ID, "palm_sapling"));

        getOrCreateTagBuilder(ItemTags.LEAVES)
                .add(new Identifier(OreTastic.MOD_ID, "palm_leaves"));
    }
}
