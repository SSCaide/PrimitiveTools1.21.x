package net.sscaide.sscprimitivetools.worldgen.tree;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacerType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.sscaide.sscprimitivetools.PrimitiveTools;

public class ModFoliagePlacerTypes extends FoliagePlacerType {
    public static final DeferredRegister<FoliagePlacerType<?>> FOLIAGE_PLACER_TYPES = DeferredRegister.create(BuiltInRegistries.FOLIAGE_PLACER_TYPE, PrimitiveTools.MOD_ID);

    public ModFoliagePlacerTypes(MapCodec codec) {
        super(codec);
    }


    //


    public static void register(IEventBus eventBus) {
        FOLIAGE_PLACER_TYPES.register(eventBus);
    }

}
