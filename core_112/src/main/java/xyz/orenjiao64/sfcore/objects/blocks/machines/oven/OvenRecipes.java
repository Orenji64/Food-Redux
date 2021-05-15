package xyz.orenjiao64.sfcore.objects.blocks.machines.oven;

import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ScheduledFuture;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Maps;
import com.google.common.collect.Table;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import xyz.orenjiao64.sfcore.init.BlockInit;
import xyz.orenjiao64.sfcore.init.ItemInit;

public class OvenRecipes
{
    private static final OvenRecipes INSTANCE = new OvenRecipes();
    private final Table<ItemStack, ItemStack, ItemStack> smeltingList = HashBasedTable.<ItemStack, ItemStack, ItemStack>create();
    private final Map<ItemStack, Float> experienceList = Maps.<ItemStack, Float>newHashMap();

    public static OvenRecipes getInstance()
    {
        return INSTANCE;
    }

    private OvenRecipes()
    {
        addOvenRecipe(new ItemStack(BlockInit.OVEN), new ItemStack(ItemInit.DOUGH), new ItemStack(ItemInit.DOUGHBALL), 3F);
    }


    public void addOvenRecipe(ItemStack input1, ItemStack input2, ItemStack result, float experience)
    {
        if(getOvenResult(input1, input2) != ItemStack.EMPTY) return;
        this.smeltingList.put(input1, input2, result);
        this.experienceList.put(result, Float.valueOf(experience));
    }

    public ItemStack getOvenResult(ItemStack input1, ItemStack input2)
    {
        for(Entry<ItemStack, Map<ItemStack, ItemStack>> entry : this.smeltingList.columnMap().entrySet())
        {
            if(this.compareItemStacks(input1, (ItemStack)entry.getKey()))
            {
                for(Entry<ItemStack, ItemStack> ent : entry.getValue().entrySet())
                {
                    if(this.compareItemStacks(input2, (ItemStack)ent.getKey()))
                    {
                        return (ItemStack)ent.getValue();
                    }
                }
            }
        }
        return ItemStack.EMPTY;
    }

    private boolean compareItemStacks(ItemStack stack1, ItemStack stack2)
    {
        return stack2.getItem() == stack1.getItem() && (stack2.getMetadata() == 32767 || stack2.getMetadata() == stack1.getMetadata());
    }

    public Table<ItemStack, ItemStack, ItemStack> getDualSmeltingList()
    {
        return this.smeltingList;
    }

    public float getOvenExperience(ItemStack stack)
    {
        for (Entry<ItemStack, Float> entry : this.experienceList.entrySet())
        {
            if(this.compareItemStacks(stack, (ItemStack)entry.getKey()))
            {
                return ((Float)entry.getValue()).floatValue();
            }
        }
        return 0.0F;
    }
}
