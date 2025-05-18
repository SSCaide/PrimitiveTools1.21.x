package net.sscaide.sscprimitivetools.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.sscaide.sscprimitivetools.item.ModItems;
import net.sscaide.sscprimitivetools.util.ModTags;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries, ExistingFileHelper existingFileHelper) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.WIDE_SHAPED_FLINT.get(), 1)
                .requires(ModTags.Items.CRUSHING_CRAFTING)
                .requires(Items.FLINT, 1)
                .group("flint_shaping")
                .unlockedBy("has_flint", has(Items.FLINT)).save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.FANNED_SHAPED_FLINT.get(), 1)
                .requires(ModTags.Items.CRUSHING_CRAFTING)
                .requires(ModItems.WIDE_SHAPED_FLINT)
                .group("flint_shaping")
                .unlockedBy("has_wide_shaped_flint", has(ModItems.WIDE_SHAPED_FLINT)).save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.LONG_SHAPED_FLINT.get(), 1)
                .requires(ModTags.Items.CRUSHING_CRAFTING)
                .requires(ModItems.FANNED_SHAPED_FLINT)
                .group("flint_shaping")
                .unlockedBy("has_fanned_shaped_flint", has(ModItems.FANNED_SHAPED_FLINT)).save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.THIN_SHAPED_FLINT.get(), 1)
                .requires(ModTags.Items.CRUSHING_CRAFTING)
                .requires(ModItems.LONG_SHAPED_FLINT)
                .group("flint_shaping")
                .unlockedBy("has_long_shaped_flint", has(ModItems.LONG_SHAPED_FLINT)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.WIDE_SHAPED_GOLD.get(), 1)
                .requires(ModTags.Items.CRUSHING_CRAFTING)
                .requires(Items.RAW_GOLD, 1)
                .group("gold_shaping")
                .unlockedBy("has_raw_gold", has(Items.RAW_GOLD)).save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.FANNED_SHAPED_GOLD.get(), 1)
                .requires(ModTags.Items.CRUSHING_CRAFTING)
                .requires(ModItems.WIDE_SHAPED_GOLD)
                .group("gold_shaping")
                .unlockedBy("has_wide_shaped_gold", has(ModItems.WIDE_SHAPED_GOLD)).save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.LONG_SHAPED_GOLD.get(), 1)
                .requires(ModTags.Items.CRUSHING_CRAFTING)
                .requires(ModItems.FANNED_SHAPED_GOLD)
                .group("gold_shaping")
                .unlockedBy("has_fanned_shaped_gold", has(ModItems.FANNED_SHAPED_GOLD)).save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.JAGGED_SHAPED_GOLD.get(), 1)
                .requires(ModTags.Items.CRUSHING_CRAFTING)
                .requires(ModItems.LONG_SHAPED_GOLD)
                .group("gold_shaping")
                .unlockedBy("has_long_shaped_gold", has(ModItems.LONG_SHAPED_GOLD)).save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.THIN_SHAPED_GOLD.get(), 1)
                .requires(ModTags.Items.CRUSHING_CRAFTING)
                .requires(ModItems.JAGGED_SHAPED_GOLD)
                .group("gold_shaping")
                .unlockedBy("has_jagged_shaped_gold", has(ModItems.JAGGED_SHAPED_GOLD)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.WIDE_SHAPED_COPPER.get(), 1)
                .requires(ModTags.Items.CRUSHING_CRAFTING)
                .requires(Items.RAW_COPPER, 1)
                .group("copper_shaping")
                .unlockedBy("has_raw_copper", has(Items.RAW_COPPER)).save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.FANNED_SHAPED_COPPER.get(), 1)
                .requires(ModTags.Items.CRUSHING_CRAFTING)
                .requires(ModItems.WIDE_SHAPED_COPPER)
                .group("copper_shaping")
                .unlockedBy("has_wide_shaped_copper", has(ModItems.WIDE_SHAPED_COPPER)).save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.LONG_SHAPED_COPPER.get(), 1)
                .requires(ModTags.Items.CRUSHING_CRAFTING)
                .requires(ModItems.FANNED_SHAPED_COPPER)
                .group("copper_shaping")
                .unlockedBy("has_fanned_shaped_copper", has(ModItems.FANNED_SHAPED_COPPER)).save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.JAGGED_SHAPED_COPPER.get(), 1)
                .requires(ModTags.Items.CRUSHING_CRAFTING)
                .requires(ModItems.LONG_SHAPED_COPPER)
                .group("copper_shaping")
                .unlockedBy("has_long_shaped_copper", has(ModItems.LONG_SHAPED_COPPER)).save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.THIN_SHAPED_COPPER.get(), 1)
                .requires(ModTags.Items.CRUSHING_CRAFTING)
                .requires(ModItems.JAGGED_SHAPED_COPPER)
                .group("copper_shaping")
                .unlockedBy("has_jagged_shaped_copper", has(ModItems.JAGGED_SHAPED_COPPER)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.WIDE_SHAPED_IRON.get(), 1)
                .requires(ModTags.Items.CRUSHING_CRAFTING_COPPER_PLUS)
                .requires(Items.RAW_IRON, 1)
                .group("iron_shaping")
                .unlockedBy("has_raw_iron", has(Items.RAW_IRON)).save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.FANNED_SHAPED_IRON.get(), 1)
                .requires(ModTags.Items.CRUSHING_CRAFTING_COPPER_PLUS)
                .requires(ModItems.WIDE_SHAPED_IRON)
                .group("iron_shaping")
                .unlockedBy("has_wide_shaped_iron", has(ModItems.WIDE_SHAPED_IRON)).save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.LONG_SHAPED_IRON.get(), 1)
                .requires(ModTags.Items.CRUSHING_CRAFTING_COPPER_PLUS)
                .requires(ModItems.FANNED_SHAPED_IRON)
                .group("iron_shaping")
                .unlockedBy("has_fanned_shaped_iron", has(ModItems.FANNED_SHAPED_IRON)).save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.JAGGED_SHAPED_IRON.get(), 1)
                .requires(ModTags.Items.CRUSHING_CRAFTING_COPPER_PLUS)
                .requires(ModItems.LONG_SHAPED_IRON)
                .group("iron_shaping")
                .unlockedBy("has_long_shaped_iron", has(ModItems.LONG_SHAPED_IRON)).save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.THIN_SHAPED_IRON.get(), 1)
                .requires(ModTags.Items.CRUSHING_CRAFTING_COPPER_PLUS)
                .requires(ModItems.JAGGED_SHAPED_IRON)
                .group("iron_shaping")
                .unlockedBy("has_jagged_shaped_iron", has(ModItems.JAGGED_SHAPED_IRON)).save(recipeOutput);



        ShapelessRecipeBuilder.shapeless(RecipeCategory.TOOLS, ModItems.SHARPENED_STICK.get(), 1)
                .requires(ModTags.Items.DAGGERS)
                .requires(Items.STICK)
                .unlockedBy("has_stick", has(Items.STICK)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.FIRE_PLOUGH.get())
                .pattern("A ")
                .pattern(" A")
                .define('A', Items.STICK).group("fire_plough")
                .unlockedBy("has_stick", has(Items.STICK)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.BOW_DRILL.get())
                .pattern("AB")
                .pattern(" A")
                .define('A', Items.STICK)
                .define('B', Items.STRING).group("bow_drill")
                .unlockedBy("has_string", has(Items.STRING)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.SHARPENED_ROCK.get())
                .pattern("A ")
                .pattern(" A")
                .define('A', ItemTags.STONE_TOOL_MATERIALS)
                .unlockedBy("has_any_rock", has(ItemTags.STONE_TOOL_MATERIALS)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.TOOLS, ModItems.SHARPENED_COPPER_CHUNK.get())
                .requires(ModTags.Items.CRUSHING_CRAFTING)
                .requires(Items.RAW_COPPER, 2)
                .unlockedBy("has_raw_copper", has(Items.RAW_COPPER)).save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.TOOLS, ModItems.SHARPENED_IRON_CHUNK.get())
                .requires(ModTags.Items.CRUSHING_CRAFTING_COPPER_PLUS)
                .requires(Items.RAW_IRON, 2)
                .unlockedBy("has_raw_iron", has(Items.RAW_IRON)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.RANDOM_CRUDE_STONE_TOOL.get())
                .pattern("AB")
                .pattern("AC")
                .define('A', Items.STICK)
                .define('B', ModItems.VINE)
                .define('C', ItemTags.STONE_TOOL_MATERIALS)
                .unlockedBy("has_any_rock", has(ItemTags.STONE_TOOL_MATERIALS)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, Items.STONE_SWORD)
                .pattern(" A ")
                .pattern(" A ")
                .pattern(" B ")
                .define('A', Items.STONE).define('B', Items.STICK)
                .unlockedBy("has_any_rock", has(ItemTags.STONE_TOOL_MATERIALS)).save(recipeOutput, "stone_sword_smooth");
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, Items.STONE_PICKAXE)
                .pattern("AAA")
                .pattern(" B ")
                .pattern(" B ")
                .define('A', Items.STONE).define('B', Items.STICK)
                .unlockedBy("has_any_rock", has(ItemTags.STONE_TOOL_MATERIALS)).save(recipeOutput, "stone_pick_smooth");
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, Items.STONE_AXE)
                .pattern("AA ")
                .pattern("AB ")
                .pattern(" B ")
                .define('A', Items.STONE).define('B', Items.STICK)
                .unlockedBy("has_any_rock", has(ItemTags.STONE_TOOL_MATERIALS)).save(recipeOutput, "stone_axe_smooth");
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, Items.STONE_HOE)
                .pattern("AA ")
                .pattern(" B ")
                .pattern(" B ")
                .define('A', Items.STONE).define('B', Items.STICK)
                .unlockedBy("has_any_rock", has(ItemTags.STONE_TOOL_MATERIALS)).save(recipeOutput, "stone_hoe_smooth");
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, Items.STONE_SHOVEL)
                .pattern(" A ")
                .pattern(" B ")
                .pattern(" B ")
                .define('A', Items.STONE).define('B', Items.STICK)
                .unlockedBy("has_any_rock", has(ItemTags.STONE_TOOL_MATERIALS)).save(recipeOutput, "stone_shovel_smooth");

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.FLINT_KNIFE.get())
                .pattern("CB")
                .pattern("A ")
                .define('A', Items.STICK)
                .define('B', ModTags.Items.STRINGS_AND_VINES)
                .define('C', Items.FLINT)
                .unlockedBy("has_flint", has(Items.FLINT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.RANDOM_FLINT_TOOL.get())
                .pattern("BC")
                .pattern("A ")
                .define('A', Items.STICK)
                .define('B', ModTags.Items.STRINGS_AND_VINES)
                .define('C', Items.FLINT)
                .unlockedBy("has_flint", has(Items.FLINT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.FLINT_SPADE.get())
                .pattern("BC")
                .pattern("A ")
                .define('A', Items.STICK)
                .define('B', ModTags.Items.STRINGS_AND_VINES)
                .define('C', ModItems.WIDE_SHAPED_FLINT)
                .unlockedBy("has_wide_shaped_flint", has(ModItems.WIDE_SHAPED_FLINT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.FLINT_HATCHET.get())
                .pattern("BC")
                .pattern("A ")
                .define('A', Items.STICK)
                .define('B', ModTags.Items.STRINGS_AND_VINES)
                .define('C', ModItems.FANNED_SHAPED_FLINT)
                .unlockedBy("has_fanned_shaped_flint", has(ModItems.FANNED_SHAPED_FLINT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.FLINT_PICK.get())
                .pattern("BC")
                .pattern("A ")
                .define('A', Items.STICK)
                .define('B', ModTags.Items.STRINGS_AND_VINES)
                .define('C', ModItems.LONG_SHAPED_FLINT)
                .unlockedBy("has_long_shaped_flint", has(ModItems.LONG_SHAPED_FLINT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.FLINT_TILL.get())
                .pattern("BC")
                .pattern("A ")
                .define('A', Items.STICK)
                .define('B', ModTags.Items.STRINGS_AND_VINES)
                .define('C', ModItems.THIN_SHAPED_FLINT)
                .unlockedBy("has_thin_shaped_flint", has(ModItems.THIN_SHAPED_FLINT)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.RANDOM_CRUDE_GOLD_TOOL.get())
                .pattern("BC")
                .pattern("A ")
                .define('A', Items.STICK)
                .define('B', ModTags.Items.STRINGS_AND_VINES)
                .define('C', Items.RAW_GOLD)
                .unlockedBy("has_raw_gold", has(Items.RAW_GOLD)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.CRUDE_GOLD_SPADE.get())
                .pattern("BC")
                .pattern("A ")
                .define('A', Items.STICK)
                .define('B', ModTags.Items.STRINGS_AND_VINES)
                .define('C', ModItems.WIDE_SHAPED_GOLD)
                .unlockedBy("has_wide_shaped_gold", has(ModItems.WIDE_SHAPED_GOLD)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.CRUDE_GOLD_HATCHET.get())
                .pattern("BC")
                .pattern("A ")
                .define('A', Items.STICK)
                .define('B', ModTags.Items.STRINGS_AND_VINES)
                .define('C', ModItems.FANNED_SHAPED_GOLD)
                .unlockedBy("has_fanned_shaped_gold", has(ModItems.FANNED_SHAPED_GOLD)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.CRUDE_GOLD_PICK.get())
                .pattern("BC")
                .pattern("A ")
                .define('A', Items.STICK)
                .define('B', ModTags.Items.STRINGS_AND_VINES)
                .define('C', ModItems.LONG_SHAPED_GOLD)
                .unlockedBy("has_long_shaped_gold", has(ModItems.LONG_SHAPED_GOLD)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.CRUDE_GOLD_KNIFE.get())
                .pattern("BC")
                .pattern("A ")
                .define('A', Items.STICK)
                .define('B', ModTags.Items.STRINGS_AND_VINES)
                .define('C', ModItems.JAGGED_SHAPED_GOLD)
                .unlockedBy("has_jagged_shaped_gold", has(ModItems.JAGGED_SHAPED_GOLD)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.CRUDE_GOLD_TILL.get())
                .pattern("BC")
                .pattern("A ")
                .define('A', Items.STICK)
                .define('B', ModTags.Items.STRINGS_AND_VINES)
                .define('C', ModItems.THIN_SHAPED_GOLD)
                .unlockedBy("has_thin_shaped_gold", has(ModItems.THIN_SHAPED_GOLD)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.RANDOM_CRUDE_COPPER_TOOL.get())
                .pattern("BC")
                .pattern("A ")
                .define('A', Items.STICK)
                .define('B', ModTags.Items.STRINGS_AND_VINES)
                .define('C', Items.RAW_COPPER)
                .unlockedBy("has_raw_copper", has(Items.RAW_COPPER)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.CRUDE_COPPER_SPADE.get())
                .pattern("BC")
                .pattern("A ")
                .define('A', Items.STICK)
                .define('B', ModTags.Items.STRINGS_AND_VINES)
                .define('C', ModItems.WIDE_SHAPED_COPPER)
                .unlockedBy("has_wide_shaped_copper", has(ModItems.WIDE_SHAPED_COPPER)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.CRUDE_COPPER_HATCHET.get())
                .pattern("BC")
                .pattern("A ")
                .define('A', Items.STICK)
                .define('B', ModTags.Items.STRINGS_AND_VINES)
                .define('C', ModItems.FANNED_SHAPED_COPPER)
                .unlockedBy("has_fanned_shaped_copper", has(ModItems.FANNED_SHAPED_COPPER)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.CRUDE_COPPER_PICK.get())
                .pattern("BC")
                .pattern("A ")
                .define('A', Items.STICK)
                .define('B', ModTags.Items.STRINGS_AND_VINES)
                .define('C', ModItems.LONG_SHAPED_COPPER)
                .unlockedBy("has_long_shaped_copper", has(ModItems.LONG_SHAPED_COPPER)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.CRUDE_COPPER_KNIFE.get())
                .pattern("BC")
                .pattern("A ")
                .define('A', Items.STICK)
                .define('B', ModTags.Items.STRINGS_AND_VINES)
                .define('C', ModItems.JAGGED_SHAPED_COPPER)
                .unlockedBy("has_jagged_shaped_copper", has(ModItems.JAGGED_SHAPED_COPPER)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.CRUDE_COPPER_TILL.get())
                .pattern("BC")
                .pattern("A ")
                .define('A', Items.STICK)
                .define('B', ModTags.Items.STRINGS_AND_VINES)
                .define('C', ModItems.THIN_SHAPED_COPPER)
                .unlockedBy("has_thin_shaped_copper", has(ModItems.THIN_SHAPED_COPPER)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.RANDOM_CRUDE_IRON_TOOL.get())
                .pattern("BC")
                .pattern("A ")
                .define('A', Items.STICK)
                .define('B', ModTags.Items.STRINGS_AND_VINES)
                .define('C', Items.RAW_IRON)
                .unlockedBy("has_raw_iron", has(Items.RAW_IRON)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.CRUDE_IRON_SPADE.get())
                .pattern("BC")
                .pattern("A ")
                .define('A', Items.STICK)
                .define('B', ModTags.Items.STRINGS_AND_VINES)
                .define('C', ModItems.WIDE_SHAPED_IRON)
                .unlockedBy("has_wide_shaped_iron", has(ModItems.WIDE_SHAPED_IRON)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.CRUDE_IRON_HATCHET.get())
                .pattern("BC")
                .pattern("A ")
                .define('A', Items.STICK)
                .define('B', ModTags.Items.STRINGS_AND_VINES)
                .define('C', ModItems.FANNED_SHAPED_IRON)
                .unlockedBy("has_fanned_shaped_iron", has(ModItems.FANNED_SHAPED_IRON)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.CRUDE_IRON_PICK.get())
                .pattern("BC")
                .pattern("A ")
                .define('A', Items.STICK)
                .define('B', ModTags.Items.STRINGS_AND_VINES)
                .define('C', ModItems.LONG_SHAPED_IRON)
                .unlockedBy("has_long_shaped_iron", has(ModItems.LONG_SHAPED_IRON)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.CRUDE_IRON_KNIFE.get())
                .pattern("BC")
                .pattern("A ")
                .define('A', Items.STICK)
                .define('B', ModTags.Items.STRINGS_AND_VINES)
                .define('C', ModItems.JAGGED_SHAPED_IRON)
                .unlockedBy("has_jagged_shaped_iron", has(ModItems.JAGGED_SHAPED_IRON)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.CRUDE_IRON_TILL.get())
                .pattern("BC")
                .pattern("A ")
                .define('A', Items.STICK)
                .define('B', ModTags.Items.STRINGS_AND_VINES)
                .define('C', ModItems.THIN_SHAPED_IRON)
                .unlockedBy("has_thin_shaped_iron", has(ModItems.THIN_SHAPED_IRON)).save(recipeOutput);


        List<ItemLike> GOLD_INGOT_SMELTABLES = List.of(ModItems.WIDE_SHAPED_GOLD, ModItems.FANNED_SHAPED_GOLD);
        oreSmelting(recipeOutput, GOLD_INGOT_SMELTABLES, RecipeCategory.MISC, Items.GOLD_INGOT, 0.25f, 200, "gold");
        oreBlasting(recipeOutput, GOLD_INGOT_SMELTABLES, RecipeCategory.MISC, Items.GOLD_INGOT, 0.25f, 100, "gold");
        List<ItemLike> GOLD_NUGGET_SMELTABLES = List.of(ModItems.LONG_SHAPED_GOLD, ModItems.JAGGED_SHAPED_GOLD, ModItems.THIN_SHAPED_GOLD);
        oreSmelting(recipeOutput, GOLD_NUGGET_SMELTABLES, RecipeCategory.MISC, Items.GOLD_NUGGET, 0.25f, 200, "gold_nugget");
        oreBlasting(recipeOutput, GOLD_NUGGET_SMELTABLES, RecipeCategory.MISC, Items.GOLD_NUGGET, 0.25f, 100, "gold_nugget");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.COPPER_NUGGET, 9)
                .requires(Items.COPPER_INGOT, 1)
                .unlockedBy("has_copper_ingot", has(Items.COPPER_INGOT)).save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.COPPER_INGOT, 1)
                .requires(ModItems.COPPER_NUGGET, 9)
                .unlockedBy("has_copper_nugget", has(ModItems.COPPER_NUGGET)).save(recipeOutput);
        List<ItemLike> COPPER_INGOT_SMELTABLES = List.of(ModItems.WIDE_SHAPED_COPPER, ModItems.FANNED_SHAPED_COPPER);
        oreSmelting(recipeOutput, COPPER_INGOT_SMELTABLES, RecipeCategory.MISC, Items.COPPER_INGOT, 0.25f, 200, "copper");
        oreBlasting(recipeOutput, COPPER_INGOT_SMELTABLES, RecipeCategory.MISC, Items.COPPER_INGOT, 0.25f, 100, "copper");
        List<ItemLike> COPPER_NUGGET_SMELTABLES = List.of(ModItems.LONG_SHAPED_COPPER, ModItems.JAGGED_SHAPED_COPPER, ModItems.THIN_SHAPED_COPPER);
        oreSmelting(recipeOutput, COPPER_NUGGET_SMELTABLES, RecipeCategory.MISC, ModItems.COPPER_NUGGET, 0.25f, 200, "copper_nugget");
        oreBlasting(recipeOutput, COPPER_NUGGET_SMELTABLES, RecipeCategory.MISC, ModItems.COPPER_NUGGET, 0.25f, 100, "copper_nugget");

        List<ItemLike> IRON_INGOT_SMELTABLES = List.of(ModItems.WIDE_SHAPED_IRON, ModItems.FANNED_SHAPED_IRON);
        oreSmelting(recipeOutput, IRON_INGOT_SMELTABLES, RecipeCategory.MISC, Items.IRON_INGOT, 0.25f, 200, "iron");
        oreBlasting(recipeOutput, IRON_INGOT_SMELTABLES, RecipeCategory.MISC, Items.IRON_INGOT, 0.25f, 100, "iron");
        List<ItemLike> IRON_NUGGET_SMELTABLES = List.of(ModItems.LONG_SHAPED_IRON, ModItems.JAGGED_SHAPED_IRON, ModItems.THIN_SHAPED_IRON);
        oreSmelting(recipeOutput, IRON_NUGGET_SMELTABLES, RecipeCategory.MISC, Items.IRON_NUGGET, 0.25f, 200, "iron_nugget");
        oreBlasting(recipeOutput, IRON_NUGGET_SMELTABLES, RecipeCategory.MISC, Items.IRON_NUGGET, 0.25f, 100, "iron_nugget");


    }
}


