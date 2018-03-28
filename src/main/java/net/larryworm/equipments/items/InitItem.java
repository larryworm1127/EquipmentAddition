package net.larryworm.equipments.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class InitItem {

    public static ItemBase ingotCopper = new ItemBase("ingot_copper").setCreativeTab(CreativeTabs.MATERIALS);
    public static ItemBase ingotTin = new ItemBase("ingot_tin").setCreativeTab(CreativeTabs.MATERIALS);
    public static ItemBase ingotSilver = new ItemBase("ingot_silver").setCreativeTab(CreativeTabs.MATERIALS);
    public static ItemBase ingotLead = new ItemBase("ingot_lead").setCreativeTab(CreativeTabs.MATERIALS);;
    public static ItemBase ingotBronze = new ItemBase("ingot_bronze").setCreativeTab(CreativeTabs.MATERIALS);;

    public static void register(IForgeRegistry<Item> registry) {
        registry.registerAll(
                ingotCopper,
                ingotTin,
                ingotSilver,
                ingotLead,
                ingotBronze
        );
    }

    public static void registerModels() {
        ingotCopper.registerItemModel();
        ingotLead.registerItemModel();
        ingotSilver.registerItemModel();
        ingotTin.registerItemModel();
        ingotBronze.registerItemModel();
    }
}
