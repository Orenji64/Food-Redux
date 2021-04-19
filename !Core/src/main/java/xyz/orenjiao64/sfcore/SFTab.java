package xyz.orenjiao64.sfcore;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import xyz.orenjiao64.sfcore.SFCore;
import xyz.orenjiao64.sfcore.init.ItemBase;

public class SFTab extends CreativeTabs {

    public SFTab() {
        super(SFCore.MODID);
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ItemBase.DOUGH);
    }
}