package net.larryworm.equipments.item;

import net.larryworm.equipments.item.tools.*;
import net.larryworm.equipments.materials.InitArmorMaterial;
import net.larryworm.equipments.materials.InitToolMaterial;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;

public class InitItems {

    public static Item ingotCopper;
    public static Item ingotTin;
    public static Item ingotBronze;
    public static Item ingotSilver;
    public static Item ingotSteel;
    public static Item ingotMithril;

    public static Item bronzeSword;
    public static Item bronzeAxe;
    public static Item bronzePickaxe;
    public static Item bronzeShovel;
    public static Item bronzeHoe;
    public static Item mithrilSword;
    public static Item mithrilAxe;
    public static Item mithrilPickaxe;
    public static Item mithrilShovel;
    public static Item mithrilHoe;

    public static Item bronzeHelmet;
    public static Item bronzeChestplate;
    public static Item bronzeLeggings;
    public static Item bronzeBoots;
    public static Item mithrilHelmet;
    public static Item mithrilChestplate;
    public static Item mithrilLeggings;
    public static Item mithrilBoots;

    public static Item bronzeArmorPlate;
    public static Item mithrilArmorPlate;

    public static Item bronzeToolBit;
    public static Item mithrilToolBit;

    public static void init() {
        ingotCopper = new ItemBase("ingot_copper");
        ingotTin = new ItemBase("ingot_tin");
        ingotBronze = new ItemBase("ingot_bronze");
        ingotSilver = new ItemBase("ingot_silver");
        ingotSteel = new ItemBase("ingot_steel");
        ingotMithril = new ItemBase("ingot_mithril");

        bronzeSword = new ItemSword(InitToolMaterial.BRONZE_TOOL_MATERIAL, "bronze_sword");
        bronzeAxe = new ItemAxe(InitToolMaterial.BRONZE_TOOL_MATERIAL, "bronze_axe");
        bronzePickaxe = new ItemPickaxe(InitToolMaterial.BRONZE_TOOL_MATERIAL, "bronze_pickaxe");
        bronzeShovel = new ItemShovel(InitToolMaterial.BRONZE_TOOL_MATERIAL, "bronze_shovel");
        bronzeHoe = new ItemHoe(InitToolMaterial.BRONZE_TOOL_MATERIAL, "bronze_hoe");
        mithrilSword = new ItemSword(InitToolMaterial.MITHRIL_TOOL_MATERIAL, "mithril_sword");
        mithrilAxe = new ItemSword(InitToolMaterial.MITHRIL_TOOL_MATERIAL, "mithril_axe");
        mithrilPickaxe = new ItemPickaxe(InitToolMaterial.MITHRIL_TOOL_MATERIAL, "mithril_pickaxe");
        mithrilShovel = new ItemShovel(InitToolMaterial.MITHRIL_TOOL_MATERIAL, "mithril_shovel");
        mithrilHoe = new ItemHoe(InitToolMaterial.MITHRIL_TOOL_MATERIAL, "mithril_hoe");

        bronzeHelmet = new ItemArmor(InitArmorMaterial.BRONZE_ARMOR_MATERIAL, EntityEquipmentSlot.HEAD, "bronze_helmet");
        bronzeChestplate = new ItemArmor(InitArmorMaterial.BRONZE_ARMOR_MATERIAL, EntityEquipmentSlot.CHEST, "bronze_chestplate");
        bronzeLeggings = new ItemArmor(InitArmorMaterial.BRONZE_ARMOR_MATERIAL, EntityEquipmentSlot.LEGS, "bronze_leggings");
        bronzeBoots = new ItemArmor(InitArmorMaterial.BRONZE_ARMOR_MATERIAL, EntityEquipmentSlot.FEET, "bronze_boots");
        mithrilHelmet = new ItemArmor(InitArmorMaterial.MITHRIL_ARMOR_MATERIAL, EntityEquipmentSlot.HEAD, "mithril_helmet");
        mithrilChestplate = new ItemArmor(InitArmorMaterial.MITHRIL_ARMOR_MATERIAL, EntityEquipmentSlot.CHEST, "mithril_chestplate");
        mithrilLeggings = new ItemArmor(InitArmorMaterial.MITHRIL_ARMOR_MATERIAL, EntityEquipmentSlot.LEGS, "mithril_leggings");
        mithrilBoots = new ItemArmor(InitArmorMaterial.MITHRIL_ARMOR_MATERIAL, EntityEquipmentSlot.FEET, "mithril_boots");

        bronzeArmorPlate = new ItemBase("bronze_armor_plate");
        mithrilArmorPlate = new ItemBase("mithril_armor_plate");

        bronzeToolBit = new ItemBase("bronze_tool_bit");
        mithrilToolBit = new ItemBase("mithril_toll_bit");
    }
}
