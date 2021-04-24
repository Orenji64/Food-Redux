package xyz.orenjiao64.sfcore.objects.items.food;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import xyz.orenjiao64.sfcore.SFCore;
import xyz.orenjiao64.sfcore.init.ItemInit;
import xyz.orenjiao64.sfcore.util.RegModel;
import net.minecraft.item.ItemFood;

public class SFItemFood extends ItemFood implements RegModel{

    public SFItemFood(String name, int amount, float saturation, boolean isWolfFood) {
        super(amount, saturation, isWolfFood);
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