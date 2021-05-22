package net.orenji64.foodredux.init;

import net.minecraft.item.*;


import javax.annotation.Nonnull;

public class TabOverride
{
    //Mod Tabs
    public static ItemGroup TAB_INGREDIENTS = new ItemGroup("food_ingredients") { @Override@Nonnull
            public ItemStack makeIcon() {
                return new ItemStack(BaseItems.DOUGH_RAW.get()); }};
    public static ItemGroup TAB_BAKERY = new ItemGroup("food_bakery") { @Override@Nonnull
            public ItemStack makeIcon() {
                return new ItemStack(Items.BREAD); }};
    public static ItemGroup TAB_FRUITVEG = new ItemGroup("food_fruitveg") { @Override@Nonnull
            public ItemStack makeIcon() {
                return new ItemStack(Items.APPLE); }};
    public static ItemGroup TAB_SOUP = new ItemGroup("food_soup") { @Override@Nonnull
    public ItemStack makeIcon() {
        return new ItemStack(FoodItems.NETHER_STEW.get()); }};

    //Item Override:    Bakery

    //Item Override:    Ingredients
}
