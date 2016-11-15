/*
 * Copyright (c) TheDragonTeam 2016.
 */

package net.thedragonteam.neverlookback.resources;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.thedragonteam.neverlookback.NeverLookBack;
import net.thedragonteam.neverlookback.progression.IProgressionHandler;
import net.thedragonteam.neverlookback.progression.Provider;

import static net.thedragonteam.neverlookback.progression.ProgressionDataHandler.CAPABILITY_PROGRESSION;

public class GlobalEventsModBase {

    @SubscribeEvent
    public void attachCapabilities(AttachCapabilitiesEvent<?> event) {
        if (event.getObject() instanceof EntityPlayer)
            event.addCapability(new ResourceLocation(NeverLookBack.MODID, "progression"), new Provider());
    }

    @SubscribeEvent
    public void clonePlayer(PlayerEvent.Clone event) {
        final IProgressionHandler original = getHandler(event.getOriginal());
        final IProgressionHandler clone = getHandler(event.getEntity());
        clone.setProgression(original.getProgression());
    }

    public static IProgressionHandler getHandler(Entity entity) {
        if (entity.hasCapability(CAPABILITY_PROGRESSION, EnumFacing.DOWN))
            return entity.getCapability(CAPABILITY_PROGRESSION, EnumFacing.DOWN);

        return null;
    }
}