package net.larryworm.equipments.materials;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;


public class InitToolMaterial {

    public static ToolMaterial BRONZE_TOOL_MATERIAL;
    public static ToolMaterial MITHRIL_TOOL_MATERIAL;
    public static ToolMaterial STEEL_TOOL_MATERIAL;
    public static ToolMaterial COPPER_TOOL_MATERIAL;
    public static ToolMaterial SILVER_TOOL_MATERIAL;
    public static ToolMaterial TIN_TOOL_MATERIAL;

    public static void init() {
        BRONZE_TOOL_MATERIAL = addToolMaterial("BRONZE", 2, 350, 7.0F, 2.5F, 14);
        MITHRIL_TOOL_MATERIAL = addToolMaterial("MITHRIL", 4, 2000, 12.0F, 10.0F, 22);
        STEEL_TOOL_MATERIAL = addToolMaterial("STEEL", 3, 800, 7.0F, 3.0F, 12);
        COPPER_TOOL_MATERIAL = addToolMaterial("COPPER", 2, 220, 5.0F, 1.7F, 18);
        SILVER_TOOL_MATERIAL = addToolMaterial("SILVER", 2, 450, 6.0F, 2.0F, 16);
        TIN_TOOL_MATERIAL = addToolMaterial("TIN", 2, 200, 5.0F, 1.5F, 14);
    }

    private static ToolMaterial addToolMaterial(String name, int harvestLevel, int maxUses, float efficiency, float damage, int enchantability) {
        return EnumHelper.addToolMaterial(name, harvestLevel, maxUses, efficiency, damage, enchantability);
    }
}
