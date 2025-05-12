package net.sscaide.morecobble.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.sscaide.morecobble.MoreCobble;
import net.sscaide.morecobble.block.ModBlocks;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends ItemTagsProvider {
    public ModItemTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                               CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {

        super(output, lookupProvider, blockTags, MoreCobble.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ItemTags.STONE_TOOL_MATERIALS)
                .add(ModBlocks.COBBLED_GRANITE.asItem())
                .add(ModBlocks.COBBLED_DIORITE.asItem())
                .add(ModBlocks.COBBLED_ANDESITE.asItem())
                .add(ModBlocks.COBBLED_CALCITE.asItem())
                .add(ModBlocks.COBBLED_TUFF.asItem())
                .add(ModBlocks.COBBLED_DRIPSTONE.asItem())
                .add(ModBlocks.COBBLED_BASALT.asItem())
                .add(ModBlocks.COBBLED_END_STONE.asItem());

        tag(ItemTags.STONE_CRAFTING_MATERIALS)
                .add(ModBlocks.COBBLED_GRANITE.asItem())
                .add(ModBlocks.COBBLED_DIORITE.asItem())
                .add(ModBlocks.COBBLED_ANDESITE.asItem())
                .add(ModBlocks.COBBLED_CALCITE.asItem())
                .add(ModBlocks.COBBLED_TUFF.asItem())
                .add(ModBlocks.COBBLED_DRIPSTONE.asItem())
                .add(ModBlocks.COBBLED_BASALT.asItem())
                .add(ModBlocks.COBBLED_END_STONE.asItem());
    }
}
