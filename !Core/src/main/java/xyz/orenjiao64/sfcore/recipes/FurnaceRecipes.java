package xyz.orenjiao64.sfcore.recipes;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import xyz.orenjiao64.sfcore.init.ItemInit;

public class FurnaceRecipes
{
    public static void initSmelting()
    {
        GameRegistry.addSmelting(ItemInit.DOUGH, new ItemStack(ItemInit.DOUGHBALL), 10.0F);
    }
}
