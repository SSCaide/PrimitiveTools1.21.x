package net.sscaide.sscprimitivetools.item.custom;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;

import java.util.List;

public class SharpenedRockItem extends PickaxeItem {

    public SharpenedRockItem(Tier tier, Properties properties) {
        super(tier, properties);
    }

    @Override
    public ItemStack getCraftingRemainingItem(ItemStack stack) {
        if (!hasCraftingRemainingItem(stack)) {
            return ItemStack.EMPTY;
        }
        ItemStack stack2 = new ItemStack(stack.getItem());
        stack2.getItem().setDamage(stack2, getDamage(stack)+2);
        int dam = stack2.getDamageValue();
        if(dam >= stack2.getMaxDamage())
        {
            return ItemStack.EMPTY;
        } else {
            return stack2;
        }
    }

    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
        tooltipComponents.add(Component.translatable("tooltip.sscprimitivetools.sharpened_rocks.tooltip"));
        super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
    }


}
