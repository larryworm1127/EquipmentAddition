package net.larryworm.equipments.item;

import net.larryworm.equipments.EquipmentAddition;
import net.larryworm.equipments.util.ItemUtil;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemBase extends Item {

    protected String name;

    public ItemBase(String name) {
        this.name = name;

        this.register();
    }

    private void register() {
        ItemUtil.registerItem(this, this.getBaseName());

        this.registerRendering();
    }

    protected String getBaseName() {
        return this.name;
    }

    protected void registerRendering() {
        EquipmentAddition.proxy.addRenderRegister(new ItemStack(this), this.getRegistryName(), "inventory");
    }
}
