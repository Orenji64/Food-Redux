package xyz.orenjiao64.sfcore.init;

import net.minecraft.block.BlockFurnace;
import net.minecraft.block.material.Material;
import xyz.orenjiao64.sfcore.objects.blocks.BlockBase;
import xyz.orenjiao64.sfcore.objects.blocks.machines.oven.BlockOven;
import net.minecraft.block.Block;
import java.util.ArrayList;
import java.util.List;

public class BlockInit
{
    public static final List<Block> BLOCKS = new ArrayList<Block>();

    //BLOCKS
    public static final Block OVEN = new BlockOven("oven");
}
