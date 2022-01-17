package net.pufferteam.voltworks.pufferutilities.objects.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.pufferteam.voltworks.pufferutilities.PufferUtilities;
import net.pufferteam.voltworks.pufferutilities.init.BlockInit;
import net.pufferteam.voltworks.pufferutilities.init.ItemInit;
import net.pufferteam.voltworks.pufferutilities.utils.IHasModel;

public class BlockBase extends Block implements IHasModel {

    public BlockBase(String name, Material mat) {
        this(name, mat, SoundType.STONE);
    }

    public BlockBase(String name, Material mat, SoundType sound) {
        super(mat);
        setSoundType(sound);
        setTranslationKey(name);
        setRegistryName(name);
        setCreativeTab(PufferUtilities.pufferTab);
        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Override
    public void registerModels() {
        PufferUtilities.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
}
