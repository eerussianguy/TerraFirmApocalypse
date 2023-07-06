package com.hyperdash.firmaciv.config;

import com.hyperdash.firmaciv.config.ServerConfig;
import net.dries007.tfc.util.Helpers;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.config.IConfigSpec;
import net.minecraftforge.fml.config.ModConfig;
import org.apache.commons.lang3.tuple.Pair;

import java.util.function.Function;

public class FirmacivConfig {

    public static final ServerConfig SERVER;

    public FirmacivConfig() {
    }

    private static <C> C register(ModConfig.Type type, Function<ForgeConfigSpec.Builder, C> factory) {
        Pair<C, ForgeConfigSpec> specPair = (new ForgeConfigSpec.Builder()).configure(factory);

        return specPair.getLeft();
    }

    static {
        SERVER = (com.hyperdash.firmaciv.config.ServerConfig)register(ModConfig.Type.SERVER, com.hyperdash.firmaciv.config.ServerConfig::new);
    }


}
