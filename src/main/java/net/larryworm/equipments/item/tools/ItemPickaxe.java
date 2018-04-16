package net.larryworm.equipments.item.tools;

import net.larryworm.equipments.EquipmentAddition;
import net.larryworm.equipments.util.ItemUtil;
import net.larryworm.equipments.util.ModUtil;

public class ItemPickaxe extends net.minecraft.item.ItemPickaxe {

    private String name;

    public ItemPickaxe(ToolMaterial material, String name) {
        super(material);
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
