package com.erxing.rule;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.*;
import net.minecraft.util.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RuleMain implements ModInitializer {

    public static final Logger LOGGER = LoggerFactory.getLogger("rule");
    public static final String MODID = "rule";
    public static final ItemGroup RULE_GROUP = FabricItemGroupBuilder.build(new Identifier(MODID, "rule"), () -> new ItemStack(RegisterItems.LE_ORE));
    public static final RegisterItems reg = new RegisterItems();
    public static final RuleClient client = new RuleClient();

    @Override
    public void onInitialize() {
        LOGGER.info("My Rule Project!");
        reg.Registry();
        client.onInitializeClient();
    }
}