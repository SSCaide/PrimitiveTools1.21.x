package net.sscaide.sscprimitivetools.event;

import net.minecraft.core.BlockPos;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.level.BlockDropsEvent;
import net.sscaide.sscprimitivetools.PrimitiveTools;
import net.sscaide.sscprimitivetools.item.ModItems;

import java.util.Objects;
import java.util.Random;

@EventBusSubscriber(modid = PrimitiveTools.MOD_ID, bus = EventBusSubscriber.Bus.GAME)
public class ModEvents {

    @SubscribeEvent
    public static void toolsBasedDrops(BlockDropsEvent event) {
        BlockState state = event.getState();
        ItemStack tool = event.getTool();
        Level level = event.getLevel();
        BlockPos pos = event.getPos();
        boolean silk;
        int fortune;
        if (tool.isDamageableItem()) {
            var enchants = tool.get(DataComponents.ENCHANTMENTS);
            var server = level.getServer();
            var enchantmentHolder = server.registryAccess().registryOrThrow(Registries.ENCHANTMENT).getHolderOrThrow(Enchantments.SILK_TOUCH);
            var enchantmentHolder2 = server.registryAccess().registryOrThrow(Registries.ENCHANTMENT).getHolderOrThrow(Enchantments.FORTUNE);
            silk = Objects.requireNonNull(enchants).getLevel(enchantmentHolder) != 0;
            fortune = Objects.requireNonNull(enchants).getLevel(enchantmentHolder2);
        } else {
            silk = false;
            fortune = 0;
        }
        Random rand = new Random();
        int rng;

        if (!silk && !tool.is(Items.SHEARS)) {
            if (state.is(Blocks.VINE) || state.is(Blocks.CAVE_VINES)) {
                Block.popResource(level, pos, ModItems.VINE.toStack(1));
            } else if (state.is(BlockTags.LEAVES)) {
                rng = rand.nextInt(16);
                if (rng == 0) {
                    Block.popResource(level, pos, ModItems.VINE.toStack(1));
                }
            }
        }
    }
}
