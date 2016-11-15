package net.thedragonteam.neverlookback.progression;

import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;

public class Storage implements Capability.IStorage<IProgressionHandler> {

    @Override
    public NBTBase writeNBT(Capability<IProgressionHandler> capability, IProgressionHandler instance, EnumFacing side) {
        final NBTTagCompound tag = new NBTTagCompound();
        tag.setInteger("progression", instance.getProgression());
        tag.setString("progression_type", instance.getType());
        return tag;
    }

    @Override
    public void readNBT(Capability<IProgressionHandler> capability, IProgressionHandler instance, EnumFacing side, NBTBase nbt) {
        final NBTTagCompound tag = (NBTTagCompound) nbt;
        instance.setProgression(tag.getInteger("progression"));
        instance.setType(tag.getString("progression_type"));
    }
}