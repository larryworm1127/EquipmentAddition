package net.larryworm.equipments.materials;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;


public class InitToolMaterial {

    public static ToolMaterial BRONZE_TOOL_MATERIAL;

    public static void init() {
        BRONZE_TOOL_MATERIAL = addToolMaterial("BRONZE", 2, 500, 6, 2, 14);
    }

    private static ToolMaterial addToolMaterial(String name, int harvestLevel, int maxUses, float efficiency, float damage, int enchantability){
        return EnumHelper.addToolMaterial(name, harvestLevel, maxUses, efficiency, damage, enchantability);
    }
}
