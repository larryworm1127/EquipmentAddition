package net.larryworm.equipments.materials;

import net.larryworm.equipments.util.ModUtil;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.util.EnumHelper;


public class InitArmorMaterial {

    public static ArmorMaterial BRONZE_ARMOR_MATERIAL;
    public static ArmorMaterial MITHRIL_ARMOR_MATERIAL;

    public static void init() {
        BRONZE_ARMOR_MATERIAL = addArmorMaterial("BRONZE", ModUtil.MOD_ID + ":bronze", 15, new int[]{2, 5, 6, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON);
        MITHRIL_ARMOR_MATERIAL = addArmorMaterial("MITHRIL", ModUtil.MOD_ID + ":mithril", 120, new int[]{4, 10, 12, 4}, 14, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND);
    }

    private static ArmorMaterial addArmorMaterial(String name, String textureName, int durability, int[] reductionAmounts, int enchantability, SoundEvent soundOnEquip) {
        return EnumHelper.addArmorMaterial(name, textureName, durability, reductionAmounts, enchantability, soundOnEquip, 0F);
    }
}
