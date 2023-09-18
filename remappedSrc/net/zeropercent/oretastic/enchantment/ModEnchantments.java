package net.zeropercent.oretastic.enchantment;

import net.minecraft.registry.Registries;
import net.zeropercent.oretastic.OreTastic;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;

public class ModEnchantments {
    public static Enchantment LIGHTING_STRIKER = register("lighting_striker",
            new LightningStrikerEnchantment(Enchantment.Rarity.RARE,
                 EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND));


    private static Enchantment register(String name, Enchantment enchantment) {
        return Registry.register(Registries.ENCHANTMENT, new Identifier(OreTastic.MOD_ID, name), enchantment);
    }

    public static void registerModEnchantments() {
        System.out.println("Registering Enchantments for " + OreTastic.MOD_ID);
    }
}
