package net.sscaide.sscprimitivetools.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.sscaide.sscprimitivetools.PrimitiveTools;

public class ModTags {
    public static class Blocks {

        public static final TagKey<Block> NEEDS_SHARPENED_STICK = createTag("needs_sharpened_stick");
        public static final TagKey<Block> INCORRECT_FOR_SHARPENED_STICK = createTag("incorrect_for_sharpened_stick");
        public static final TagKey<Block> NEEDS_SHARPENED_ROCK = createTag("needs_sharpened_rock");
        public static final TagKey<Block> INCORRECT_FOR_SHARPENED_ROCK = createTag("incorrect_for_sharpened_rock");
        public static final TagKey<Block> NEEDS_CRUDE_STONE_TOOL = createTag("needs_crude_stone_tool");
        public static final TagKey<Block> INCORRECT_FOR_CRUDE_STONE_TOOL = createTag("incorrect_for_crude_stone_tool");
        public static final TagKey<Block> NEEDS_FLINT_TOOL = createTag("needs_flint_tool");
        public static final TagKey<Block> INCORRECT_FOR_FLINT_TOOL = createTag("incorrect_for_flint_tool");
        public static final TagKey<Block> NEEDS_CRUDE_GOLD_TOOL = createTag("needs_crude_gold_tool");
        public static final TagKey<Block> INCORRECT_FOR_CRUDE_GOLD_TOOL = createTag("incorrect_for_crude_gold_tool");
        public static final TagKey<Block> NEEDS_CRUDE_COPPER_TOOL = createTag("needs_crude_copper_tool");
        public static final TagKey<Block> INCORRECT_FOR_CRUDE_COPPER_TOOL = createTag("incorrect_for_crude_copper_tool");
        public static final TagKey<Block> NEEDS_CRUDE_IRON_TOOL = createTag("needs_crude_iron_tool");
        public static final TagKey<Block> INCORRECT_FOR_CRUDE_IRON_TOOL = createTag("incorrect_for_crude_iron_tool");


        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(PrimitiveTools.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> DAGGERS = createTag("daggers");


        public static final TagKey<Item> STRINGS_AND_VINES = createTag("strings_and_vines");


        public static final TagKey<Item> GOLD_INGOT_SMELTABLES = createTag("gold_ingot_smeltables");
        public static final TagKey<Item> GOLD_NUGGET_SMELTABLES = createTag("gold_nugget_smeltables");

        public static final TagKey<Item> COPPER_INGOT_SMELTABLES = createTag("copper_ingot_smeltables");
        public static final TagKey<Item> COPPER_NUGGET_SMELTABLES = createTag("copper_nugget_smeltables");

        public static final TagKey<Item> IRON_INGOT_SMELTABLES = createTag("iron_ingot_smeltables");
        public static final TagKey<Item> IRON_NUGGET_SMELTABLES = createTag("iron_nugget_smeltables");


        public static final TagKey<Item> CRUSHING_CRAFTING = createTag("crushing_crafting");
        public static final TagKey<Item> CRUSHING_CRAFTING_COPPER_PLUS = createTag("crushing_crafting_copper_plus");
        public static final TagKey<Item> CRUSHING_CRAFTING_IRON_PLUS = createTag("crushing_crafting_iron_plus");



        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(PrimitiveTools.MOD_ID, name));
        }
    }
}
