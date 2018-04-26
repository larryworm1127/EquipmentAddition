package net.larryworm.equipments.network;

import io.netty.buffer.ByteBuf;
import net.larryworm.equipments.tile.TileEntityMetalForge;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class PacketRequestUpdateMetalForge implements IMessage {

    private BlockPos pos;
    private int dimension;

    public PacketRequestUpdateMetalForge(BlockPos pos, int dimension) {
        this.pos = pos;
        this.dimension = dimension;
    }

    public PacketRequestUpdateMetalForge(TileEntityMetalForge te) {
        this(te.getPos(), te.getWorld().provider.getDimension());
    }

    public PacketRequestUpdateMetalForge() {
    }

    @Override
    public void toBytes(ByteBuf buf) {
        buf.writeLong(pos.toLong());
        buf.writeInt(dimension);
    }

    @Override
    public void fromBytes(ByteBuf buf) {
        pos = BlockPos.fromLong(buf.readLong());
        dimension = buf.readInt();
    }

    public static class Handler implements IMessageHandler<PacketRequestUpdateMetalForge, PacketUpdateMetalForge> {

        @Override
        public PacketUpdateMetalForge onMessage(PacketRequestUpdateMetalForge message, MessageContext ctx) {
            World world = FMLCommonHandler.instance().getMinecraftServerInstance().getWorld(message.dimension);
            TileEntityMetalForge te = (TileEntityMetalForge) world.getTileEntity(message.pos);
            if (te != null) {
                return new PacketUpdateMetalForge(te);
            } else {
                return null;
            }
        }
    }
}
