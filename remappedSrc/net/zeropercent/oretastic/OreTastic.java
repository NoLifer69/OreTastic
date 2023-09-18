package net.zeropercent.oretastic;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.item.trim.ArmorTrimMaterial;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;
import net.zeropercent.oretastic.block.ModBlocks;
import net.zeropercent.oretastic.data.ModAdvancementProvider;
import net.zeropercent.oretastic.enchantment.ModEnchantments;
import net.zeropercent.oretastic.entity.ModEntities;
import net.zeropercent.oretastic.entity.custom.StoneVillagerEntity;
import net.zeropercent.oretastic.item.ModItemGroup;
import net.zeropercent.oretastic.item.ModItems;
import net.zeropercent.oretastic.util.ModFlammableBlocks;
import net.zeropercent.oretastic.util.ModRegistries;
import net.zeropercent.oretastic.util.ModStrippableBlocks;
import net.zeropercent.oretastic.world.gen.ModWorldGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OreTastic implements ModInitializer {
	public static final String MOD_ID = "oretastic";
	public static final Logger LOGGER = LoggerFactory.getLogger("oretastic");

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModItemGroup.registerItemGroups();
		ModRegistries.registerModStuff();
		ModBlocks.registerModBlocks();
		ModWorldGeneration.generateModWorldGen();
		ModFlammableBlocks.registerFlammableBlocks();
		ModStrippableBlocks.registerStrippables();
		ModEnchantments.registerModEnchantments();

		FabricDefaultAttributeRegistry.register(ModEntities.STONE_VILLAGER, StoneVillagerEntity.setAttributes());
	}
}