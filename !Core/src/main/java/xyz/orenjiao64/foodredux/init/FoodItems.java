package xyz.orenjiao64.foodredux.init;

import net.minecraft.item.ChorusFruitItem;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.SoupItem;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.fml.RegistryObject;
import xyz.orenjiao64.foodredux.util.Registry;

public class FoodItems
{
    //Core: Overworld
    public static final RegistryObject<Item> DOUGH_BAKED = Registry.ITEMS.register("dough_baked",
            () -> new Item(new Item.Properties().tab(TabOverride.TAB_BAKERY).food(
                    new Food.Builder().nutrition(2).saturationMod(0.3F).fast().build())));
    public static final RegistryObject<Item> SUGARCUBE = Registry.ITEMS.register("sugarcube",
            () -> new Item(new Item.Properties().tab(TabOverride.TAB_BAKERY).food
                    (new Food.Builder().nutrition(0).fast().effect(() ->
                            new EffectInstance(Effects.MOVEMENT_SPEED, 200, 5),1F).effect(() ->
                            new EffectInstance(Effects.HARM, 1, 6), 0.8F).alwaysEat().build())));

    //Core: Nether Expansion
    public static final RegistryObject<Item> NETHER_STEW = Registry.ITEMS.register("nether_mushroom_stew",
            () -> new SoupItem( new Item.Properties().tab(TabOverride.TAB_SOUP).food(
                    new Food.Builder().nutrition(6).saturationMod(0.6F).build())));
    public static final RegistryObject<Item> CRIMSON_PIE = Registry.ITEMS.register("crimson_pie",
            () -> new Item(new Item.Properties().tab(TabOverride.TAB_BAKERY).food(
                    new Food.Builder().nutrition(8).saturationMod(0.3F).build())));
    public static final RegistryObject<Item> WARPED_PIE = Registry.ITEMS.register("warped_pie",
            () -> new Item(new Item.Properties().tab(TabOverride.TAB_BAKERY).food(
                    new Food.Builder().nutrition(8).saturationMod(0.3F).build())));
    //Core: End Expansion
    public static final RegistryObject<Item> CHORUS_PIE = Registry.ITEMS.register("chorus_pie",
            () -> new ChorusFruitItem(new Item.Properties().tab(TabOverride.TAB_BAKERY).food(
                    new Food.Builder().nutrition(8).saturationMod(0.3F).build())));
    public static final RegistryObject<Item> CHORUS_PIE_NULL = Registry.ITEMS.register("chorus_pie_null",
            () -> new Item(new Item.Properties().tab(TabOverride.TAB_BAKERY).food(
                    new Food.Builder().nutrition(8).saturationMod(0.3F).build())));


    //Registry
    public static void register() {}
}
