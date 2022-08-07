package com.erxing.rule;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.CropBlock;
import net.minecraft.block.Material;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RegisterItems {
    // 乐矿，梦开始的地方
    public static final Block LE_ORE = new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool());
    // 雪酪（一种植物）
    public static final CropBlock SNOW_CHEESE = new SnowCheese(AbstractBlock.Settings.of(Material.PLANT).nonOpaque().noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP));
    // 乐腚，康康你的
    public static final Item LE_INGOT = new AliasedBlockItem(SNOW_CHEESE, new Item.Settings().group(RuleMain.RULE_GROUP));
    // 乳乐腚，豪乳！
    public static final Item MILKY_LE_INGOT = new Item(new Item.Settings().group(RuleMain.RULE_GROUP));
    // 乳乐装备
    public static final ArmorMilkyLe MILKY_LE_ARMOR = new ArmorMilkyLe();
    public static final Item MILKY_LE_HELMET = new ArmorItem(MILKY_LE_ARMOR, EquipmentSlot.HEAD, new Item.Settings().group(RuleMain.RULE_GROUP));
    public static final Item MILKY_LE_CHESTPLATE = new ArmorItem(MILKY_LE_ARMOR, EquipmentSlot.HEAD, new Item.Settings().group(RuleMain.RULE_GROUP));
    public static final Item MILKY_LE_LEGGINGS = new ArmorItem(MILKY_LE_ARMOR, EquipmentSlot.HEAD, new Item.Settings().group(RuleMain.RULE_GROUP));
    public static final Item MILKY_LE_BOOTS = new ArmorItem(MILKY_LE_ARMOR, EquipmentSlot.HEAD, new Item.Settings().group(RuleMain.RULE_GROUP));
    // 乳乐工具
    // 酷黄瓜（？）
    public void Registry() {
        Registry.register(Registry.BLOCK, new Identifier(RuleMain.MODID, "le_ore"), LE_ORE);
        Registry.register(Registry.ITEM, new Identifier(RuleMain.MODID, "le_ore"), new BlockItem(LE_ORE, new Item.Settings().group(RuleMain.RULE_GROUP)));

        Registry.register(Registry.ITEM, new Identifier(RuleMain.MODID, "le_ingot"), LE_INGOT);
        Registry.register(Registry.ITEM, new Identifier(RuleMain.MODID, "milky_le_ingot"), MILKY_LE_INGOT);

        Registry.register(Registry.BLOCK, new Identifier(RuleMain.MODID, "snow_cheese"), SNOW_CHEESE);
        Registry.register(Registry.ITEM, new Identifier(RuleMain.MODID, "snow_cheese"), new Item(new Item.Settings().group(RuleMain.RULE_GROUP)));

        Registry.register(Registry.ITEM, new Identifier(RuleMain.MODID, "milky_le_helmet"), MILKY_LE_HELMET);
        Registry.register(Registry.ITEM, new Identifier(RuleMain.MODID, "milky_le_chestplate"), MILKY_LE_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(RuleMain.MODID, "milky_le_leggings"), MILKY_LE_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(RuleMain.MODID, "milky_le_boots"), MILKY_LE_BOOTS);

    }
}