package net.pufferteam.voltworks.pufferutilities;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.pufferteam.voltworks.pufferutilities.init.BlockInit;
import net.pufferteam.voltworks.pufferutilities.proxy.CommonProxy;
import net.pufferteam.voltworks.pufferutilities.utils.Reference;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class PufferUtilities {

    @Mod.Instance
    public static PufferUtilities instance;

    public static final PufferTab pufferTab = new PufferTab();

    @SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.COMMON_PROXY)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public static void preInit(FMLPreInitializationEvent event) {}

    @Mod.EventHandler
    public static void init(FMLInitializationEvent event) {}

    @Mod.EventHandler
    public static void postInit(FMLPostInitializationEvent event) {}

    private static class PufferTab extends CreativeTabs {

        public PufferTab() {
            super("puffertab");
        }

        @Override
        public ItemStack createIcon() {
            return new ItemStack(BlockInit.CAMPFIRE_LOG);
        }
    }

}
