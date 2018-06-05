package net.larryworm.equipments.recipe;

import net.minecraft.item.ItemStack;

import static net.larryworm.equipments.block.InitBlocks.*;
import static net.larryworm.equipments.item.InitItems.*;
import static net.larryworm.equipments.util.RecipeUtil.addSmelting;

public class InitRecipes {

    public static void init() {
        addSmelting(oreTin, new ItemStack(ingotTin), 0.7f);
        addSmelting(oreSilver, new ItemStack(ingotSilver), 0.7f);
        addSmelting(oreCopper, new ItemStack(ingotCopper), 0.7f);
    }
}
