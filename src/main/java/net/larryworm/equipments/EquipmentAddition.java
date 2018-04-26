package net.larryworm.equipments;

import net.larryworm.equipments.inventory.GuiHandler;
import net.larryworm.equipments.materials.InitArmorMaterial;
import net.larryworm.equipments.materials.InitToolMaterial;
import net.larryworm.equipments.proxy.CommonProxy;
import net.larryworm.equipments.recipe.InitRecipes;
import net.larryworm.equipments.util.ModUtil;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ModUtil.MOD_ID, name = ModUtil.NAME, version = ModUtil.VERSION)
public class EquipmentAddition {

    @Mod.Instance(ModUtil.MOD_ID)
    public static EquipmentAddition instance;

    @SidedProxy(clientSide = ModUtil.CLIENT_PROXY, serverSide = ModUtil.SERVER_PROXY)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        InitArmorMaterial.init();
        InitToolMaterial.init();
        MinecraftForge.EVENT_BUS.register(new RegistryHandler());

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
