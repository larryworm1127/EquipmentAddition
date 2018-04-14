package net.larryworm.equipments.item;

import net.larryworm.equipments.EquipmentAddition;
import net.larryworm.equipments.item.tools.*;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class InitItem {

    public static ItemBase ingotCopper;
    public static ItemBase ingotTin;
    public static ItemBase ingotBronze;

    public static ItemSword bronzeSword;
    public static ItemAxe bronzeAxe;
    public static ItemPickaxe bronzePickaxe;
    public static ItemShovel bronzeShovel;
    public static ItemHoe bronzeHoe;

    public static ItemArmor bronzeHelmet;
    public static ItemArmor bronzeChestplate;
    public static ItemArmor bronzeLeggings;
    public static ItemArmor bronzeBoots;

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

    public static void register(IForgeRegistry<Item> registry) {
        registry.registerAll(
                ingotCopper,
                ingotTin,
                ingotBronze,
                bronzeSword,
                bronzeAxe,
                bronzePickaxe,
                bronzeShovel,
                bronzeHoe,
                bronzeHelmet,
                bronzeChestplate,
                bronzeLeggings,
                bronzeBoots
        );
    }

    public static void registerModels() {
        ingotCopper.registerItemModel();
        ingotTin.registerItemModel();
        ingotBronze.registerItemModel();

        bronzeSword.registerItemModel();
        bronzeAxe.registerItemModel();
        bronzePickaxe.registerItemModel();
        bronzeShovel.registerItemModel();
        bronzeHoe.registerItemModel();

        bronzeHelmet.registerItemModel();
        bronzeChestplate.registerItemModel();
        bronzeLeggings.registerItemModel();
        bronzeBoots.registerItemModel();
    }
}
