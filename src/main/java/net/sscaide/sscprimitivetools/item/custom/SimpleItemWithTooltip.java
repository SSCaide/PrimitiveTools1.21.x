package net.sscaide.sscprimitivetools.item.custom;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;

import java.util.List;

public class SimpleItemWithTooltip extends Item {

    String tooltip;
    public SimpleItemWithTooltip(Properties properties, String tooltipKey) {
        super(properties);
        tooltip = tooltipKey;
    }


    public String getTooltip()
    {
        return tooltip;
    }

    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
        String theTooltip = this.getTooltip();
        tooltipComponents.add(Component.translatable(theTooltip));
        super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
    }


}
