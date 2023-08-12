package net.yossho.latamdelight.worldgen;


import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;
import net.yossho.latamdelight.LatamDelight;
import net.yossho.latamdelight.block.ModBlocks;

import java.util.List;

public class ModPlacedFeatures {
    public static final ResourceKey<PlacedFeature> WILD_JALAPENO_PLACED_KEY = createKey("wild_jalapeno_placed");
    public static final ResourceKey<PlacedFeature> WILD_BEANS_PLACED_KEY = createKey("wild_beans_placed");
    public static final ResourceKey<PlacedFeature> WILD_GARLIC_PLACED_KEY = createKey("wild_garlic_placed");

    public static void  bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, WILD_JALAPENO_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.WILD_JALAPENO_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(1, 0.05f, 2), ModBlocks.WILD_JALAPENO.get()));
        register(context, WILD_BEANS_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.WILD_BEANS_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(1, 0.05f, 2), ModBlocks.WILD_BEANS.get()));
        register(context, WILD_GARLIC_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.WILD_GARLIC_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(1, 0.05f, 2), ModBlocks.WILD_GARLIC.get()));
    }

    private static ResourceKey<PlacedFeature> createKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(LatamDelight.MOD_ID, name));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }
}
