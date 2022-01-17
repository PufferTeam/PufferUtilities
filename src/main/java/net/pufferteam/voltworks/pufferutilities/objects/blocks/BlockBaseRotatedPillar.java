package net.pufferteam.voltworks.pufferutilities.objects.blocks;

import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.EnumFacing;
import net.pufferteam.voltworks.pufferutilities.PufferUtilities;
import net.pufferteam.voltworks.pufferutilities.init.BlockInit;
import net.pufferteam.voltworks.pufferutilities.init.ItemInit;
import net.pufferteam.voltworks.pufferutilities.utils.IHasModel;

public class BlockBaseRotatedPillar extends BlockRotatedPillar implements IHasModel {

    public BlockBaseRotatedPillar(String name, Material mat) {
        super(mat);
        setTranslationKey(name);
        setRegistryName(name);
        setCreativeTab(PufferUtilities.pufferTab);
        setDefaultState(this.blockState.getBaseState().withProperty(AXIS, EnumFacing.Axis.Y));
        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Override
    public void registerModels() {
        PufferUtilities.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
}
