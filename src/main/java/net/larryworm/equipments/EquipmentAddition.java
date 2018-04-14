package net.larryworm.equipments;

import net.larryworm.equipments.item.InitItems;
import net.larryworm.equipments.proxy.CommonProxy;
import net.larryworm.equipments.recipe.InitRecipes;
import net.larryworm.equipments.util.ModUtil;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ModUtil.MOD_ID, name = ModUtil.NAME, version = ModUtil.VERSION)
public class EquipmentAddition {

    public static final Item.ToolMaterial BRONZE_TOOL_MATERIAL = EnumHelper.addToolMaterial("BRONZE", 2, 500, 6, 2, 14);
    public static final ItemArmor.ArmorMaterial BRONZE_ARMOR_MATERIAL = EnumHelper.addArmorMaterial("COPPER", ModUtil.MOD_ID + ":bronze", 15, new int[]{2, 5, 6, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);

    @Mod.Instance(ModUtil.MOD_ID)
    public static EquipmentAddition instance;

    @SidedProxy(clientSide = ModUtil.CLIENT_PROXY, serverSide = ModUtil.SERVER_PROXY)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(new RegistryHandler());
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        InitRecipes.init();

        RegistryHandler.BLOCKS_TO_REGISTER.clear();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}
