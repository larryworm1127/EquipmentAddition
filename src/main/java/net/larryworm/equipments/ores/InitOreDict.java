package net.larryworm.equipments.ores;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class InitOreDict {

    public static void init() {

    }

    private static void addOre(Item item, int meta, String name) {
        addOre(new ItemStack(item, 1, meta), name);
    }

    private static void addOre(Item item, String name) {
        addOre(item, 0, name);
    }

    private static void addOre(Block block, int meta, String name) {
        addOre(new ItemStack(block, 1, meta), name);
    }

    private static void addOre(ItemStack stack, String name) {
        OreDictionary.registerOre(name, stack);
    }
}
