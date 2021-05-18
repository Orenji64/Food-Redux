/*
package xyz.orenjiao64.foodredux;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.BooleanValue;
import net.minecraftforge.common.ForgeConfigSpec.ConfigValue;
import net.minecraftforge.common.ForgeConfigSpec.EnumValue;
import net.minecraftforge.common.ForgeConfigSpec.IntValue;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.config.ModConfig;
import org.apache.commons.lang3.tuple.Pair;

public class FRConfig
{
    public static class Common
    {
        public BooleanValue replaceBread;
        public BooleanValue replaceTabs;

        Common(final ForgeConfigSpec.Builder builder)
        {
            replaceBread = builder
                    .comment("Replace the Vanilla bread recipe")
                    .translation("foodredux.config.replaceBread")
                    .define("replaceBread", true);

            replaceTabs = builder
                    .comment("Replace the Vanilla food tab")
                    .translation("foodredux.confid.replaceTabs")
                    .define("replaceTabs",true);

            builder.pop();
        }
    }

    private static final ForgeConfigSpec commonSpec;
    public static final Common COMMON;

    static {
        final Pair<Common, ForgeConfigSpec> specPair = new ForgeConfigSpec.Builder().configure(Common::new);
        commonSpec = specPair.getRight();
        COMMON = specPair.getLeft();
    }

    public static void register(final ModLoadingContext context)
    {
        context.registerConfig(ModConfig.Type.COMMON, commonSpec);
    }
}
*/
