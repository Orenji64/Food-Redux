package net.orenji64.foodredux.init;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.orenji64.foodredux.util.Registry;

public class BaseItems
{
    //Core: Overworld
    public static final RegistryObject<Item> FLOUR = Registry.ITEMS.register("flour",
            () -> new Item(new Item.Properties().tab(TabOverride.TAB_INGREDIENTS)));
    public static final RegistryObject<Item> DOUGH_RAW = Registry.ITEMS.register("dough_raw",
            () -> new Item(new Item.Properties().tab(TabOverride.TAB_INGREDIENTS)));
    public static final RegistryObject<Item> BREAD_RAW = Registry.ITEMS.register("bread_raw",
            () -> new Item(new Item.Properties().tab(TabOverride.TAB_INGREDIENTS)));
    public static final RegistryObject<Item> PIE_BASE = Registry.ITEMS.register("pie_base",
            () -> new Item(new Item.Properties().tab(TabOverride.TAB_INGREDIENTS)));
    //Core: Nether Expansion
    public static final RegistryObject<Item> CRIMSON_POWDER = Registry.ITEMS.register("crimson_powder",
            () -> new Item(new Item.Properties().tab(TabOverride.TAB_INGREDIENTS)));
    public static final RegistryObject<Item> WARPED_POWDER = Registry.ITEMS.register("warped_powder",
            () -> new Item(new Item.Properties().tab(TabOverride.TAB_INGREDIENTS)));
    //Core: End Expansion

    //Registry
    public static void register() {}
}
