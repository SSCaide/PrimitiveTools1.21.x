package net.sscaide.sscprimitivetools.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.client.model.generators.VariantBlockStateBuilder;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.sscaide.sscprimitivetools.PrimitiveTools;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, PrimitiveTools.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {


    }

    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }
    private void blockWithItem(DeferredBlock<?> block, String name, ResourceLocation texture) {
        ModelFile model = models().cubeAll(name, texture);
        VariantBlockStateBuilder variantBuilder = getVariantBuilder(block.get());
        VariantBlockStateBuilder.PartialBlockstate partialState = variantBuilder.partialState();
        getVariantBuilder(block.get()).addModels(partialState, partialState.modelForState().modelFile(model).build());
        simpleBlockItem(block.get(), model);
    }

    private void blockItem(DeferredBlock<?> deferredBlock) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("sscmorecobble:block/" + deferredBlock.getId().getPath()));
    }

    private void blockItem(DeferredBlock<?> deferredBlock, String appendix) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("sscmorecobble:block/" + deferredBlock.getId().getPath() + appendix));
    }
}
