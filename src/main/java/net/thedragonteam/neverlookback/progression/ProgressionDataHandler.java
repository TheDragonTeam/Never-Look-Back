package net.thedragonteam.neverlookback.progression;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.CapabilityManager;

public class ProgressionDataHandler {

    @CapabilityInject(IProgressionHandler.class)
    public static final Capability<IProgressionHandler> CAPABILITY_PROGRESSION = null;

    public static void register() {
        CapabilityManager.INSTANCE.register(IProgressionHandler.class, new Storage(), DefaultProgressionHandler.class);
        MinecraftForge.EVENT_BUS.register(new ProgressionDataHandler());
    }
}