package net.larryworm.equipments.item;

import net.larryworm.equipments.item.tools.*;
import net.larryworm.equipments.materials.InitArmorMaterial;
import net.larryworm.equipments.materials.InitToolMaterial;
import net.larryworm.equipments.util.TypeUtil;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;

public class InitItems {

    // Ingots
    public static Item ingotCopper;
    public static Item ingotTin;
    public static Item ingotBronze;
    public static Item ingotSilver;
    public static Item ingotSteel;
    public static Item ingotMithril;

    // Tools/Weapons
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
    public static Item tinSword;
    public static Item tinAxe;
    public static Item tinPickaxe;
    public static Item tinShovel;
    public static Item tinHoe;
    public static Item copperSword;
    public static Item copperAxe;
    public static Item copperPickaxe;
    public static Item copperShovel;
    public static Item copperHoe;
    public static Item steelSword;
    public static Item steelAxe;
    public static Item steelPickaxe;
    public static Item steelShovel;
    public static Item steelHoe;
    public static Item silverSword;
    public static Item silverAxe;
    public static Item silverPickaxe;
    public static Item silverShovel;
    public static Item silverHoe;
    public static Item stoneHammer;
    public static Item ironHammer;

    // Armors
    public static Item bronzeHelmet;
    public static Item bronzeChestplate;
    public static Item bronzeLeggings;
    public static Item bronzeBoots;
    public static Item mithrilHelmet;
    public static Item mithrilChestplate;
    public static Item mithrilLeggings;
    public static Item mithrilBoots;

    // Materials
    public static Item bronzeArmorPlate;
    public static Item mithrilArmorPlate;
    public static Item ironArmorPlate;
    public static Item bronzeToolBit;
    public static Item mithrilToolBit;
    public static Item ironToolBit;


