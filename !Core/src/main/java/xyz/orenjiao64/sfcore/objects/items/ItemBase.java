package xyz.orenjiao64.sfcore.objects.items;

import net.minecraft.item.Item;
import xyz.orenjiao64.sfcore.SFCore;
import xyz.orenjiao64.sfcore.init.ItemInit;
import xyz.orenjiao64.sfcore.util.RegModel;

public class ItemBase extends Item implements RegModel
{
    public ItemBase(String name)
    {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(SFCore.creativeTab);

        ItemInit.ITEMS.add(this);
    }

    @Override
    public void registerModels()
    {
        SFCore.proxy.registerItemRenderer(this, 0, "inventory");
    }
}