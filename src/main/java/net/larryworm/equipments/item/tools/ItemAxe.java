package net.larryworm.equipments.item.tools;

import net.larryworm.equipments.EquipmentAddition;
import net.larryworm.equipments.util.ModUtil;

public class ItemAxe extends net.minecraft.item.ItemAxe {

    private String name;

    public ItemAxe(ToolMaterial material, String name) {
        super(material, 8f, -3.1f);

        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(ModUtil.CREATIVE_TAB);
        this.name = name;
    }

    public void registerItemModel() {
        EquipmentAddition.proxy.registerItemRenderer(this, 0, name);
    }
}
