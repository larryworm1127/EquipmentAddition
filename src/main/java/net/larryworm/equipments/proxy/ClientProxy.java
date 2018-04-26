package net.larryworm.equipments.proxy;

import net.larryworm.equipments.RegistryHandler;
import net.larryworm.equipments.renderer.TERenderMetalForge;
import net.larryworm.equipments.tile.TileEntityMetalForge;
import net.larryworm.equipments.util.ModUtil;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.resources.I18n;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.client.registry.ClientRegistry;

public class ClientProxy extends CommonProxy {

    @Override
    public void addRenderRegister(ItemStack stack, ResourceLocation location, String variant){
        RegistryHandler.MODEL_LOCATIONS_FOR_REGISTERING.put(stack, new ModelResourceLocation(location, variant));
    }

    @Override
    public String localize(String unlocalized, Object... args) {
        return I18n.format(unlocalized, args);
    }

    @Override
    public void registerRenderers() {
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityMetalForge.class, new TERenderMetalForge());
    }
}
