package com.erxing.rule;

import net.minecraft.item.HoeItem;
import net.minecraft.item.ToolMaterial;

public class MyHoeItem extends HoeItem {
    public MyHoeItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
}
