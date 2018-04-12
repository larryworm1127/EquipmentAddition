package net.larryworm.equipments.recipe;

import net.larryworm.equipments.block.InitBlocks;
import net.larryworm.equipments.item.InitItem;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class InitRecipes {

    public static void init() {
        GameRegistry.addSmelting(InitBlocks.oreCopper, new ItemStack(InitItem.ingotCopper), 0.7f);
        GameRegistry.addSmelting(InitBlocks.oreTin, new ItemStack(InitItem.ingotTin), 0.7f);
    }
}
