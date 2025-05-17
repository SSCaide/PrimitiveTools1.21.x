package net.sscaide.sscprimitivetools.datagen;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.sscaide.sscprimitivetools.PrimitiveTools;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, PrimitiveTools.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

    }
}
