package net.zeropercent.oretastic.item.trim;

import net.minecraft.item.ArmorMaterials;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.trim.ArmorTrimMaterial;
import net.minecraft.item.trim.ArmorTrimMaterials;
import net.minecraft.registry.DynamicRegistryManager;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import net.zeropercent.oretastic.item.ModItems;

import java.util.Map;
import java.util.Optional;

public class ModArmorTrimMaterials extends ArmorTrimMaterials {
    public static final RegistryKey<ArmorTrimMaterial> RUBY = ModArmorTrimMaterials.of("ruby");
    public static final RegistryKey<ArmorTrimMaterial> TITANIUM = ModArmorTrimMaterials.of("titanium");
    public static final RegistryKey<ArmorTrimMaterial> STEEL = ModArmorTrimMaterials.of("steel");
    public static final RegistryKey<ArmorTrimMaterial> MAGMA = ModArmorTrimMaterials.of("magma");

    public static void bootstrap(Registerable<ArmorTrimMaterial> registry) {
        ModArmorTrimMaterials.register(registry, RUBY, ModItems.RUBY, Style.EMPTY.withColor(14931140), 0.1f);
        ModArmorTrimMaterials.register(registry, TITANIUM, ModItems.TITANIUM, Style.EMPTY.withColor(0xECECEC), 0.2f);
        ModArmorTrimMaterials.register(registry, STEEL, ModItems.STEEL_INGOT, Style.EMPTY.withColor(6445145), 0.3f);
        ModArmorTrimMaterials.register(registry, MAGMA, ModItems.MAGMA_INGOT, Style.EMPTY.withColor(10116294), 1.0f);
    }

    public static Optional<RegistryEntry.Reference<ArmorTrimMaterial>> get(DynamicRegistryManager registryManager, ItemStack stack) {
        return registryManager.get(RegistryKeys.TRIM_MATERIAL).streamEntries().filter(recipe -> stack.itemMatches(((ArmorTrimMaterial)recipe.value()).ingredient())).findFirst();
    }

    private static void register(Registerable<ArmorTrimMaterial> registry, RegistryKey<ArmorTrimMaterial> key, Item ingredient, Style style, float itemModelIndex) {
        ModArmorTrimMaterials.register(registry, key, ingredient, style, itemModelIndex, Map.of());
    }

    private static void register(Registerable<ArmorTrimMaterial> registry, RegistryKey<ArmorTrimMaterial> key, Item ingredient, Style style, float itemModelIndex, Map<ArmorMaterials, String> overrideArmorMaterials) {
        ArmorTrimMaterial armorTrimMaterial = ArmorTrimMaterial.of(key.getValue().getPath(), ingredient, itemModelIndex, Text.translatable(Util.createTranslationKey("trim_material", key.getValue())).fillStyle(style), overrideArmorMaterials);
        registry.register(key, armorTrimMaterial);
    }

    private static RegistryKey<ArmorTrimMaterial> of(String id) {
        return RegistryKey.of(RegistryKeys.TRIM_MATERIAL, new Identifier(id));
    }
}
