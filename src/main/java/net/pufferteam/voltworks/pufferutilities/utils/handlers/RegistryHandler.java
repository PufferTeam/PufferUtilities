package net.pufferteam.voltworks.pufferutilities.utils.handlers;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.pufferteam.voltworks.pufferutilities.init.BlockInit;
import net.pufferteam.voltworks.pufferutilities.init.ItemInit;
import net.pufferteam.voltworks.pufferutilities.utils.IHasModel;

@Mod.EventBusSubscriber
public class RegistryHandler {

    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(ItemInit.ITEMS.toArray(new Item[0]));
    }

    @SubscribeEvent
    public static void onBlockRegister(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(BlockInit.BLOCKS.toArray(new Block[0]));
    }

    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent event) {
        ItemInit.ITEMS.stream().filter(IHasModel.class::isInstance).map(IHasModel.class::cast).forEach(IHasModel::registerModels);
        BlockInit.BLOCKS.stream().filter(IHasModel.class::isInstance).map(IHasModel.class::cast).forEach(IHasModel::registerModels);
    }
}