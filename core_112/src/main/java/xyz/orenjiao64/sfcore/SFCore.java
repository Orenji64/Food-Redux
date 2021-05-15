package xyz.orenjiao64.sfcore;

import net.minecraftforge.fml.common.SidedProxy;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import xyz.orenjiao64.sfcore.proxy.ClientProxy;
import xyz.orenjiao64.sfcore.proxy.CommonProxy;
import xyz.orenjiao64.sfcore.recipes.FurnaceRecipes;
import xyz.orenjiao64.sfcore.util.Reference;

import java.sql.Ref;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.MC_VERSION)
public class SFCore {

    public static final SFTab creativeTab = new SFTab();

    @Instance
    public static SFCore instance;
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        FurnaceRecipes.initSmelting();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    }

    @SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
    public static CommonProxy proxy;

}