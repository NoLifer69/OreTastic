package net.zeropercent.oretastic.item.custom;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import net.zeropercent.oretastic.item.ModItems;
import net.zeropercent.oretastic.util.ModTags;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class EmeraldRing extends Item {
    public EmeraldRing(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if(user instanceof PlayerEntity){
            PlayerEntity PlayerEntity = (PlayerEntity) (Object) user;
            PlayerEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 1200, 1));
            user.getItemCooldownManager().set(ModItems.EMERALD_RING, 1500);
            user.getItemCooldownManager().set(ModItems.DIAMOND_RING, 1200);
            user.getItemCooldownManager().set(ModItems.RUBY_RING, 1200);
            user.getItemCooldownManager().set(ModItems.MAGMA_RING, 1200);
        }

        return super.use(world, user, hand);

    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("Gives You The Jump Boost Effect For 60 Seconds").formatted(Formatting.GREEN));

        super.appendTooltip(stack, world, tooltip, context);
    }
}
