package com.erxing.rule;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.CropBlock;
import net.minecraft.block.Material;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RegisterItems {
    // 乐矿，梦开始的地方
    public static final Block LE_ORE = new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool());
    // 雪酪（一种植物）
    public static final CropBlock SNOW_CHEESE = new SnowCheese(AbstractBlock.Settings.of(Material.PLANT).nonOpaque().noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP));
    private static final FoodComponent CHEESE = new FoodComponent.Builder().hunger(4).saturationModifier(4.0F).alwaysEdible().build();
    // 乐腚，康康你的
    public static final Item LE_INGOT = new AliasedBlockItem(SNOW_CHEESE, new Item.Settings().group(RuleMain.RULE_GROUP));
    // 乳乐腚，豪乳！
    public static final Item MILKY_LE_INGOT = new Item(new Item.Settings().group(RuleMain.RULE_GROUP));
    // 乳乐装备
    public static final ArmorMilkyLe MILKY_LE_ARMOR = new ArmorMilkyLe();
    public static final Item MILKY_LE_HELMET = new ArmorItem(MILKY_LE_ARMOR, EquipmentSlot.HEAD, new Item.Settings().group(RuleMain.RULE_GROUP));
    public static final Item MILKY_LE_CHESTPLATE = new ArmorItem(MILKY_LE_ARMOR, EquipmentSlot.CHEST, new Item.Settings().group(RuleMain.RULE_GROUP));
    public static final Item MILKY_LE_LEGGINGS = new ArmorItem(MILKY_LE_ARMOR, EquipmentSlot.LEGS, new Item.Settings().group(RuleMain.RULE_GROUP));
    public static final Item MILKY_LE_BOOTS = new ArmorItem(MILKY_LE_ARMOR, EquipmentSlot.FEET, new Item.Settings().group(RuleMain.RULE_GROUP));
    // 乳乐工具
    public static final ToolMilkyLe MILKY_LE_TOOL = new ToolMilkyLe();
    public static final ToolItem MILKY_LE_SWORD = new SwordItem(MILKY_LE_TOOL, 3, -2.4F, new Item.Settings().group(RuleMain.RULE_GROUP));
    public static final ToolItem MILKY_LE_SHOVEL = new ShovelItem(MILKY_LE_TOOL, 1.5F, -3.0F, new Item.Settings().group(RuleMain.RULE_GROUP));
    public static final ToolItem MILKY_LE_PICKAXE = new MyPickaxeItem(MILKY_LE_TOOL, 1, -2.8F, new Item.Settings().group(RuleMain.RULE_GROUP));
    public static final ToolItem MILKY_LE_AXE = new MyAxeItem(MILKY_LE_TOOL, 6, -3.0F, new Item.Settings().group(RuleMain.RULE_GROUP));
    public static final ToolItem MILKY_LE_HOE = new MyHoeItem(MILKY_LE_TOOL, -5, 0.0F, new Item.Settings().group(RuleMain.RULE_GROUP));
    // 一把弓（
    public static final BowItem THUNDERING_PULSE = new BowItem(new Item.Settings().group(RuleMain.RULE_GROUP));
    // 酷黄瓜（？）
    public static final Item COOL_CUM_BER = new CoolCumBer(new Item.Settings().group(RuleMain.RULE_GROUP));
    // 滋养珠·叁
    // public static final Item NOURISHMENT_BEADS =
    public void registry() {
        Registry.register(Registry.BLOCK, new Identifier(RuleMain.MODID, "le_ore"), LE_ORE);
        Registry.register(Registry.ITEM, new Identifier(RuleMain.MODID, "le_ore"), new BlockItem(LE_ORE, new Item.Settings().group(RuleMain.RULE_GROUP)));

        Registry.register(Registry.ITEM, new Identifier(RuleMain.MODID, "le_ingot"), LE_INGOT);
        Registry.register(Registry.ITEM, new Identifier(RuleMain.MODID, "milky_le_ingot"), MILKY_LE_INGOT);

        Registry.register(Registry.BLOCK, new Identifier(RuleMain.MODID, "snow_cheese"), SNOW_CHEESE);
        Registry.register(Registry.ITEM, new Identifier(RuleMain.MODID, "snow_cheese"), new Item(new Item.Settings().food(CHEESE).group(RuleMain.RULE_GROUP)));

        Registry.register(Registry.ITEM, new Identifier(RuleMain.MODID, "milky_le_helmet"), MILKY_LE_HELMET);
        Registry.register(Registry.ITEM, new Identifier(RuleMain.MODID, "milky_le_chestplate"), MILKY_LE_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(RuleMain.MODID, "milky_le_leggings"), MILKY_LE_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(RuleMain.MODID, "milky_le_boots"), MILKY_LE_BOOTS);

        Registry.register(Registry.ITEM, new Identifier(RuleMain.MODID, "milky_le_sword"), MILKY_LE_SWORD);
        Registry.register(Registry.ITEM, new Identifier(RuleMain.MODID, "milky_le_shovel"), MILKY_LE_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(RuleMain.MODID, "milky_le_pickaxe"), MILKY_LE_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(RuleMain.MODID, "milky_le_axe"), MILKY_LE_AXE);
        Registry.register(Registry.ITEM, new Identifier(RuleMain.MODID, "milky_le_hoe"), MILKY_LE_HOE);

        Registry.register(Registry.ITEM, new Identifier(RuleMain.MODID, "thundering_pulse"), THUNDERING_PULSE);
        Registry.register(Registry.ITEM, new Identifier(RuleMain.MODID, "cool_cum_ber"), COOL_CUM_BER);
    }
}
