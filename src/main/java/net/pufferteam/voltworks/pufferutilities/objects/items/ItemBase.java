package net.pufferteam.voltworks.pufferutilities.objects.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.pufferteam.voltworks.pufferutilities.PufferUtilities;
import net.pufferteam.voltworks.pufferutilities.init.ItemInit;
import net.pufferteam.voltworks.pufferutilities.utils.IHasModel;

public class ItemBase extends Item implements IHasModel {

    public ItemBase(String name) {
        setTranslationKey(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.TRANSPORTATION);
        ItemInit.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        PufferUtilities.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
