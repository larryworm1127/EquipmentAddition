package net.larryworm.equipments.item.tools;

import net.larryworm.equipments.EquipmentAddition;
import net.larryworm.equipments.util.ModUtil;

public class ItemHoe extends net.minecraft.item.ItemHoe {

    private String name;

    public ItemHoe(ToolMaterial material, String name) {
        super(material);

        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(ModUtil.CREATIVE_TAB);
        this.name = name;
    }

    public void registerItemModel() {
        EquipmentAddition.proxy.registerItemRenderer(this, 0, name);
    }
}
