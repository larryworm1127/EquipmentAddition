package net.larryworm.equipments.item;

import net.larryworm.equipments.EquipmentAddition;
import net.larryworm.equipments.item.tools.*;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;

public class InitItems {

    public static Item ingotCopper;
    public static Item ingotTin;
    public static Item ingotBronze;

    public static Item bronzeSword;
    public static Item bronzeAxe;
    public static Item bronzePickaxe;
    public static Item bronzeShovel;
    public static Item bronzeHoe;

    public static Item bronzeHelmet;
    public static Item bronzeChestplate;
    public static Item bronzeLeggings;
    public static Item bronzeBoots;

    public static void init() {
        ingotCopper = new ItemBase("ingot_copper");
        ingotTin = new ItemBase("ingot_tin");
        ingotBronze = new ItemBase("ingot_bronze");

        bronzeSword = new ItemSword(EquipmentAddition.BRONZE_TOOL_MATERIAL, "bronze_sword");
        bronzeAxe = new ItemAxe(EquipmentAddition.BRONZE_TOOL_MATERIAL, "bronze_axe");
        bronzePickaxe = new ItemPickaxe(EquipmentAddition.BRONZE_TOOL_MATERIAL, "bronze_pickaxe");
        bronzeShovel = new ItemShovel(EquipmentAddition.BRONZE_TOOL_MATERIAL, "bronze_shovel");
        bronzeHoe = new ItemHoe(EquipmentAddition.BRONZE_TOOL_MATERIAL, "bronze_hoe");

        bronzeHelmet = new ItemArmor(EquipmentAddition.BRONZE_ARMOR_MATERIAL, EntityEquipmentSlot.HEAD, "bronze_helmet");
        bronzeChestplate = new ItemArmor(EquipmentAddition.BRONZE_ARMOR_MATERIAL, EntityEquipmentSlot.CHEST, "bronze_chestplate");
        bronzeLeggings = new ItemArmor(EquipmentAddition.BRONZE_ARMOR_MATERIAL, EntityEquipmentSlot.LEGS, "bronze_leggings");
        bronzeBoots = new ItemArmor(EquipmentAddition.BRONZE_ARMOR_MATERIAL, EntityEquipmentSlot.FEET, "bronze_boots");
    }
}
