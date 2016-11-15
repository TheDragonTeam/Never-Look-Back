/*
 * Copyright (c) TheDragonTeam 2016.
 */

package net.thedragonteam.neverlookback.client.gui;

import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.fml.client.config.GuiConfig;
import net.minecraftforge.fml.client.config.IConfigElement;
import net.thedragonteam.neverlookback.NeverLookBack;
import net.thedragonteam.neverlookback.proxy.CommonProxy;
import net.thedragonteam.thedragonlib.util.TextHelper;

import java.util.ArrayList;
import java.util.List;

public class ConfigGui extends GuiConfig {
    public ConfigGui(GuiScreen parentScreen) {
        super(parentScreen, getConfigElements(parentScreen), NeverLookBack.MODID, false, true,
                TextHelper.localize("gui." + NeverLookBack.MODID + ".config.title"));
    }

    private static List<IConfigElement> getConfigElements(GuiScreen parent) {
        List<IConfigElement> list = new ArrayList<>();

        list.add(new ConfigElement(CommonProxy.configuration.getCategory("Example".toLowerCase())));
        return list;
    }
}