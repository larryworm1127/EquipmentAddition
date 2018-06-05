package net.larryworm.equipments.ores;

import net.larryworm.equipments.block.InitBlocks;
import net.larryworm.equipments.item.InitItems;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class InitOreDict {

    public static void init() {
        addOre(InitItems.ingotBronze, "ingotBronze");
        addOre(InitItems.ingotSteel, "ingotSteel");
        addOre(InitItems.ingotTin, "ingotTin");
        addOre(InitItems.ingotSilver, "ingotSilver");
        addOre(InitItems.ingotMithril, "ingotMithril");
        addOre(InitItems.ingotCopper, "ingotCopper");

        addOre(InitBlocks.oreCopper, "oreCopper");
        addOre(InitBlocks.oreSilver, "oreSilver");
        addOre(InitBlocks.oreTin, "oreTin");
    }

    private static void addOre(Item item, String name) {
        addOre(new ItemStack(item, 1, 0), name);
    }

    private static void addOre(Block block, String name) {
        addOre(new ItemStack(block, 1, 0), name);
    }

    private static void addOre(ItemStack stack, String name) {
        OreDictionary.registerOre(name, stack);
    }
}
