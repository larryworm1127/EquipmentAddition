package net.larryworm.equipments.block;

import net.larryworm.equipments.EquipmentAddition;
import net.larryworm.equipments.inventory.GuiHandler;
import net.larryworm.equipments.item.InitItems;
import net.larryworm.equipments.item.tools.ItemHammer;
import net.larryworm.equipments.tile.TileEntityMetalForge;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;

import javax.annotation.Nullable;

public class BlockMetalForge extends BlockTileEntity<TileEntityMetalForge> {

    public BlockMetalForge() {
        super(Material.ROCK, "metal_forge");
    }

    public static ItemStack getToolBitFromIngot(Item ingot) {
        if (ingot == InitItems.ingotBronze) {
            return new ItemStack(InitItems.bronzeToolBit);
        }

        return null;
    }

    @Override
    @Deprecated
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    @Override
    @Deprecated
    public boolean isFullCube(IBlockState state) {
        return false;
    }

    @Override
    public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing side, float hitX, float hitY, float hitZ) {
        if (!world.isRemote) {
            ItemStack heldItem = player.getHeldItem(hand);
            TileEntityMetalForge tile = getTileEntity(world, pos);
            IItemHandler itemHandler = tile.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, side);
            if (!player.isSneaking()) {
                if (heldItem.getItem() instanceof ItemHammer) {
                    ItemStack stack = itemHandler.getStackInSlot(0);
                    try {
                        player.addItemStackToInventory((getToolBitFromIngot(stack.getItem())));
                        player.sendMessage(new TextComponentString("Ding!"));
                        itemHandler.extractItem(0, 1, false);
                    } catch (Exception NullPointerException) {
                        player.sendMessage(new TextComponentString("Invalid Item!"));
                    }
                }
            } else {
                player.openGui(EquipmentAddition.instance, GuiHandler.METAL_FORGE, world, pos.getX(), pos.getY(), pos.getZ());
            }
        }
        return true;
    }

    @Override
    public void breakBlock(World world, BlockPos pos, IBlockState state) {
        TileEntityMetalForge tile = getTileEntity(world, pos);
        IItemHandler itemHandler = tile.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, EnumFacing.NORTH);
        ItemStack stack = itemHandler.getStackInSlot(0);
        if (!stack.isEmpty()) {
            EntityItem item = new EntityItem(world, pos.getX(), pos.getY(), pos.getZ(), stack);
            world.spawnEntity(item);
        }
        super.breakBlock(world, pos, state);
    }

    @Override
    public Class<TileEntityMetalForge> getTileEntityClass() {
        return TileEntityMetalForge.class;
    }

    @Nullable
    @Override
    public TileEntityMetalForge createTileEntity(World world, IBlockState state) {
        return new TileEntityMetalForge("metal_forge");
    }
}
