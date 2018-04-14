package net.larryworm.equipments.recipe;

import net.larryworm.equipments.block.InitBlocks;
import net.larryworm.equipments.item.InitItems;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class InitRecipes {

    public static void init() {
        GameRegistry.addSmelting(InitBlocks.oreCopper, new ItemStack(InitItems.ingotCopper), 0.7f);
        GameRegistry.addSmelting(InitBlocks.oreTin, new ItemStack(InitItems.ingotTin), 0.7f);
    }
}
