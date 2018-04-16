package net.larryworm.equipments.proxy;

import net.larryworm.equipments.RegistryHandler;
import net.larryworm.equipments.util.ModUtil;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;

public class ClientProxy extends CommonProxy {

    @Override
    public void addRenderRegister(Item item, ResourceLocation location, String variant){
        RegistryHandler.MODEL_LOCATIONS_FOR_REGISTERING.put(item, new ModelResourceLocation(location, variant));
    }
}
