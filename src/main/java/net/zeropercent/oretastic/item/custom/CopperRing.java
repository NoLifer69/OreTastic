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

public class CopperRing extends Item {
    public CopperRing(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if(user instanceof PlayerEntity){
            PlayerEntity PlayerEntity = (PlayerEntity) (Object) user;
            PlayerEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 1, 255));
            user.getItemCooldownManager().set(ModItems.EMERALD_RING, 2000);
            user.getItemCooldownManager().set(ModItems.DIAMOND_RING, 2000);
            user.getItemCooldownManager().set(ModItems.RUBY_RING, 2000);
            user.getItemCooldownManager().set(ModItems.MAGMA_RING, 2000);
            user.getItemCooldownManager().set(ModItems.TITANIUM_RING, 2000);
            user.getItemCooldownManager().set(ModItems.STEEL_RING, 2000);
            user.getItemCooldownManager().set(ModItems.GOLD_RING, 2000);
            user.getItemCooldownManager().set(ModItems.COPPER_RING, 7000);
            user.getItemCooldownManager().set(ModItems.ULTIMATE_RING, 2000);
        }

        return super.use(world, user, hand);

    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("Fully Regenerates Your Health").formatted(Formatting.GOLD));

        super.appendTooltip(stack, world, tooltip, context);
    }
}
