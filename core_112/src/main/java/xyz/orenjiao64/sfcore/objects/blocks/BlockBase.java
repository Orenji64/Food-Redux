package xyz.orenjiao64.sfcore.objects.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import xyz.orenjiao64.sfcore.SFCore;
import xyz.orenjiao64.sfcore.init.BlockInit;
import xyz.orenjiao64.sfcore.init.ItemInit;
import xyz.orenjiao64.sfcore.util.RegModel;

public class BlockBase extends Block implements RegModel
{
    public BlockBase(String name, Material material)
    {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(SFCore.creativeTab);

        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Override
    public void registerModels()
    {
        SFCore.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
}
