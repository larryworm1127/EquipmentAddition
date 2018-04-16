package net.larryworm.equipments.block;

import net.minecraft.block.Block;

public class InitBlocks {

    public static Block oreCopper;
    public static Block oreTin;

    public static void init() {
        oreCopper = new BlockOre("ore_copper");
        oreTin = new BlockOre("ore_tin");
    }
}
