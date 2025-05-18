package net.sscaide.sscprimitivetools;

import net.sscaide.sscprimitivetools.block.blockentities.ModBlockEntities;
import net.sscaide.sscprimitivetools.component.ModDataComponents;
import net.sscaide.sscprimitivetools.effect.ModEffects;
import net.sscaide.sscprimitivetools.entity.ModEntities;
import net.sscaide.sscprimitivetools.item.ModCreativeModeTabs;
import net.sscaide.sscprimitivetools.item.ModItems;
import net.sscaide.sscprimitivetools.block.ModBlocks;
import net.sscaide.sscprimitivetools.recipe.ModRecipes;
import net.sscaide.sscprimitivetools.screen.ModMenuTypes;
import net.sscaide.sscprimitivetools.sound.ModSounds;
import net.sscaide.sscprimitivetools.worldgen.tree.ModFoliagePlacerTypes;
import net.sscaide.sscprimitivetools.worldgen.tree.ModTrunkPlacerTypes;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(PrimitiveTools.MOD_ID)
public class PrimitiveTools
{
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "sscprimitivetools";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    // The constructor for the mod class is the first code that is run when your mod is loaded.
    // FML will recognize some parameter types like IEventBus or ModContainer and pass them in automatically.
    public PrimitiveTools(IEventBus modEventBus, ModContainer modContainer)
    {
        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register ourselves for server and other game events we are interested in.
        // Note that this is necessary if and only if we want *this* class (ExampleMod) to respond directly to events.
        // Do not add this line if there are no @SubscribeEvent-annotated functions in this class, like onServerStarting() below.
        NeoForge.EVENT_BUS.register(this);

        ModCreativeModeTabs.register(modEventBus);


        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);


        ModDataComponents.register(modEventBus);
        ModSounds.register(modEventBus);


        // Register our mod's ModConfigSpec so that FML can create and load the config file for us
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @EventBusSubscriber(modid = MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {

        }
    }
}
