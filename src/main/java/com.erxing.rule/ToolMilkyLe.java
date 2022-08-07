package com.erxing.rule;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

import static com.erxing.rule.RegisterItems.MILKY_LE_INGOT;

public class ToolMilkyLe implements ToolMaterial {
    @Override
    public int getDurability() {
        return 2562;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 12.0F;
    }

    @Override
    public float getAttackDamage() {
        return 5.0F;
    }

    @Override
    public int getMiningLevel() {
        return 4;
    }

    @Override
    public int getEnchantability() {
        return 22;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(MILKY_LE_INGOT);
    }
}
