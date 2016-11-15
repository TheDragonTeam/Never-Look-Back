/*
 * Copyright (c) TheDragonTeam 2016.
 */

package net.thedragonteam.neverlookback.proxy;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.thedragonteam.neverlookback.NVBConfig;
import net.thedragonteam.neverlookback.client.gui.NLBTab;
import net.thedragonteam.neverlookback.progression.ProgressionDataHandler;
import net.thedragonteam.neverlookback.registry.ModBlocks;
import net.thedragonteam.neverlookback.registry.ModItems;
import net.thedragonteam.neverlookback.registry.ModRecipes;
import net.thedragonteam.neverlookback.resources.GlobalEventsModBase;
import net.thedragonteam.thedragonlib.config.ModConfigProcessor;
import net.thedragonteam.thedragonlib.util.LogHelper;

public class CommonProxy {

    public static ModConfigProcessor configProcessor = new ModConfigProcessor();

    public static Configuration configuration;

    public void preInit(FMLPreInitializationEvent event) {
        ProgressionDataHandler.register();
        ModItems.init();
        ModBlocks.init();
        configuration = new Configuration(event.getSuggestedConfigurationFile());
        configProcessor.processConfig(NVBConfig.class, configuration);
        LogHelper.info("Finished PreInitialization");
    }

    public void init(FMLInitializationEvent event) {
        NLBTab.initialize();
        MinecraftForge.EVENT_BUS.register(new GlobalEventsModBase());
        ModRecipes.init();
        LogHelper.info("Finished Initialization");
    }

    public void postInit(FMLPostInitializationEvent event) {
        LogHelper.info("Finished PostInitialization");
    }
}