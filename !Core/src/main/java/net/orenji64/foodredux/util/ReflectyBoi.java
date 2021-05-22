package net.orenji64.foodredux.util;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraftforge.fml.common.ObfuscationReflectionHelper;
import org.jline.utils.Log;

import java.lang.reflect.*;

public class ReflectyBoi
{
    //Change icon
    public static void EditField()
    {
        try {
            Field field = ObfuscationReflectionHelper.findField(ItemGroup.class, "field_151245_t");
            field.set(ItemGroup.TAB_FOOD, new ItemStack(Items.COOKIE));
        } catch (Throwable e) {
            Log.warn("Reflection on Tab override unsuccessful");
            e.printStackTrace();
        }
    }
}
