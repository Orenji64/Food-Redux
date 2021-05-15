package xyz.orenjiao64.sfcore.init;

import xyz.orenjiao64.sfcore.SFCore;
import xyz.orenjiao64.sfcore.objects.items.food.SFItemFood;
import xyz.orenjiao64.sfcore.objects.items.ItemBase;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import xyz.orenjiao64.sfcore.util.Reference;

import java.util.ArrayList;
import java.util.List;

public class ItemInit {

    public static final List<Item> ITEMS = new ArrayList<Item>();

    //Mats
    public static final Item DOUGH = new ItemBase("dough");
    public static final Item FLOUR = new ItemBase("flour");
    //Food
    public static final Item DOUGHBALL = new SFItemFood("doughball", 3, 0.3F, false);
}