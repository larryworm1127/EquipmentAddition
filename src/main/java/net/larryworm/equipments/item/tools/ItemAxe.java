package net.larryworm.equipments.item.tools;

import net.larryworm.equipments.EquipmentAddition;
import net.larryworm.equipments.util.ItemUtil;
import net.larryworm.equipments.util.ModUtil;

public class ItemAxe extends net.minecraft.item.ItemAxe {

    private String name;

    public ItemAxe(ToolMaterial material, String name) {
        super(material, 8f, -3.1f);
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
        EquipmentAddition.proxy.addRenderRegister(this, this.getRegistryName(), "inventory");
    }
}
