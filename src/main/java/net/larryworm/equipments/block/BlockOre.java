package net.larryworm.equipments.block;

import net.larryworm.equipments.block.base.BlockBase;
import net.minecraft.block.material.Material;

public class BlockOre extends BlockBase {

    public BlockOre(String name) {
        super(Material.ROCK, name);

        setHardness(3f);
        setResistance(5f);
    }
}
