package xyz.orenjiao64.sfcore;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber(modid = SFCore.MODID)
public class Reg {

    @SubscribeEvent
    public static void registerItems(Register<Item> event) {
        final Item[] items = {
                new Item().setRegistryName(SFCore.MODID, "dough").setUnlocalizedName(SFCore.MODID + "." + "dough").setCreativeTab(SFCore.creativeTab)
        };

        event.getRegistry().registerAll(items);
    }

}