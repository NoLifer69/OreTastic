package net.zeropercent.oretastic.item.custom;

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
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class MagmaRing extends Item {
    public MagmaRing(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if(user instanceof PlayerEntity){
            PlayerEntity PlayerEntity = (PlayerEntity) (Object) user;
            PlayerEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 4800));
            user.getItemCooldownManager().set(ModItems.EMERALD_RING, 1200);
            user.getItemCooldownManager().set(ModItems.DIAMOND_RING, 1200);
            user.getItemCooldownManager().set(ModItems.RUBY_RING, 1200);
            user.getItemCooldownManager().set(ModItems.MAGMA_RING, 5000);
        }

        return super.use(world, user, hand);

    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("Gives You The Fire Resistance Effect For 60 Seconds").formatted(Formatting.GOLD));

        super.appendTooltip(stack, world, tooltip, context);
    }
}
