package xyz.orenjiao64.foodredux.init;

import net.minecraft.data.TexturedModel;
import net.minecraft.item.*;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.RegistryObject;
import xyz.orenjiao64.foodredux.init.ModItems;
import xyz.orenjiao64.foodredux.startup.Registry;
import javax.annotation.Nonnull;

public class TabOverride
{
    //Mod Tabs
    public static ItemGroup TAB_INGREDIENTS = new ItemGroup("food_ingredients") { @Override @Nonnull
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.DOUGH_RAW.get());}};
    public static ItemGroup TAB_BAKERY = new ItemGroup("food_bakery") { @Override @Nonnull
    public ItemStack makeIcon() {
        return new ItemStack(Items.BREAD);}};

    //Item Override:    Bakery
    public static final RegistryObject<Item> BREAD = Registry.ITEMS.register("bread",
            () -> new Item((new Item.Properties()).tab(TabOverride.TAB_BAKERY).food(Foods.BREAD)));
    //Item Override:    Ingredients


    public static void register() {}
}
