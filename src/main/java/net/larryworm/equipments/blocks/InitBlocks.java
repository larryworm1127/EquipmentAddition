package net.larryworm.equipments.blocks;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class InitBlocks {

    public static BlockOre oreCopper = new BlockOre("ore_copper").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
    public static BlockOre oreTin = new BlockOre("ore_tin").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
    public static BlockOre oreSilver = new BlockOre("ore_silver").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
    public static BlockOre oreLead = new BlockOre("ore_lead").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);

    public static void register(IForgeRegistry<Block> registry) {
        registry.registerAll(
                oreCopper,
                oreTin,
                oreSilver,
                oreLead
        );
    }

    public static void registerItemBlocks(IForgeRegistry<Item> registry) {
        registry.registerAll(
                oreCopper.createItemBlock(),
                oreTin.createItemBlock(),
                oreSilver.createItemBlock(),
                oreLead.createItemBlock()
        );
    }

    public static void registerModels() {
        oreCopper.registerItemModel(Item.getItemFromBlock(oreCopper));
        oreTin.registerItemModel(Item.getItemFromBlock(oreTin));
        oreSilver.registerItemModel(Item.getItemFromBlock(oreSilver));
        oreLead.registerItemModel(Item.getItemFromBlock(oreLead));
    }
}
