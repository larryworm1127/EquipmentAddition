package net.larryworm.equipments.block;

public class InitBlocks {

    public static BlockOre oreCopper;
    public static BlockOre oreTin;

    public static void init() {
        oreCopper = new BlockOre("ore_copper");
        oreTin = new BlockOre("ore_tin");
    }
}
