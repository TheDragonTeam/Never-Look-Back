/*
 * Copyright (c) TheDragonTeam 2016.
 */

package net.thedragonteam.neverlookback;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thedragonteam.neverlookback.client.gui.NLBTab;
import net.thedragonteam.neverlookback.proxy.CommonProxy;
import net.thedragonteam.thedragonlib.util.LogHelper;

import static net.thedragonteam.neverlookback.util.Utils.setName;


@Mod(modid = NeverLookBack.MODID, name = NeverLookBack.MODNAME, version = NeverLookBack.VERSION, guiFactory = NeverLookBack.GUI_FACTORY, dependencies = NeverLookBack.DEPEND)
public class NeverLookBack {

    /**
     * Updates every time the mod updates minecraft version,
     * Updates MAJOR with 1 after each version upgrade
     */
    public static final String MC_VERSION = "1.10.2";
    /**
     * Updates every MAJOR change,
     * never resets
     */
    public static final int MAJOR = 1;
    /**
     * Updates every time a new block, item or features is added or change,
     * resets on MAJOR changes
     */
    public static final int MINOR = 0;
    /**
     * Updates every time a bug is fixed or issue solved or very minor code changes,
     * resets on MINOR changes
     */
    public static final int PATCH = 0;
    /**
     * The Mod Version
     */
    public static final String VERSION = NeverLookBack.MC_VERSION + "-" + NeverLookBack.MAJOR + "." + NeverLookBack.MINOR + "." + NeverLookBack.PATCH + "";
    public static final String MODID = "neverlookback";
    public static final String MODNAME = "Never Look Back";
    public static final String LIB_VERSION = "1.10.2-1.0.3.0";
    public static final String DEPEND = "required-after:thedragonlib@[" + NeverLookBack.LIB_VERSION + ",);";
    public static final String CLIENT_PROXY = "net.thedragonteam.neverlookback.proxy.ClientProxy";
    public static final String SERVER_PROXY = "net.thedragonteam.neverlookback.proxy.ServerProxy";
    public static final String GUI_FACTORY = "net.thedragonteam.neverlookback.client.gui.ConfigGuiFactory";

    @SidedProxy(clientSide = CLIENT_PROXY, serverSide = SERVER_PROXY)
    public static CommonProxy proxy;

    public static CreativeTabs nmTab = new NLBTab(CreativeTabs.getNextID(), NeverLookBack.MODID, setName("never_look_back"), 0);

    @Mod.Instance(MODID)
    public static NeverLookBack instance;

    public NeverLookBack() {
        LogHelper.info("Welcoming Minecraft");
    }

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }

    @SideOnly(Side.CLIENT)
    @EventHandler
    public void initClient(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @SideOnly(Side.SERVER)
    @EventHandler
    public void initServer(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }

    @EventHandler
    public void serverLoad(FMLServerStartingEvent event) {
    }
}