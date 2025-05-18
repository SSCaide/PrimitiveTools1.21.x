package net.sscaide.sscprimitivetools.item.custom;

import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.sscaide.sscprimitivetools.item.ModItems;

import java.util.List;
import java.util.Random;

public class RandomFlintToolItem extends Item {

    public RandomFlintToolItem(Properties properties) {
        super(properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
        tooltipComponents.add(Component.translatable("tooltip.sscprimitivetools.random_flint_tool.tooltip"));
        super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand usedHand) {
        ItemStack itemstack = player.getItemInHand(usedHand);

        level.playSound(
                null,
                player.getX(),
                player.getY(),
                player.getZ(),
                SoundEvents.ITEM_BREAK,
                SoundSource.NEUTRAL,
                0.5F,
                1.2F * (level.getRandom().nextFloat() * 0.75F + 1F)
        );

        player.awardStat(Stats.ITEM_USED.get(this));
        itemstack.setCount(0);

        Random rand = new Random();
        int n = rand.nextInt(9)+1;
        itemstack = switch (n) {
            case 1, 2 -> ModItems.FLINT_SPADE.toStack(); //Shovel
            case 3, 4, 5 -> ModItems.FLINT_HATCHET.toStack(); //Axe
            case 6, 7, 8 -> ModItems.FLINT_PICK.toStack(); //Pickaxe
            case 9 -> ModItems.FLINT_TILL.toStack(); //hoe
            default -> itemstack;
        };


        return InteractionResultHolder.sidedSuccess(itemstack, level.isClientSide());
    }
}
