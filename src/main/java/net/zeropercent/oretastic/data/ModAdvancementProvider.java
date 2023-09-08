package net.zeropercent.oretastic.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricAdvancementProvider;
import net.minecraft.advancement.Advancement;
import net.minecraft.advancement.AdvancementFrame;
import net.minecraft.advancement.criterion.Criterion;
import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.item.Items;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.zeropercent.oretastic.OreTastic;
import net.zeropercent.oretastic.item.ModItems;
import net.zeropercent.oretastic.util.ModTags;

import java.util.function.Consumer;

public class ModAdvancementProvider extends FabricAdvancementProvider {
    public ModAdvancementProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateAdvancement(Consumer<Advancement> consumer) {
        Advancement rootAdvancement = Advancement.Builder.create()
                .display(
                        Items.GRASS_BLOCK, // The display icon
                        Text.literal("Touch Grass"), // The title
                        Text.literal("Finally!"), // The description
                        new Identifier("oretastic","textures/block/palm_log.png"), // Background image used
                        AdvancementFrame.TASK, // Options: TASK, CHALLENGE, GOAL
                        false, // Show toast top right
                        false, // Announce to chat
                        false // Hidden in the advancement tab
                )
                // The first string used in criterion is the name referenced by other advancements when they want to have 'requirements'
                .criterion("gotGrass", InventoryChangedCriterion.Conditions.items(Items.GRASS_BLOCK))
                .build(consumer, OreTastic.MOD_ID + "/root");

        Advancement gotTitaniumAdvancement = Advancement.Builder.create()
                .display(
                        ModItems.TITANIUM, // The display icon
                        Text.literal("Titanium Ore"), // The title
                        Text.literal("Now make a complete set"), // The description
                        new Identifier("oretastic","textures/block/palm_log.png"), // Background image used
                        AdvancementFrame.TASK, // Options: TASK, CHALLENGE, GOAL
                        true, // Show toast top right
                        true, // Announce to chat
                        false // Hidden in the advancement tab
                )
                // The first string used in criterion is the name referenced by other advancements when they want to have 'requirements'
                .criterion("got_titanium", InventoryChangedCriterion.Conditions.items(ModItems.RAW_TITANIUM))
                .parent(rootAdvancement)
                .build(consumer, OreTastic.MOD_ID + "/got_titanium");

        Advancement usedMetalDetector = Advancement.Builder.create()
                .display(
                        ModItems.METAL_DETECTOR, // The display icon
                        Text.literal("Miners Are Gonna Love This"), // The title
                        Text.literal("Craft A Metal Detector"), // The description
                        new Identifier("oretastic","textures/block/palm_log.png"), // Background image used
                        AdvancementFrame.TASK, // Options: TASK, CHALLENGE, GOAL
                        true, // Show toast top right
                        true, // Announce to chat
                        false // Hidden in the advancement tab
                )
                // The first string used in criterion is the name referenced by other advancements when they want to have 'requirements'
                .criterion("crafted_metal_detector", InventoryChangedCriterion.Conditions.items(ModItems.METAL_DETECTOR))
                .parent(rootAdvancement)
                .build(consumer, OreTastic.MOD_ID + "/got_metal_detector");

        Advancement gotRubyAdvancement = Advancement.Builder.create()
                .display(
                        ModItems.RUBY, // The display icon
                        Text.literal("Most op Ore"), // The title
                        Text.literal("Mine A Ruby Ore"), // The description
                        new Identifier("oretastic","textures/block/palm_log.png"), // Background image used
                        AdvancementFrame.TASK, // Options: TASK, CHALLENGE, GOAL
                        true, // Show toast top right
                        true, // Announce to chat
                        false // Hidden in the advancement tab
                )
                // The first string used in criterion is the name referenced by other advancements when they want to have 'requirements'
                .criterion("got_ruby", InventoryChangedCriterion.Conditions.items(ModItems.RUBY))
                .parent(rootAdvancement)
                .build(consumer, OreTastic.MOD_ID + "/got_ruby");

        Advancement getFullRubyArmor = Advancement.Builder.create()
                .display(
                        ModItems.RUBY_CHESTPLATE, // The display icon
                        Text.literal("Cover Me In Rubies"), // The title
                        Text.literal("Acquire AFull Armor Set Of Ruby Armor"), // The description
                        new Identifier("oretastic","textures/block/palm_log.png"), // Background image used
                        AdvancementFrame.CHALLENGE, // Options: TASK, CHALLENGE, GOAL
                        true, // Show toast top right
                        true, // Announce to chat
                        false // Hidden in the advancement tab
                )
                // The first string used in criterion is the name referenced by other advancements when they want to have 'requirements'
                .criterion("fot_full_ruby_armor_1", InventoryChangedCriterion.Conditions.items(ModItems.RUBY_HELMET))
                .criterion("fot_full_ruby_armor_2", InventoryChangedCriterion.Conditions.items(ModItems.RUBY_CHESTPLATE))
                .criterion("fot_full_ruby_armor_3", InventoryChangedCriterion.Conditions.items(ModItems.RUBY_LEGGINGS))
                .criterion("fot_full_ruby_armor_4", InventoryChangedCriterion.Conditions.items(ModItems.RUBY_BOOTS))
                .parent(gotRubyAdvancement)
                .build(consumer, OreTastic.MOD_ID + "/got_full_ruby_armor");

        Advancement getMagmaShard = Advancement.Builder.create()
                .display(
                        ModItems.MAGMA_SHARD, // The display icon
                        Text.literal("It Must Hurt To Touch"), // The title
                        Text.literal("Acquire A Magma Shard"), // The description
                        new Identifier("oretastic","textures/block/palm_log.png"), // Background image used
                        AdvancementFrame.TASK, // Options: TASK, CHALLENGE, GOAL
                        true, // Show toast top right
                        true, // Announce to chat
                        false // Hidden in the advancement tab
                )
                // The first string used in criterion is the name referenced by other advancements when they want to have 'requirements'
                .criterion("got_magma_shard", InventoryChangedCriterion.Conditions.items(ModItems.MAGMA_SHARD))
                .parent(rootAdvancement)
                .build(consumer, OreTastic.MOD_ID + "/got_magma_shard");
    }
}