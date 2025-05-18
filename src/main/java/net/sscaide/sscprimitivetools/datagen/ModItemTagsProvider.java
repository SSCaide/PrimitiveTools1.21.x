package net.sscaide.sscprimitivetools.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.sscaide.sscprimitivetools.PrimitiveTools;
import net.sscaide.sscprimitivetools.item.ModItems;
import net.sscaide.sscprimitivetools.util.ModTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends ItemTagsProvider {
    public ModItemTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                               CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {

        super(output, lookupProvider, blockTags, PrimitiveTools.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {

        tag(ModTags.Items.GOLD_INGOT_SMELTABLES)
                .add(ModItems.WIDE_SHAPED_GOLD.get())
                .add(ModItems.FANNED_SHAPED_GOLD.get());
        tag(ModTags.Items.GOLD_NUGGET_SMELTABLES)
                .add(ModItems.LONG_SHAPED_GOLD.get())
                .add(ModItems.JAGGED_SHAPED_GOLD.get())
                .add(ModItems.THIN_SHAPED_GOLD.get());

        tag(ModTags.Items.COPPER_INGOT_SMELTABLES)
                .add(ModItems.WIDE_SHAPED_COPPER.get())
                .add(ModItems.FANNED_SHAPED_COPPER.get());
        tag(ModTags.Items.COPPER_NUGGET_SMELTABLES)
                .add(ModItems.LONG_SHAPED_COPPER.get())
                .add(ModItems.JAGGED_SHAPED_COPPER.get())
                .add(ModItems.THIN_SHAPED_COPPER.get());

        tag(ModTags.Items.IRON_INGOT_SMELTABLES)
                .add(ModItems.WIDE_SHAPED_IRON.get())
                .add(ModItems.FANNED_SHAPED_IRON.get())
                .add(Items.RAW_IRON);
        tag(ModTags.Items.IRON_NUGGET_SMELTABLES)
                .add(ModItems.LONG_SHAPED_IRON.get())
                .add(ModItems.JAGGED_SHAPED_IRON.get())
                .add(ModItems.THIN_SHAPED_IRON.get());

        tag(ModTags.Items.STRINGS_AND_VINES)
                .add(ModItems.VINE.get())
                .add(Items.WEEPING_VINES)
                .add(Items.TWISTING_VINES)
                .add(Items.STRING);


        tag(ModTags.Items.CRUSHING_CRAFTING)
                .add(ModItems.SHARPENED_ROCK.get())

                .add(ModItems.SHARPENED_COPPER_CHUNK.get())

                .add(ModItems.SHARPENED_IRON_CHUNK.get());
        tag(ModTags.Items.CRUSHING_CRAFTING_COPPER_PLUS)
                .add(ModItems.SHARPENED_COPPER_CHUNK.get())

                .add(ModItems.SHARPENED_IRON_CHUNK.get());
        tag(ModTags.Items.CRUSHING_CRAFTING_IRON_PLUS)
                .add(ModItems.SHARPENED_IRON_CHUNK.get());


        tag(ItemTags.SWORDS)
                .add(ModItems.SHARPENED_STICK.get());
        tag(ModTags.Items.DAGGERS)
                .add(ModItems.CRUDE_STONE_KNIFE.get())
                .add(ModItems.FLINT_KNIFE.get())
                .add(ModItems.CRUDE_GOLD_KNIFE.get())
                .add(ModItems.CRUDE_COPPER_KNIFE.get())
                .add(ModItems.CRUDE_IRON_KNIFE.get());
        tag(ItemTags.PICKAXES)
                .add(ModItems.SHARPENED_STICK.get())
                .add(ModItems.CRUDE_STONE_PICK.get())
                .add(ModItems.FLINT_PICK.get())
                .add(ModItems.CRUDE_GOLD_PICK.get())
                .add(ModItems.CRUDE_COPPER_PICK.get())
                .add(ModItems.CRUDE_IRON_PICK.get());
        tag(ItemTags.AXES)
                .add(ModItems.SHARPENED_STICK.get())
                .add(ModItems.CRUDE_STONE_HATCHET.get())
                .add(ModItems.FLINT_HATCHET.get())
                .add(ModItems.CRUDE_GOLD_HATCHET.get())
                .add(ModItems.CRUDE_COPPER_HATCHET.get())
                .add(ModItems.CRUDE_IRON_HATCHET.get());
        tag(ItemTags.SHOVELS)
                .add(ModItems.CRUDE_STONE_SPADE.get())
                .add(ModItems.FLINT_SPADE.get())
                .add(ModItems.CRUDE_GOLD_SPADE.get())
                .add(ModItems.CRUDE_COPPER_SPADE.get())
                .add(ModItems.CRUDE_IRON_SPADE.get());
        tag(ItemTags.HOES)
                .add(ModItems.CRUDE_STONE_TILL.get())
                .add(ModItems.FLINT_TILL.get())
                .add(ModItems.CRUDE_GOLD_TILL.get())
                .add(ModItems.CRUDE_COPPER_TILL.get())
                .add(ModItems.CRUDE_IRON_TILL.get());
    }
}
