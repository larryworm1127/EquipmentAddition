package net.larryworm.equipments.util;

import net.larryworm.equipments.EquipmentAddition;
import net.larryworm.equipments.RegistryHandler;
import net.larryworm.equipments.block.ItemBlockBase;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class ItemUtil {

    public static void registerBlock(Block block, ItemBlockBase itemBlock, String name){
        block.setUnlocalizedName(name);

        block.setRegistryName(name);
        RegistryHandler.BLOCKS_TO_REGISTER.add(block);

        itemBlock.setRegistryName(block.getRegistryName());
        RegistryHandler.ITEMS_TO_REGISTER.add(itemBlock);

        block.setCreativeTab(ModUtil.CREATIVE_TAB);
    }

    public static void registerItem(Item item, String name){
        item.setUnlocalizedName(name);

        item.setRegistryName(name);
        RegistryHandler.ITEMS_TO_REGISTER.add(item);

        registerItemModel(item, name);

        item.setCreativeTab(ModUtil.CREATIVE_TAB);
    }

    public static void registerItemModel(Item item, String name) {
        EquipmentAddition.proxy.registerItemRenderer(item, 0, name);
    }
}
