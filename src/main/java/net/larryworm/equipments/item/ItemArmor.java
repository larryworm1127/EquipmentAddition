package net.larryworm.equipments.item;

import net.larryworm.equipments.EquipmentAddition;
import net.larryworm.equipments.util.ItemUtil;
import net.larryworm.equipments.util.ModUtil;
import net.larryworm.equipments.util.TypeUtil;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import org.apache.commons.lang3.StringUtils;

public class ItemArmor extends net.minecraft.item.ItemArmor {

    private String name;
    private TypeUtil type;

    public ItemArmor(ArmorMaterial material, EntityEquipmentSlot slot, String name) {
        super(material, 0, slot);
        this.name = name;
        this.type = TypeUtil.ARMOR;

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
