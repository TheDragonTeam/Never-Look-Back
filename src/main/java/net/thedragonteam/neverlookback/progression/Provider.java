package net.thedragonteam.neverlookback.progression;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;

import static net.thedragonteam.neverlookback.progression.ProgressionDataHandler.CAPABILITY_PROGRESSION;

public class Provider implements ICapabilitySerializable<NBTTagCompound> {

    IProgressionHandler instance = CAPABILITY_PROGRESSION.getDefaultInstance();

    @Override
    public boolean hasCapability(Capability<?> capability, EnumFacing facing) {
        return capability == CAPABILITY_PROGRESSION;
    }

    @Override
    public <T> T getCapability(Capability<T> capability, EnumFacing facing) {
        return hasCapability(capability, facing) ? CAPABILITY_PROGRESSION.cast(instance) : null;
    }

    @Override
    public NBTTagCompound serializeNBT() {
        return (NBTTagCompound) CAPABILITY_PROGRESSION.getStorage().writeNBT(CAPABILITY_PROGRESSION, instance, null);
    }

    @Override
    public void deserializeNBT(NBTTagCompound nbt) {
        CAPABILITY_PROGRESSION.getStorage().readNBT(CAPABILITY_PROGRESSION, instance, null, nbt);
    }
}