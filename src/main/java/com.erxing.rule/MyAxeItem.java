package com.erxing.rule;

import net.minecraft.item.AxeItem;
import net.minecraft.item.ToolMaterial;

public class MyAxeItem extends AxeItem {
    public MyAxeItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
}