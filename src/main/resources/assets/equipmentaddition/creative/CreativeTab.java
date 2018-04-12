package assets.equipmentaddition.creative;

import net.larryworm.equipments.util.ModUtil;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class CreativeTab extends CreativeTabs {

    public CreativeTab() {
        super(ModUtil.MOD_ID);
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(Items.IRON_CHESTPLATE);
    }
}
