package xyz.orenjiao64.sfcore.client;

import xyz.orenjiao64.sfcore.SFCore;
import xyz.orenjiao64.sfcore.init.ItemBase;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import xyz.orenjiao64.sfcore.SFCore;

@EventBusSubscriber(value = Side.CLIENT, modid = SFCore.MODID)
public class ModelReg {

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
        registerModel(ItemBase.DOUGH, 0);
    }

    private static void registerModel(Item item, int meta) {
        ModelLoader.setCustomModelResourceLocation(item, meta,
                new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }

}