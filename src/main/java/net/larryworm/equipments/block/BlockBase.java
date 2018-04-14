package net.larryworm.equipments.block;

import net.larryworm.equipments.EquipmentAddition;
import net.larryworm.equipments.util.ItemUtil;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block {

    protected String name;

    public BlockBase(Material material, String name) {
        super(material);
        this.name = name;

        this.register();
    }

    private void register() {
        ItemUtil.registerBlock(this, this.getItemBlock(), this.getBaseName());
    }

    protected String getBaseName() {
        return this.name;
    }

    public void registerItemModel(Item itemBlock) {
        EquipmentAddition.proxy.registerItemRenderer(itemBlock, 0, name);
    }

    public ItemBlockBase getItemBlock() {
        return new ItemBlockBase(this);
    }
}
