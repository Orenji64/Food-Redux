package xyz.orenjiao64.sfcore.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import xyz.orenjiao64.sfcore.SFCore;
import xyz.orenjiao64.sfcore.util.Reference;

public class Reference
{
    public static final String MODID = "sfcore";
    public static final String NAME = "SimplyFood - Core";
    public static final String VERSION = "0.0.1";
    public static final String MC_VERSION = "[1.12.2]";
    public static final String CLIENT = "xyz.orenjiao64.sfcore.proxy.ClientProxy";
    public static final String COMMON = "xyz.orenjiao64.sfcore.proxy.CommonProxy";
    public static final Logger LOGGER = LogManager.getLogger(Reference.MODID);

    public static final int GUI_OVEN = 0;
}
