package net.zeropercent.oretastic.item;

import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent CHEESE = new FoodComponent.Builder().hunger(7)
            .saturationModifier(.35f).build();
    public static final FoodComponent SANDWICH = new FoodComponent.Builder().hunger(14)
            .saturationModifier(1f).build();
}
