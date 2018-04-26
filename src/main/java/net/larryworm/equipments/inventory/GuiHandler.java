package net.larryworm.equipments.inventory;

import net.larryworm.equipments.EquipmentAddition;
import net.larryworm.equipments.inventory.gui.GuiMetalForge;
import net.larryworm.equipments.tile.TileEntityMetalForge;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;
import net.minecraftforge.fml.common.network.NetworkRegistry;

public class GuiHandler implements IGuiHandler {
    public static final int METAL_FORGE = 1;

    public static void init() {
        NetworkRegistry.INSTANCE.registerGuiHandler(EquipmentAddition.instance, new GuiHandler());
    }

    @Override
    public Container getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        switch (ID) {
            case METAL_FORGE:
                return new ContainerMetalForge(player.inventory, (TileEntityMetalForge) world.getTileEntity(new BlockPos(x, y, z)));
            default:
                return null;
        }
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        switch (ID) {
            case METAL_FORGE:
                return new GuiMetalForge(getServerGuiElement(ID, player, world, x, y, z), player.inventory);
            default:
                return null;
        }
    }
}
