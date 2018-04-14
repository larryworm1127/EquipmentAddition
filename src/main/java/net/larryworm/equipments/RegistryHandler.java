package net.larryworm.equipments;

import net.larryworm.equipments.block.InitBlocks;
import net.larryworm.equipments.item.InitItems;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.ArrayList;
import java.util.List;

@Mod.EventBusSubscriber
public class RegistryHandler {

    public static final List<Block> BLOCKS_TO_REGISTER = new ArrayList<>();
    public static final List<Item> ITEMS_TO_REGISTER = new ArrayList<>();

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
    }
}
