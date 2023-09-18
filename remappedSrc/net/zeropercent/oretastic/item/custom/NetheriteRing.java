package net.zeropercent.oretastic.item.custom;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class NetheriteRing extends Item {

    public NetheriteRing(Settings settings) {
        super(settings);
    }
    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if (Screen.hasShiftDown()) {
            tooltip.add(Text.literal("Gives Different Effects When Combined With Other Ingots Or Crystals").formatted(Formatting.GOLD));
        } else {
            tooltip.add(Text.literal("Gives Different Effects...").formatted(Formatting.GOLD));
        }

        super.appendTooltip(stack, world, tooltip, context);
    }
}
