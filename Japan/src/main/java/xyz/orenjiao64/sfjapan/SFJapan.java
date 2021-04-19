package xyz.orenjiao64.sfjapan;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = SFJapan.MODID, name = SFJapan.NAME, version = SFJapan.VERSION)
public class SFJapan
{
    public static final String MODID = "sfjapan";
    public static final String NAME = "Simply Foods - Japan";
    public static final String VERSION = "0.0.1";
    public static final String MC_VERSION = "[1.12.2]";

    public static final Logger LOGGER = LogManager.getLogger(SFJapan.MODID);

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {

    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        LOGGER.info(SFJapan.NAME + " says hello.");
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}
