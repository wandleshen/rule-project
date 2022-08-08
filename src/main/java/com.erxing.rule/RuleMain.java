package com.erxing.rule;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.*;
import net.minecraft.util.*;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.CountPlacementModifier;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.SquarePlacementModifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class RuleMain implements ModInitializer {

    public static final Logger LOGGER = LoggerFactory.getLogger("rule");
    public static final String MODID = "rule";
    public static final ItemGroup RULE_GROUP = FabricItemGroupBuilder.build(new Identifier(MODID, "rule"), () -> new ItemStack(RegisterItems.LE_ORE));
    public static final RegisterItems reg = new RegisterItems();
    public static final RuleClient client = new RuleClient();
    private static final ConfiguredFeature<?, ?> OVERWORLD_LE_ORE_CONFIGURED = new ConfiguredFeature
            (Feature.ORE, new OreFeatureConfig(
                    OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    RegisterItems.LE_ORE.getDefaultState(),
                    3 // vein size
            ));
    public static final PlacedFeature OVERWORLD_LE_ORE_PLACED = new PlacedFeature(
            RegistryEntry.of(OVERWORLD_LE_ORE_CONFIGURED),
            Arrays.asList(
                    CountPlacementModifier.of(20), // number of veins per chunk
                    SquarePlacementModifier.of(),
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(64))
            ));
    @Override
    public void onInitialize() {
        LOGGER.info("My Rule Project!");
        reg.registry();
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier(MODID, "overworld_le_ore"), OVERWORLD_LE_ORE_CONFIGURED);
        Registry.register(BuiltinRegistries.PLACED_FEATURE,
                new Identifier(MODID, "overworld_le_ore"), OVERWORLD_LE_ORE_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
                RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                        new Identifier(MODID, "overworld_le_ore")));
        client.onInitializeClient();
    }
}