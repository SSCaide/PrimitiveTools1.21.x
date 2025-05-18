package net.sscaide.sscprimitivetools.item;

import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.sscaide.sscprimitivetools.PrimitiveTools;
import net.sscaide.sscprimitivetools.item.custom.*;

import static net.sscaide.sscprimitivetools.component.ModDataComponents.*;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(PrimitiveTools.MOD_ID);

    public static final DeferredItem<SharpenedRockItem> SHARPENED_ROCK = ITEMS.register("sharpened_rock",
            () -> new SharpenedRockItem(ModToolTiers.SHARPENED_ROCK, new Item.Properties().stacksTo(1).setNoRepair()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.SHARPENED_ROCK, .5f, -2.8f))
                    .craftRemainder(Items.COBBLESTONE)));
    public static final DeferredItem<SharpenedRockItem> SHARPENED_COPPER_CHUNK = ITEMS.register("sharpened_copper_chunk",
            () -> new SharpenedRockItem(ModToolTiers.SHARPENED_COPPER_CHUNK, new Item.Properties().stacksTo(1).setNoRepair()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.SHARPENED_COPPER_CHUNK, .6f, -2.8f))
                    .craftRemainder(Items.COBBLESTONE)));
    public static final DeferredItem<SharpenedRockItem> SHARPENED_IRON_CHUNK = ITEMS.register("sharpened_iron_chunk",
            () -> new SharpenedRockItem(ModToolTiers.SHARPENED_IRON_CHUNK, new Item.Properties().stacksTo(1).setNoRepair()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.SHARPENED_IRON_CHUNK, .7f, -2.8f))
                    .craftRemainder(Items.COBBLESTONE)));

    public static final DeferredItem<PickaxeItem> SHARPENED_STICK = ITEMS.register("sharpened_stick",
            () -> new PickaxeItem(ModToolTiers.SHARPENED_STICK, new Item.Properties().stacksTo(1).setNoRepair()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.SHARPENED_STICK, .5f, -2.8f))));
    public static final DeferredItem<FirePloughItem> FIRE_PLOUGH = ITEMS.register("fire_plough",
            () -> new FirePloughItem(new Item.Properties().stacksTo(1).setNoRepair().durability(32)
                    .component(FIRE_CHANCE.get(), new Integer(0)).component(IN_USE.get(), new Boolean(false))
                    .component(TICKER.get(), new Integer(10)), 45, 4));
    public static final DeferredItem<FirePloughItem> BOW_DRILL = ITEMS.register("bow_drill",
            () -> new FirePloughItem(new Item.Properties().stacksTo(1).setNoRepair().durability(28)
                    .component(FIRE_CHANCE.get(), new Integer(0)).component(IN_USE.get(), new Boolean(false))
                    .component(TICKER.get(), new Integer(10)), 36, 3));


    public static final DeferredItem<RandomToolItem> RANDOM_CRUDE_STONE_TOOL = ITEMS.register("random_crude_stone_tool",
            () -> new RandomToolItem(new Item.Properties().stacksTo(1), "tooltip.sscprimitivetools.random_crude_stone_tool.tooltip",
                    ModItems.CRUDE_STONE_KNIFE, ModItems.CRUDE_STONE_PICK, ModItems.CRUDE_STONE_HATCHET, ModItems.CRUDE_STONE_SPADE,
                    ModItems.CRUDE_STONE_TILL));
    public static final DeferredItem<DaggerItem> CRUDE_STONE_KNIFE = ITEMS.register("crude_stone_knife",
            () -> new DaggerItem(ModToolTiers.CRUDE_STONE, new Item.Properties()
                    .attributes(DaggerItem.createAttributes(ModToolTiers.CRUDE_STONE, 3, -2.1f, -1))
                    .craftRemainder(Items.COBBLESTONE)));
    public static final DeferredItem<PickaxeItem> CRUDE_STONE_PICK = ITEMS.register("crude_stone_pick",
            () -> new PickaxeItem(ModToolTiers.CRUDE_STONE, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.CRUDE_STONE, 1, -2.8f))));
    public static final DeferredItem<ShovelItem> CRUDE_STONE_SPADE = ITEMS.register("crude_stone_spade",
            () -> new ShovelItem(ModToolTiers.CRUDE_STONE, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.CRUDE_STONE, 1.5f, -3.0f))));
    public static final DeferredItem<AxeItem> CRUDE_STONE_HATCHET = ITEMS.register("crude_stone_hatchet",
            () -> new AxeItem(ModToolTiers.CRUDE_STONE, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.CRUDE_STONE, 4.5f, -3.2f))));
    public static final DeferredItem<HoeItem> CRUDE_STONE_TILL = ITEMS.register("crude_stone_till",
            () -> new HoeItem(ModToolTiers.CRUDE_STONE, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.CRUDE_STONE, 0, -3.0f))));

    public static final DeferredItem<RandomFlintToolItem> RANDOM_FLINT_TOOL = ITEMS.register("random_flint_tool",
            () -> new RandomFlintToolItem(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<DaggerItem> FLINT_KNIFE = ITEMS.register("flint_knife",
            () -> new DaggerItem(ModToolTiers.FLINT, new Item.Properties()
                    .attributes(DaggerItem.createAttributes(ModToolTiers.FLINT, 3, -2.1f, -1))
                    .craftRemainder(Items.COBBLESTONE)));
    public static final DeferredItem<PickaxeItem> FLINT_PICK = ITEMS.register("flint_pick",
            () -> new PickaxeItem(ModToolTiers.FLINT, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.FLINT, 1, -2.8f))));
    public static final DeferredItem<ShovelItem> FLINT_SPADE = ITEMS.register("flint_spade",
            () -> new ShovelItem(ModToolTiers.FLINT, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.FLINT, 1.5f, -3.0f))));
    public static final DeferredItem<AxeItem> FLINT_HATCHET = ITEMS.register("flint_hatchet",
            () -> new AxeItem(ModToolTiers.FLINT, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.FLINT, 3f, -3.2f))));
    public static final DeferredItem<HoeItem> FLINT_TILL = ITEMS.register("flint_till",
            () -> new HoeItem(ModToolTiers.FLINT, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.FLINT, 0, -3.0f))));

    public static final DeferredItem<RandomToolItem> RANDOM_CRUDE_GOLD_TOOL = ITEMS.register("random_crude_gold_tool",
            () -> new RandomToolItem(new Item.Properties().stacksTo(1), "tooltip.sscprimitivetools.random_crude_gold_tool.tooltip",
                    ModItems.CRUDE_GOLD_KNIFE, ModItems.CRUDE_GOLD_PICK, ModItems.CRUDE_GOLD_HATCHET, ModItems.CRUDE_GOLD_SPADE,
                    ModItems.CRUDE_GOLD_TILL));
    public static final DeferredItem<DaggerItem> CRUDE_GOLD_KNIFE = ITEMS.register("crude_gold_knife",
            () -> new DaggerItem(ModToolTiers.CRUDE_GOLD, new Item.Properties()
                    .attributes(DaggerItem.createAttributes(ModToolTiers.CRUDE_GOLD, 3, -2.1f, -1))
                    .craftRemainder(Items.COBBLESTONE)));
    public static final DeferredItem<PickaxeItem> CRUDE_GOLD_PICK = ITEMS.register("crude_gold_pick",
            () -> new PickaxeItem(ModToolTiers.CRUDE_GOLD, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.CRUDE_GOLD, 1, -2.8f))));
    public static final DeferredItem<ShovelItem> CRUDE_GOLD_SPADE = ITEMS.register("crude_gold_spade",
            () -> new ShovelItem(ModToolTiers.CRUDE_GOLD, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.CRUDE_GOLD, 1.5f, -3.0f))));
    public static final DeferredItem<AxeItem> CRUDE_GOLD_HATCHET = ITEMS.register("crude_gold_hatchet",
            () -> new AxeItem(ModToolTiers.CRUDE_GOLD, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.CRUDE_GOLD, 3f, -3.2f))));
    public static final DeferredItem<HoeItem> CRUDE_GOLD_TILL = ITEMS.register("crude_gold_till",
            () -> new HoeItem(ModToolTiers.CRUDE_GOLD, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.CRUDE_GOLD, 0, -3.0f))));

    public static final DeferredItem<RandomToolItem> RANDOM_CRUDE_COPPER_TOOL = ITEMS.register("random_crude_copper_tool",
            () -> new RandomToolItem(new Item.Properties().stacksTo(1), "tooltip.sscprimitivetools.random_crude_copper_tool.tooltip",
                    ModItems.CRUDE_COPPER_KNIFE, ModItems.CRUDE_COPPER_PICK, ModItems.CRUDE_COPPER_HATCHET, ModItems.CRUDE_COPPER_SPADE,
                    ModItems.CRUDE_COPPER_TILL));
    public static final DeferredItem<DaggerItem> CRUDE_COPPER_KNIFE = ITEMS.register("crude_copper_knife",
            () -> new DaggerItem(ModToolTiers.CRUDE_COPPER, new Item.Properties()
                    .attributes(DaggerItem.createAttributes(ModToolTiers.CRUDE_COPPER, 3, -2.1f, -1))
                    .craftRemainder(Items.COBBLESTONE)));
    public static final DeferredItem<PickaxeItem> CRUDE_COPPER_PICK = ITEMS.register("crude_copper_pick",
            () -> new PickaxeItem(ModToolTiers.CRUDE_COPPER, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.CRUDE_COPPER, 1, -2.8f))));
    public static final DeferredItem<ShovelItem> CRUDE_COPPER_SPADE = ITEMS.register("crude_copper_spade",
            () -> new ShovelItem(ModToolTiers.CRUDE_COPPER, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.CRUDE_COPPER, 1.5f, -3.0f))));
    public static final DeferredItem<AxeItem> CRUDE_COPPER_HATCHET = ITEMS.register("crude_copper_hatchet",
            () -> new AxeItem(ModToolTiers.CRUDE_COPPER, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.CRUDE_COPPER, 4.5f, -3.2f))));
    public static final DeferredItem<HoeItem> CRUDE_COPPER_TILL = ITEMS.register("crude_copper_till",
            () -> new HoeItem(ModToolTiers.CRUDE_COPPER, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.CRUDE_COPPER, 0, -3.0f))));

    public static final DeferredItem<RandomToolItem> RANDOM_CRUDE_IRON_TOOL = ITEMS.register("random_crude_iron_tool",
            () -> new RandomToolItem(new Item.Properties().stacksTo(1), "tooltip.sscprimitivetools.random_crude_iron_tool.tooltip",
                    ModItems.CRUDE_IRON_KNIFE, ModItems.CRUDE_IRON_PICK, ModItems.CRUDE_IRON_HATCHET, ModItems.CRUDE_IRON_SPADE,
                    ModItems.CRUDE_IRON_TILL));
    public static final DeferredItem<DaggerItem> CRUDE_IRON_KNIFE = ITEMS.register("crude_iron_knife",
            () -> new DaggerItem(ModToolTiers.CRUDE_IRON, new Item.Properties()
                    .attributes(DaggerItem.createAttributes(ModToolTiers.CRUDE_IRON, 3, -2.1f, -1))
                    .craftRemainder(Items.COBBLESTONE)));
    public static final DeferredItem<PickaxeItem> CRUDE_IRON_PICK = ITEMS.register("crude_iron_pick",
            () -> new PickaxeItem(ModToolTiers.CRUDE_IRON, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.CRUDE_IRON, 1, -2.8f))));
    public static final DeferredItem<ShovelItem> CRUDE_IRON_SPADE = ITEMS.register("crude_iron_spade",
            () -> new ShovelItem(ModToolTiers.CRUDE_IRON, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.CRUDE_IRON, 1.5f, -3.0f))));
    public static final DeferredItem<AxeItem> CRUDE_IRON_HATCHET = ITEMS.register("crude_iron_hatchet",
            () -> new AxeItem(ModToolTiers.CRUDE_IRON, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.CRUDE_IRON, 4.5f, -3.2f))));
    public static final DeferredItem<HoeItem> CRUDE_IRON_TILL = ITEMS.register("crude_iron_till",
            () -> new HoeItem(ModToolTiers.CRUDE_IRON, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.CRUDE_IRON, 0, -3.0f))));



    public static final DeferredItem<Item> VINE = ITEMS.register("vine",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> COPPER_NUGGET = ITEMS.register("copper_nugget",
            () -> new Item(new Item.Properties()));


    public static final DeferredItem<SimpleItemWithTooltip> WIDE_SHAPED_FLINT = ITEMS.register("wide_shaped_flint",
            () -> new SimpleItemWithTooltip(new Item.Properties(), "tooltip.sscprimitivetools.wide_shaped_flint.tooltip"));
    public static final DeferredItem<SimpleItemWithTooltip> FANNED_SHAPED_FLINT = ITEMS.register("fanned_shaped_flint",
            () -> new SimpleItemWithTooltip(new Item.Properties(), "tooltip.sscprimitivetools.fanned_shaped_flint.tooltip"));
    public static final DeferredItem<SimpleItemWithTooltip> LONG_SHAPED_FLINT = ITEMS.register("long_shaped_flint",
            () -> new SimpleItemWithTooltip(new Item.Properties(), "tooltip.sscprimitivetools.long_shaped_flint.tooltip"));
    public static final DeferredItem<SimpleItemWithTooltip> THIN_SHAPED_FLINT = ITEMS.register("thin_shaped_flint",
            () -> new SimpleItemWithTooltip(new Item.Properties(), "tooltip.sscprimitivetools.thin_shaped_flint.tooltip"));

    public static final DeferredItem<SimpleItemWithTooltip> WIDE_SHAPED_GOLD = ITEMS.register("wide_shaped_gold",
            () -> new SimpleItemWithTooltip(new Item.Properties(), "tooltip.sscprimitivetools.wide_shaped_gold.tooltip"));
    public static final DeferredItem<SimpleItemWithTooltip> FANNED_SHAPED_GOLD = ITEMS.register("fanned_shaped_gold",
            () -> new SimpleItemWithTooltip(new Item.Properties(), "tooltip.sscprimitivetools.fanned_shaped_gold.tooltip"));
    public static final DeferredItem<SimpleItemWithTooltip> LONG_SHAPED_GOLD = ITEMS.register("long_shaped_gold",
            () -> new SimpleItemWithTooltip(new Item.Properties(), "tooltip.sscprimitivetools.long_shaped_gold.tooltip"));
    public static final DeferredItem<SimpleItemWithTooltip> JAGGED_SHAPED_GOLD = ITEMS.register("jagged_shaped_gold",
            () -> new SimpleItemWithTooltip(new Item.Properties(), "tooltip.sscprimitivetools.jagged_shaped_gold.tooltip"));
    public static final DeferredItem<SimpleItemWithTooltip> THIN_SHAPED_GOLD = ITEMS.register("thin_shaped_gold",
            () -> new SimpleItemWithTooltip(new Item.Properties(), "tooltip.sscprimitivetools.thin_shaped_gold.tooltip"));

    public static final DeferredItem<SimpleItemWithTooltip> WIDE_SHAPED_COPPER = ITEMS.register("wide_shaped_copper",
            () -> new SimpleItemWithTooltip(new Item.Properties(), "tooltip.sscprimitivetools.wide_shaped_copper.tooltip"));
    public static final DeferredItem<SimpleItemWithTooltip> FANNED_SHAPED_COPPER = ITEMS.register("fanned_shaped_copper",
            () -> new SimpleItemWithTooltip(new Item.Properties(), "tooltip.sscprimitivetools.fanned_shaped_copper.tooltip"));
    public static final DeferredItem<SimpleItemWithTooltip> LONG_SHAPED_COPPER = ITEMS.register("long_shaped_copper",
            () -> new SimpleItemWithTooltip(new Item.Properties(), "tooltip.sscprimitivetools.long_shaped_copper.tooltip"));
    public static final DeferredItem<SimpleItemWithTooltip> JAGGED_SHAPED_COPPER = ITEMS.register("jagged_shaped_copper",
            () -> new SimpleItemWithTooltip(new Item.Properties(), "tooltip.sscprimitivetools.jagged_shaped_copper.tooltip"));
    public static final DeferredItem<SimpleItemWithTooltip> THIN_SHAPED_COPPER = ITEMS.register("thin_shaped_copper",
            () -> new SimpleItemWithTooltip(new Item.Properties(), "tooltip.sscprimitivetools.thin_shaped_copper.tooltip"));

    public static final DeferredItem<SimpleItemWithTooltip> WIDE_SHAPED_IRON = ITEMS.register("wide_shaped_iron",
            () -> new SimpleItemWithTooltip(new Item.Properties(), "tooltip.sscprimitivetools.wide_shaped_iron.tooltip"));
    public static final DeferredItem<SimpleItemWithTooltip> FANNED_SHAPED_IRON = ITEMS.register("fanned_shaped_iron",
            () -> new SimpleItemWithTooltip(new Item.Properties(), "tooltip.sscprimitivetools.fanned_shaped_iron.tooltip"));
    public static final DeferredItem<SimpleItemWithTooltip> LONG_SHAPED_IRON = ITEMS.register("long_shaped_iron",
            () -> new SimpleItemWithTooltip(new Item.Properties(), "tooltip.sscprimitivetools.long_shaped_iron.tooltip"));
    public static final DeferredItem<SimpleItemWithTooltip> JAGGED_SHAPED_IRON = ITEMS.register("jagged_shaped_iron",
            () -> new SimpleItemWithTooltip(new Item.Properties(), "tooltip.sscprimitivetools.jagged_shaped_iron.tooltip"));
    public static final DeferredItem<SimpleItemWithTooltip> THIN_SHAPED_IRON = ITEMS.register("thin_shaped_iron",
            () -> new SimpleItemWithTooltip(new Item.Properties(), "tooltip.sscprimitivetools.thin_shaped_iron.tooltip"));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
