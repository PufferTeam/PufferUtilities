package net.pufferteam.voltworks.pufferutilities.objects.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockWoodSlab;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.pufferteam.voltworks.pufferutilities.PufferUtilities;
import net.pufferteam.voltworks.pufferutilities.init.BlockInit;
import net.pufferteam.voltworks.pufferutilities.init.ItemInit;
import net.pufferteam.voltworks.pufferutilities.utils.IHasModel;

public class CampfireLogBlock extends Block implements IHasModel {

    protected static final AxisAlignedBB AABB_BOTTOM_HALF = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.5D, 1.0D);

    public CampfireLogBlock() {
        super(Material.WOOD);
        setRegistryName("campfire_log");
        setTranslationKey("campfire_log");
        setCreativeTab(PufferUtilities.pufferTab);
        setSoundType(SoundType.WOOD);
        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @SuppressWarnings("deprecation")
    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
        return AABB_BOTTOM_HALF;
    }

    @SuppressWarnings("deprecation")
    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    @Override
    public void registerModels() {
        PufferUtilities.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
}
