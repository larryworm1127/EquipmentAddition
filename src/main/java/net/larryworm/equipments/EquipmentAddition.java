package net.larryworm.equipments;

import net.larryworm.equipments.blocks.InitBlocks;
import net.larryworm.equipments.items.InitItem;
import net.larryworm.equipments.proxy.CommonProxy;
import net.larryworm.equipments.utils.ModUtil;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod(modid = ModUtil.MOD_ID, name = ModUtil.NAME, version = ModUtil.VERSION)
public class EquipmentAddition {

    @Mod.Instance(ModUtil.MOD_ID)
    public static EquipmentAddition instance;

    @SidedProxy(clientSide = ModUtil.CLIENT_PROXY, serverSide = ModUtil.SERVER_PROXY)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }

    @Mod.EventBusSubscriber
    public static class RegistrationHandler {

        @SubscribeEvent
        public static void registerBlocks(RegistryEvent.Register<Block> event) {
            InitBlocks.register(event.getRegistry());
        }

        @SubscribeEvent
        public static void registerItems(RegistryEvent.Register<Item> event) {
            InitItem.register(event.getRegistry());
            InitBlocks.registerItemBlocks(event.getRegistry());
        }

        @SubscribeEvent
        public static void registerModels(ModelRegistryEvent event) {
            InitItem.registerModels();
            InitBlocks.registerModels();
        }
    }
}
