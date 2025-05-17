package net.sscaide.sscprimitivetools.worldgen.tree;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacerType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.sscaide.sscprimitivetools.PrimitiveTools;

public class ModTrunkPlacerTypes extends TrunkPlacerType {
    public static final DeferredRegister<TrunkPlacerType<?>> TRUNK_PLACER_TYPES = DeferredRegister.create(BuiltInRegistries.TRUNK_PLACER_TYPE, PrimitiveTools.MOD_ID);

    public ModTrunkPlacerTypes(MapCodec codec) {
        super(codec);
    }


    //


    public static void register(IEventBus eventBus) {
        TRUNK_PLACER_TYPES.register(eventBus);
    }
}
