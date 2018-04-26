package net.larryworm.equipments.tile;

import net.larryworm.equipments.util.ModUtil;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ITickable;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityBase extends TileEntity implements ITickable {

    public final String name;

    public TileEntityBase(String name) {
        this.name = name;
    }

    public static void init() {
        register(TileEntityCounter.class);
        register(TileEntityMetalForge.class);
    }

    private static void register(Class<? extends TileEntityBase> tileClass) {
        try {
            String name = ModUtil.MOD_ID + ":" + tileClass.newInstance().name;
            GameRegistry.registerTileEntity(tileClass, name);
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update() {

    }
}
