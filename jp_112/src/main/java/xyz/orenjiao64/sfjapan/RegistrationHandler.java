package xyz.orenjiao64.sfjapan;

import xyz.orenjiao64.sfcore.SFCore;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber(modid = SFJapan.MODID)
public class RegistrationHandler {

    @SubscribeEvent
    public static void registerItems(Register<Item> event) {
        final Item[] items = {
                new Item().setRegistryName(SFJapan.MODID, "test").setUnlocalizedName(SFJapan.MODID + "." + "test").setCreativeTab(SFCore.creativeTab)
        };

        event.getRegistry().registerAll(items);
    }

}