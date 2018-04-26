package net.larryworm.equipments.proxy;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.translation.I18n;

public class CommonProxy {

    public void addRenderRegister(ItemStack stack, ResourceLocation location, String variant){
    }

    public String localize(String unlocalized, Object... args) {
        return I18n.translateToLocalFormatted(unlocalized, args);
    }
}
