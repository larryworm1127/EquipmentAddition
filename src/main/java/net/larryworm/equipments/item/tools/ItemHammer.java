package net.larryworm.equipments.item.tools;

import net.larryworm.equipments.item.ItemBase;
import net.larryworm.equipments.tile.TileEntityMetalForge;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemHammer extends ItemBase {

    public ItemHammer(String name) {
        super(name);

        this.setMaxStackSize(1);
    }

    @Override
    public EnumActionResult onItemUse(EntityPlayer player, World world, BlockPos pos, EnumHand hand, EnumFacing side, float hitX, float hitY, float hitZ) {
        if (!world.isRemote) {
            TileEntity tile = world.getTileEntity(pos);
            if (tile instanceof TileEntityMetalForge) {
                return EnumActionResult.SUCCESS;
            }

            return EnumActionResult.FAIL;
        }
        return EnumActionResult.PASS;
    }
}