package com.erxing.rule;

import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

public class MyPickaxeItem extends PickaxeItem {
    public MyPickaxeItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
}
