package xyz.orenjiao64.sfcore;

import net.minecraft.creativetab.CreativeTabs;
import xyz.orenjiao64.sfcore.util.Reference;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import xyz.orenjiao64.sfcore.SFCore;
import xyz.orenjiao64.sfcore.init.ItemInit;

public class SFTab extends CreativeTabs {

    public SFTab() {
        super(Reference.MODID);
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ItemInit.DOUGH);
    }
}