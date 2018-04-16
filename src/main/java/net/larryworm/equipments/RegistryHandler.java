package net.larryworm.equipments;

import net.larryworm.equipments.block.InitBlocks;
import net.larryworm.equipments.item.InitItems;
import net.larryworm.equipments.ores.InitOreDict;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RegistryHandler {

    public static final List<Block> BLOCKS_TO_REGISTER = new ArrayList<>();
    public static final List<Item> ITEMS_TO_REGISTER = new ArrayList<>();
    public static final Map<ItemStack, ModelResourceLocation> MODEL_LOCATIONS_FOR_REGISTERING = new HashMap<ItemStack, ModelResourceLocation>();

    @SubscribeEvent
    public void onBlockRegistry(Register<Block> event) {
        InitBlocks.init();

        for(Block block : BLOCKS_TO_REGISTER){
            event.getRegistry().register(block);
        }
    }

    @SubscribeEvent
    public void onItemRegistry(Register<Item> event){
        InitItems.init();

        for(Item item : ITEMS_TO_REGISTER){
            event.getRegistry().register(item);
        }

        ITEMS_TO_REGISTER.clear();

        InitOreDict.init();
    }

    @SubscribeEvent
    public void onModelRegistry(ModelRegistryEvent event) {
        for(Map.Entry<ItemStack, ModelResourceLocation> entry : MODEL_LOCATIONS_FOR_REGISTERING.entrySet()){
            ModelLoader.setCustomModelResourceLocation(entry.getKey().getItem(), 0, entry.getValue());
        }
    }
}
