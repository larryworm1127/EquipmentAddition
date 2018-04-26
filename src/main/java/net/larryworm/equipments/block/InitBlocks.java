package net.larryworm.equipments.block;

import net.larryworm.equipments.block.base.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class InitBlocks {

    // Ores
    public static Block oreCopper;
    public static Block oreTin;
    public static Block oreSilver;

    // Misc
    public static Block blockCopper;
    public static Block blockTin;
    public static Block blockBronze;
    public static Block blockSteel;
    public static Block blockSilver;
    public static Block blockMithril;

    // Tile Entities
    public static Block metalForge;

    public static void init() {
        oreCopper = new BlockOre("ore_copper");
        oreTin = new BlockOre("ore_tin");
        oreSilver = new BlockOre("ore_silver");

        blockCopper = new BlockBase(Material.ROCK, "block_copper");
        blockTin = new BlockBase(Material.ROCK, "block_tin");
        blockBronze = new BlockBase(Material.ROCK, "block_bronze");
        blockSilver = new BlockBase(Material.ROCK, "block_silver");
        blockSteel = new BlockBase(Material.ROCK, "block_steel");
        blockMithril = new BlockBase(Material.ROCK, "block_mithril");

        metalForge = new BlockMetalForge();
    }
}
