package net.larryworm.equipments;

import net.larryworm.equipments.block.base.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.HashMap;
import java.util.Map;

public class ClientRegistryHandler {

    public static final Map<ItemStack, ModelResourceLocation> MODEL_LOCATIONS_FOR_REGISTERING = new HashMap<ItemStack, ModelResourceLocation>();

    @SubscribeEvent
    public void onModelRegistry(ModelRegistryEvent event) {
        for (Block block : RegistryHandler.BLOCKS_TO_REGISTER) {
            if (block instanceof IHasModel) {
                ((IHasModel) block).registerRendering();
            }
        }

        for (Map.Entry<ItemStack, ModelResourceLocation> entry : MODEL_LOCATIONS_FOR_REGISTERING.entrySet()) {
            ModelLoader.setCustomModelResourceLocation(entry.getKey().getItem(), 0, entry.getValue());
        }
    }
}
