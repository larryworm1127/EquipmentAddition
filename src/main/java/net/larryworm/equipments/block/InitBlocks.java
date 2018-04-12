package net.larryworm.equipments.block;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class InitBlocks {

    public static BlockOre oreCopper = new BlockOre("ore_copper");
    public static BlockOre oreTin = new BlockOre("ore_tin");

    public static void register(IForgeRegistry<Block> registry) {
        registry.registerAll(
                oreCopper,
                oreTin
        );
    }

    public static void registerItemBlocks(IForgeRegistry<Item> registry) {
        registry.registerAll(
                oreCopper.createItemBlock(),
                oreTin.createItemBlock()
        );
    }

    public static void registerModels() {
        oreCopper.registerItemModel(Item.getItemFromBlock(oreCopper));
        oreTin.registerItemModel(Item.getItemFromBlock(oreTin));
    }
}
