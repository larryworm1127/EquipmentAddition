package net.larryworm.equipments.tile;

import net.minecraft.nbt.NBTTagCompound;

public class TileEntityCounter extends TileEntityBase {

    private int count;

    public TileEntityCounter(String name) {
        super(name);
    }

    @Override
    public NBTTagCompound writeToNBT(NBTTagCompound compound) {
        compound.setInteger("count", count);
        return super.writeToNBT(compound);
    }

    @Override
    public void readFromNBT(NBTTagCompound compound) {
        count = compound.getInteger("count");
        super.readFromNBT(compound);
    }

    public int getCount() {
        return count;
    }

    public void incrementCount() {
        count++;
        markDirty();
    }

    public void decrementCount() {
        count--;
        markDirty();
    }

}
