package net.larryworm.equipments.util;

import net.larryworm.equipments.RegistryHandler;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class ItemUtil {

    public static void registerBlock(Block block, Item itemBlock, String name) {
        block.setUnlocalizedName(name);

        block.setRegistryName(ModUtil.MOD_ID, name);
        RegistryHandler.BLOCKS_TO_REGISTER.add(block);

        itemBlock.setRegistryName(name);
        RegistryHandler.ITEMS_TO_REGISTER.add(itemBlock);

        block.setCreativeTab(ModUtil.CREATIVE_TAB);
    }

    public static void registerItem(Item item, String name) {
        item.setUnlocalizedName(name);

        item.setRegistryName(ModUtil.MOD_ID, name);
        RegistryHandler.ITEMS_TO_REGISTER.add(item);

        item.setCreativeTab(ModUtil.CREATIVE_TAB);
    }
}
