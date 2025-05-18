package net.sscaide.sscprimitivetools.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.sscaide.sscprimitivetools.PrimitiveTools;
import net.sscaide.sscprimitivetools.block.ModBlocks;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PrimitiveTools.MOD_ID);

    public static final Supplier<CreativeModeTab> PRIMITIVE_TOOLS_TAB = CREATIVE_MODE_TAB.register("primitive_tools",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CRUDE_COPPER_PICK.get()))
                    .title(Component.translatable("creativetab.sscprimitivetools.creative_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.FIRE_PLOUGH);
                        output.accept(ModItems.BOW_DRILL);

                        output.accept(ModItems.SHARPENED_STICK);
                        output.accept(ModItems.SHARPENED_ROCK);
                        output.accept(ModItems.SHARPENED_COPPER_CHUNK);
                        output.accept(ModItems.SHARPENED_IRON_CHUNK);

                        output.accept(ModItems.CRUDE_STONE_KNIFE);
                        output.accept(ModItems.CRUDE_STONE_PICK);
                        output.accept(ModItems.CRUDE_STONE_HATCHET);
                        output.accept(ModItems.CRUDE_STONE_SPADE);
                        output.accept(ModItems.CRUDE_STONE_TILL);

                        output.accept(ModItems.FLINT_KNIFE);
                        output.accept(ModItems.FLINT_PICK);
                        output.accept(ModItems.FLINT_HATCHET);
                        output.accept(ModItems.FLINT_SPADE);
                        output.accept(ModItems.FLINT_TILL);

                        output.accept(ModItems.CRUDE_GOLD_KNIFE);
                        output.accept(ModItems.CRUDE_GOLD_PICK);
                        output.accept(ModItems.CRUDE_GOLD_HATCHET);
                        output.accept(ModItems.CRUDE_GOLD_SPADE);
                        output.accept(ModItems.CRUDE_GOLD_TILL);

                        output.accept(ModItems.CRUDE_COPPER_KNIFE);
                        output.accept(ModItems.CRUDE_COPPER_PICK);
                        output.accept(ModItems.CRUDE_COPPER_HATCHET);
                        output.accept(ModItems.CRUDE_COPPER_SPADE);
                        output.accept(ModItems.CRUDE_COPPER_TILL);

                        output.accept(ModItems.CRUDE_IRON_KNIFE);
                        output.accept(ModItems.CRUDE_IRON_PICK);
                        output.accept(ModItems.CRUDE_IRON_HATCHET);
                        output.accept(ModItems.CRUDE_IRON_SPADE);
                        output.accept(ModItems.CRUDE_IRON_TILL);


                        output.accept(ModItems.VINE);
                        output.accept(ModItems.COPPER_NUGGET);

                        output.accept(ModItems.WIDE_SHAPED_FLINT);
                        output.accept(ModItems.FANNED_SHAPED_FLINT);
                        output.accept(ModItems.LONG_SHAPED_FLINT);
                        output.accept(ModItems.THIN_SHAPED_FLINT);

                        output.accept(ModItems.WIDE_SHAPED_GOLD);
                        output.accept(ModItems.FANNED_SHAPED_GOLD);
                        output.accept(ModItems.LONG_SHAPED_GOLD);
                        output.accept(ModItems.JAGGED_SHAPED_GOLD);
                        output.accept(ModItems.THIN_SHAPED_GOLD);

                        output.accept(ModItems.WIDE_SHAPED_COPPER);
                        output.accept(ModItems.FANNED_SHAPED_COPPER);
                        output.accept(ModItems.LONG_SHAPED_COPPER);
                        output.accept(ModItems.JAGGED_SHAPED_COPPER);
                        output.accept(ModItems.THIN_SHAPED_COPPER);

                        output.accept(ModItems.WIDE_SHAPED_IRON);
                        output.accept(ModItems.FANNED_SHAPED_IRON);
                        output.accept(ModItems.LONG_SHAPED_IRON);
                        output.accept(ModItems.JAGGED_SHAPED_IRON);
                        output.accept(ModItems.THIN_SHAPED_IRON);
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }

}
