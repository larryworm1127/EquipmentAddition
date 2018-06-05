package net.larryworm.equipments.util;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class RecipeUtil {

    public static void addSmelting(Block block, ItemStack output, float xp) {
        GameRegistry.addSmelting(block, output, xp);
    }
}
