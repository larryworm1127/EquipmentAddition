package net.larryworm.equipments.item;

import net.larryworm.equipments.EquipmentAddition;
import net.larryworm.equipments.item.tools.*;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class InitItem {

    public static ItemBase ingotCopper = new ItemBase("ingot_copper");
    public static ItemBase ingotTin = new ItemBase("ingot_tin");
    public static ItemBase ingotBronze = new ItemBase("ingot_bronze");

    public static ItemSword bronzeSword = new ItemSword(EquipmentAddition.BRONZE_TOOL_MATERIAL, "bronze_sword");
    public static ItemAxe bronzeAxe = new ItemAxe(EquipmentAddition.BRONZE_TOOL_MATERIAL, "bronze_axe");
    public static ItemPickaxe bronzePickaxe = new ItemPickaxe(EquipmentAddition.BRONZE_TOOL_MATERIAL, "bronze_pickaxe");
    public static ItemShovel bronzeShovel = new ItemShovel(EquipmentAddition.BRONZE_TOOL_MATERIAL, "bronze_shovel");
    public static ItemHoe bronzeHoe = new ItemHoe(EquipmentAddition.BRONZE_TOOL_MATERIAL, "bronze_hoe");


    public static void register(IForgeRegistry<Item> registry) {
        registry.registerAll(
                ingotCopper,
                ingotTin,
                ingotBronze,
                bronzeSword,
                bronzeAxe,
                bronzePickaxe,
                bronzeShovel,
                bronzeHoe
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
    }
}
