package net.larryworm.equipments.item.tools;

import net.larryworm.equipments.EquipmentAddition;
import net.larryworm.equipments.util.ModUtil;
import net.larryworm.equipments.util.TypeUtil;
import net.larryworm.equipments.util.ItemUtil;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import org.apache.commons.lang3.StringUtils;

public class ItemAxe extends net.minecraft.item.ItemAxe {

    private String name;
    private TypeUtil type;

    public ItemAxe(ToolMaterial material, String name) {
        super(material, 8f, -3.1f);
        this.name = name;
        this.type = TypeUtil.TOOL;

        this.register();
    }

    private void register() {
        ItemUtil.registerItem(this, this.getBaseName());

        this.registerRendering();
    }

    private String getBaseName() {
        return this.name;
    }

    protected void registerRendering() {
        String path = StringUtils.joinWith("/", this.type.getName(), this.name);

        ResourceLocation location = new ResourceLocation(ModUtil.MOD_ID, path);
        EquipmentAddition.proxy.addRenderRegister(new ItemStack(this), location, "inventory");
    }
}
