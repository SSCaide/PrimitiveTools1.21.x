package net.sscaide.morecobble.event;

import net.minecraft.core.BlockPos;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.level.BlockDropsEvent;
import net.sscaide.morecobble.MoreCobble;
import net.sscaide.morecobble.block.ModBlocks;

import java.util.Objects;

@EventBusSubscriber(modid = MoreCobble.MOD_ID, bus = EventBusSubscriber.Bus.GAME)
public class ModEvents {

    @SubscribeEvent
    public static void cobbleDrop(BlockDropsEvent event) {
        BlockState state = event.getState();
        ItemStack tool = event.getTool();
        Level level = event.getLevel();
        BlockPos pos = event.getPos();
        Entity entity = event.getBreaker();
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

        if(tool.isCorrectToolForDrops(state) && !silk) {
            if(state.is(Blocks.GRANITE)) {
                ItemStack drop = new ItemStack(ModBlocks.COBBLED_GRANITE, 1);
                Block.popResourceFromFace(level, pos, entity.getNearestViewDirection().getOpposite(), drop);
                event.setCanceled(true);
            } else if(state.is(Blocks.DIORITE)) {
                ItemStack drop = new ItemStack(ModBlocks.COBBLED_DIORITE, 1);
                Block.popResourceFromFace(level, pos, entity.getNearestViewDirection().getOpposite(), drop);
                event.setCanceled(true);
            } else if(state.is(Blocks.ANDESITE)) {
                ItemStack drop = new ItemStack(ModBlocks.COBBLED_ANDESITE, 1);
                Block.popResourceFromFace(level, pos, entity.getNearestViewDirection().getOpposite(), drop);
                event.setCanceled(true);
            } else if(state.is(Blocks.CALCITE)) {
                ItemStack drop = new ItemStack(ModBlocks.COBBLED_CALCITE, 1);
                Block.popResourceFromFace(level, pos, entity.getNearestViewDirection().getOpposite(), drop);
                event.setCanceled(true);
            } else if(state.is(Blocks.TUFF)) {
                ItemStack drop = new ItemStack(ModBlocks.COBBLED_TUFF, 1);
                Block.popResourceFromFace(level, pos, entity.getNearestViewDirection().getOpposite(), drop);
                event.setCanceled(true);
            } else if(state.is(Blocks.DRIPSTONE_BLOCK)) {
                ItemStack drop = new ItemStack(ModBlocks.COBBLED_DRIPSTONE, 1);
                Block.popResourceFromFace(level, pos, entity.getNearestViewDirection().getOpposite(), drop);
                event.setCanceled(true);
            } else if(state.is(Blocks.BASALT)) {
                ItemStack drop = new ItemStack(ModBlocks.COBBLED_BASALT, 1);
                Block.popResourceFromFace(level, pos, entity.getNearestViewDirection().getOpposite(), drop);
                event.setCanceled(true);
            } else if(state.is(Blocks.END_STONE)) {
                ItemStack drop = new ItemStack(ModBlocks.COBBLED_END_STONE, 1);
                Block.popResourceFromFace(level, pos, entity.getNearestViewDirection().getOpposite(), drop);
                event.setCanceled(true);
            }
        }
    }
}
