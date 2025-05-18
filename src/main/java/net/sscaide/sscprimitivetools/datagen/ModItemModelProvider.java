package net.sscaide.sscprimitivetools.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredItem;
import net.sscaide.sscprimitivetools.PrimitiveTools;
import net.sscaide.sscprimitivetools.item.ModItems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, PrimitiveTools.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        handheldItem(ModItems.SHARPENED_ROCK, 1);
        handheldItem(ModItems.SHARPENED_COPPER_CHUNK, 1);
        handheldItem(ModItems.SHARPENED_IRON_CHUNK, 1);

        handheldItem(ModItems.SHARPENED_STICK);
        basicItem(ModItems.FIRE_PLOUGH.get());
        basicItem(ModItems.BOW_DRILL.get());

        basicItem(ModItems.RANDOM_CRUDE_STONE_TOOL.get());
        handheldItem(ModItems.CRUDE_STONE_KNIFE);
        handheldItem(ModItems.CRUDE_STONE_PICK);
        handheldItem(ModItems.CRUDE_STONE_HATCHET);
        handheldItem(ModItems.CRUDE_STONE_SPADE);
        handheldItem(ModItems.CRUDE_STONE_TILL);

        basicItem(ModItems.RANDOM_FLINT_TOOL.get());
        handheldItem(ModItems.FLINT_KNIFE);
        handheldItem(ModItems.FLINT_PICK);
        handheldItem(ModItems.FLINT_HATCHET);
        handheldItem(ModItems.FLINT_SPADE);
        handheldItem(ModItems.FLINT_TILL);

        basicItem(ModItems.RANDOM_CRUDE_GOLD_TOOL.get());
        handheldItem(ModItems.CRUDE_GOLD_KNIFE);
        handheldItem(ModItems.CRUDE_GOLD_PICK);
        handheldItem(ModItems.CRUDE_GOLD_HATCHET);
        handheldItem(ModItems.CRUDE_GOLD_SPADE);
        handheldItem(ModItems.CRUDE_GOLD_TILL);

        basicItem(ModItems.RANDOM_CRUDE_COPPER_TOOL.get());
        handheldItem(ModItems.CRUDE_COPPER_KNIFE);
        handheldItem(ModItems.CRUDE_COPPER_PICK);
        handheldItem(ModItems.CRUDE_COPPER_HATCHET);
        handheldItem(ModItems.CRUDE_COPPER_SPADE);
        handheldItem(ModItems.CRUDE_COPPER_TILL);

        basicItem(ModItems.RANDOM_CRUDE_IRON_TOOL.get());
        handheldItem(ModItems.CRUDE_IRON_KNIFE);
        handheldItem(ModItems.CRUDE_IRON_PICK);
        handheldItem(ModItems.CRUDE_IRON_HATCHET);
        handheldItem(ModItems.CRUDE_IRON_SPADE);
        handheldItem(ModItems.CRUDE_IRON_TILL);


        basicItem(ModItems.VINE.get());
        basicItem(ModItems.COPPER_NUGGET.get());


        basicItem(ModItems.WIDE_SHAPED_FLINT.get());
        basicItem(ModItems.FANNED_SHAPED_FLINT.get());
        basicItem(ModItems.LONG_SHAPED_FLINT.get());
        basicItem(ModItems.THIN_SHAPED_FLINT.get());

        basicItem(ModItems.WIDE_SHAPED_GOLD.get());
        basicItem(ModItems.FANNED_SHAPED_GOLD.get());
        basicItem(ModItems.LONG_SHAPED_GOLD.get());
        basicItem(ModItems.JAGGED_SHAPED_GOLD.get());
        basicItem(ModItems.THIN_SHAPED_GOLD.get());

        basicItem(ModItems.WIDE_SHAPED_COPPER.get());
        basicItem(ModItems.FANNED_SHAPED_COPPER.get());
        basicItem(ModItems.LONG_SHAPED_COPPER.get());
        basicItem(ModItems.JAGGED_SHAPED_COPPER.get());
        basicItem(ModItems.THIN_SHAPED_COPPER.get());

        basicItem(ModItems.WIDE_SHAPED_IRON.get());
        basicItem(ModItems.FANNED_SHAPED_IRON.get());
        basicItem(ModItems.LONG_SHAPED_IRON.get());
        basicItem(ModItems.JAGGED_SHAPED_IRON.get());
        basicItem(ModItems.THIN_SHAPED_IRON.get());
    }

    private ItemModelBuilder handheldItem(DeferredItem<?> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/handheld")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(PrimitiveTools.MOD_ID,"item/" + item.getId().getPath()));
    }
    private ItemModelBuilder handheldItem(DeferredItem<?> item, int lol) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.fromNamespaceAndPath(modid, "item/handheld_rock")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(PrimitiveTools.MOD_ID,"item/" + item.getId().getPath()));
    }
}
