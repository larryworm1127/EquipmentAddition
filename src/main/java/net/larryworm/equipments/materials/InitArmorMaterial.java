package net.larryworm.equipments.materials;

import net.larryworm.equipments.util.ModUtil;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.util.EnumHelper;


public class InitArmorMaterial {

    public static ArmorMaterial BRONZE_ARMOR_MATERIAL;
    public static ArmorMaterial MITHRIL_ARMOR_MATERIAL;
    public static ArmorMaterial COPPER_ARMOR_MATERIAL;
    public static ArmorMaterial TIN_ARMOR_MATERIAL;
    public static ArmorMaterial STEEL_ARMOR_MATERIAL;
    public static ArmorMaterial SILVER_ARMOR_MATERIAL;

    public static void init() {
        BRONZE_ARMOR_MATERIAL = addArmorMaterial("BRONZE", ModUtil.MOD_ID + ":bronze", 15, new int[]{2, 5, 6, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON);
        MITHRIL_ARMOR_MATERIAL = addArmorMaterial("MITHRIL", ModUtil.MOD_ID + ":mithril", 120, new int[]{6, 12, 16, 6}, 20, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND);
        COPPER_ARMOR_MATERIAL = addArmorMaterial("COPPER", ModUtil.MOD_ID + ":copper", 10, new int[]{2, 4, 5, 2}, 22, SoundEvents.ITEM_ARMOR_EQUIP_IRON);
        TIN_ARMOR_MATERIAL = addArmorMaterial("TIN", ModUtil.MOD_ID + ":tin", 1, new int[]{1, 3, 4, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON);
        STEEL_ARMOR_MATERIAL = addArmorMaterial("STEEL", ModUtil.MOD_ID + ":steel", 1, new int[]{2, 6, 6, 2}, 12, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN);
        SILVER_ARMOR_MATERIAL = addArmorMaterial("SILVER", ModUtil.MOD_ID + ":silver", 1, new int[]{2, 5, 6, 2}, 16, SoundEvents.ITEM_ARMOR_EQUIP_GOLD);
    }

    private static ArmorMaterial addArmorMaterial(String name, String textureName, int durability, int[] reductionAmounts, int enchantability, SoundEvent soundOnEquip) {
        return EnumHelper.addArmorMaterial(name, textureName, durability, reductionAmounts, enchantability, soundOnEquip, 0F);
    }
}
