package net.larryworm.equipments;

import net.larryworm.equipments.inventory.GuiHandler;
import net.larryworm.equipments.materials.InitArmorMaterial;
import net.larryworm.equipments.materials.InitToolMaterial;
import net.larryworm.equipments.network.PacketRequestUpdateMetalForge;
import net.larryworm.equipments.network.PacketUpdateMetalForge;
import net.larryworm.equipments.proxy.CommonProxy;
import net.larryworm.equipments.recipe.InitRecipes;
import net.larryworm.equipments.util.ModUtil;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.relauncher.Side;

@Mod(modid = ModUtil.MOD_ID, name = ModUtil.NAME, version = ModUtil.VERSION)
public class EquipmentAddition {

    @Mod.Instance(ModUtil.MOD_ID)
    public static EquipmentAddition instance;

    @SidedProxy(clientSide = ModUtil.CLIENT_PROXY, serverSide = ModUtil.SERVER_PROXY)
    public static CommonProxy proxy;

    public static SimpleNetworkWrapper network;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        InitArmorMaterial.init();
        InitToolMaterial.init();
        MinecraftForge.EVENT_BUS.register(new RegistryHandler());

        network = NetworkRegistry.INSTANCE.newSimpleChannel(ModUtil.MOD_ID);
        network.registerMessage(new PacketUpdateMetalForge.Handler(), PacketUpdateMetalForge.class, 0, Side.CLIENT);
        network.registerMessage(new PacketRequestUpdateMetalForge.Handler(), PacketRequestUpdateMetalForge.class, 1, Side.SERVER);

        proxy.registerRenderers();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        InitRecipes.init();
        GuiHandler.init();

        RegistryHandler.BLOCKS_TO_REGISTER.clear();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}
