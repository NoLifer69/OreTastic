package net.zeropercent.oretastic.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.Identifier;
import net.zeropercent.oretastic.OreTastic;
import net.zeropercent.oretastic.item.ModItems;

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

        getOrCreateTagBuilder(ItemTags.TRIM_MATERIALS)
                .add(ModItems.MAGMA_INGOT)
                .add(ModItems.RUBY)
                .add(ModItems.TITANIUM)
                .add(ModItems.STEEL_INGOT);

        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.RUBY_BOOTS)
                .add(ModItems.RUBY_LEGGINGS)
                .add(ModItems.RUBY_CHESTPLATE)
                .add(ModItems.RUBY_HELMET)
                .add(ModItems.TITANIUM_BOOTS)
                .add(ModItems.TITANIUM_LEGGINGS)
                .add(ModItems.TITANIUM_CHESTPLATE)
                .add(ModItems.TITANIUM_HELMET)
                .add(ModItems.STEEL_BOOTS)
                .add(ModItems.STEEL_LEGGINGS)
                .add(ModItems.STEEL_CHESTPLATE)
                .add(ModItems.STEEL_HELMET);
    }
}
