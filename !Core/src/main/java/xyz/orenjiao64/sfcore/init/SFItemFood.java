package xyz.orenjiao64.sfcore.init;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import xyz.orenjiao64.sfcore.SFCore;
import net.minecraft.item.ItemFood;

public class SFItemFood extends ItemFood {

    public static final SFItemFood DOUGHBALL = new SFItemFood("doughball", 3, 0.3F, false);

    protected String name;

    public SFItemFood(String name, int amount, float saturation, boolean isWolfFood) {
        super(amount, saturation, isWolfFood);
        this.name = name;
        setUnlocalizedName(name);
        setRegistryName(name);
        this.setCreativeTab(SFCore.creativeTab);
    }

    public void registerModel(Item item, int meta) {
        ModelLoader.setCustomModelResourceLocation(item, meta,
                new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }


}