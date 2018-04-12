package net.larryworm.equipments.item;

import net.larryworm.equipments.EquipmentAddition;
import net.larryworm.equipments.util.ModUtil;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item {

    protected String name;

    public ItemBase(String name) {
        this.name = name;

        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(ModUtil.CREATIVE_TAB);
    }

    public void registerItemModel() {
        EquipmentAddition.proxy.registerItemRenderer(this, 0, name);
    }

    @Override
    public ItemBase setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }
}
