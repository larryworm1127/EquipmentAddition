package net.larryworm.equipments.block;

import net.larryworm.equipments.EquipmentAddition;
import net.larryworm.equipments.util.ItemUtil;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class BlockBase extends Block {

    protected String name;

    public BlockBase(Material material, String name) {
        super(material);
        this.name = name;

        this.register();
    }

    private void register() {
        ItemUtil.registerBlock(this, this.createItemBlock(), this.getBaseName());

        this.registerRendering();
    }

    protected String getBaseName() {
        return this.name;
    }

    public void registerRendering(){
        EquipmentAddition.proxy.addRenderRegister(this.createItemBlock(), this.getRegistryName(), "inventory");
    }

    public Item createItemBlock() {
        return new ItemBlock(this);
    }
}