    public static void init() {
        ingotCopper = new ItemBase("ingot_copper", TypeUtil.MATERIALS);
        ingotTin = new ItemBase("ingot_tin", TypeUtil.MATERIALS);
        ingotBronze = new ItemBase("ingot_bronze", TypeUtil.MATERIALS);
        ingotSilver = new ItemBase("ingot_silver", TypeUtil.MATERIALS);
        ingotSteel = new ItemBase("ingot_steel", TypeUtil.MATERIALS);
        ingotMithril = new ItemBase("ingot_mithril", TypeUtil.MATERIALS);

        bronzeSword = new ItemSword(InitToolMaterial.BRONZE_TOOL_MATERIAL, "bronze_sword");
        bronzeAxe = new ItemAxe(InitToolMaterial.BRONZE_TOOL_MATERIAL, "bronze_axe");
        bronzePickaxe = new ItemPickaxe(InitToolMaterial.BRONZE_TOOL_MATERIAL, "bronze_pickaxe");
        bronzeShovel = new ItemShovel(InitToolMaterial.BRONZE_TOOL_MATERIAL, "bronze_shovel");
        bronzeHoe = new ItemHoe(InitToolMaterial.BRONZE_TOOL_MATERIAL, "bronze_hoe");
        mithrilSword = new ItemSword(InitToolMaterial.MITHRIL_TOOL_MATERIAL, "mithril_sword");
        mithrilAxe = new ItemAxe(InitToolMaterial.MITHRIL_TOOL_MATERIAL, "mithril_axe");
        mithrilPickaxe = new ItemPickaxe(InitToolMaterial.MITHRIL_TOOL_MATERIAL, "mithril_pickaxe");
        mithrilShovel = new ItemShovel(InitToolMaterial.MITHRIL_TOOL_MATERIAL, "mithril_shovel");
        mithrilHoe = new ItemHoe(InitToolMaterial.MITHRIL_TOOL_MATERIAL, "mithril_hoe");
        tinSword = new ItemSword(InitToolMaterial.TIN_TOOL_MATERIAL, "tin_sword");
        tinAxe = new ItemAxe(InitToolMaterial.TIN_TOOL_MATERIAL, "tin_axe");
        tinPickaxe = new ItemPickaxe(InitToolMaterial.TIN_TOOL_MATERIAL, "tin_pickaxe");
        tinShovel = new ItemShovel(InitToolMaterial.TIN_TOOL_MATERIAL, "tin_shovel");
        tinHoe = new ItemHoe(InitToolMaterial.TIN_TOOL_MATERIAL, "tin_hoe");
        copperSword = new ItemSword(InitToolMaterial.COPPER_TOOL_MATERIAL, "copper_sword");
        copperAxe = new ItemAxe(InitToolMaterial.COPPER_TOOL_MATERIAL, "copper_axe");
        copperPickaxe = new ItemPickaxe(InitToolMaterial.COPPER_TOOL_MATERIAL, "copper_pickaxe");
        copperShovel = new ItemShovel(InitToolMaterial.COPPER_TOOL_MATERIAL, "copper_shovel");
        copperHoe = new ItemHoe(InitToolMaterial.COPPER_TOOL_MATERIAL, "copper_hoe");
        steelSword = new ItemSword(InitToolMaterial.STEEL_TOOL_MATERIAL, "steel_sword");
        steelAxe = new ItemAxe(InitToolMaterial.STEEL_TOOL_MATERIAL, "steel_axe");
        steelPickaxe = new ItemPickaxe(InitToolMaterial.STEEL_TOOL_MATERIAL, "steel_pickaxe");
        steelShovel = new ItemShovel(InitToolMaterial.STEEL_TOOL_MATERIAL, "steel_shovel");
        steelHoe = new ItemHoe(InitToolMaterial.STEEL_TOOL_MATERIAL, "steel_hoe");
        silverSword = new ItemSword(InitToolMaterial.SILVER_TOOL_MATERIAL, "silver_sword");
        silverAxe = new ItemAxe(InitToolMaterial.SILVER_TOOL_MATERIAL, "silver_axe");
        silverPickaxe = new ItemPickaxe(InitToolMaterial.SILVER_TOOL_MATERIAL, "silver_pickaxe");
        silverShovel = new ItemShovel(InitToolMaterial.SILVER_TOOL_MATERIAL, "silver_shovel");
        silverHoe = new ItemHoe(InitToolMaterial.SILVER_TOOL_MATERIAL, "silver_hoe");
        stoneHammer = new ItemHammer("stone_hammer", TypeUtil.TOOL);
        ironHammer = new ItemHammer("iron_hammer", TypeUtil.TOOL);

        bronzeHelmet = new ItemArmor(InitArmorMaterial.BRONZE_ARMOR_MATERIAL, EntityEquipmentSlot.HEAD, "bronze_helmet");
        bronzeChestplate = new ItemArmor(InitArmorMaterial.BRONZE_ARMOR_MATERIAL, EntityEquipmentSlot.CHEST, "bronze_chestplate");
        bronzeLeggings = new ItemArmor(InitArmorMaterial.BRONZE_ARMOR_MATERIAL, EntityEquipmentSlot.LEGS, "bronze_leggings");
        bronzeBoots = new ItemArmor(InitArmorMaterial.BRONZE_ARMOR_MATERIAL, EntityEquipmentSlot.FEET, "bronze_boots");
        mithrilHelmet = new ItemArmor(InitArmorMaterial.MITHRIL_ARMOR_MATERIAL, EntityEquipmentSlot.HEAD, "mithril_helmet");
        mithrilChestplate = new ItemArmor(InitArmorMaterial.MITHRIL_ARMOR_MATERIAL, EntityEquipmentSlot.CHEST, "mithril_chestplate");
        mithrilLeggings = new ItemArmor(InitArmorMaterial.MITHRIL_ARMOR_MATERIAL, EntityEquipmentSlot.LEGS, "mithril_leggings");
        mithrilBoots = new ItemArmor(InitArmorMaterial.MITHRIL_ARMOR_MATERIAL, EntityEquipmentSlot.FEET, "mithril_boots");

        bronzeArmorPlate = new ItemBase("bronze_armor_plate", TypeUtil.CRAFTING);
        mithrilArmorPlate = new ItemBase("mithril_armor_plate", TypeUtil.CRAFTING);
        ironArmorPlate = new ItemBase("iron_armor_plate", TypeUtil.CRAFTING);
        bronzeToolBit = new ItemBase("bronze_tool_bit", TypeUtil.CRAFTING);
        mithrilToolBit = new ItemBase("mithril_tool_bit", TypeUtil.CRAFTING);
        ironToolBit = new ItemBase("iron_tool_bit", TypeUtil.CRAFTING);
    }
}
