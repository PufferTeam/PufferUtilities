package net.pufferteam.voltworks.pufferutilities.init;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.pufferteam.voltworks.pufferutilities.objects.blocks.BlockBase;

import java.util.ArrayList;
import java.util.List;

public class BlockInit {

    public static final List<Block> BLOCKS = new ArrayList<>();

    public static final Block MOSS = new BlockBase("moss", Material.PLANTS);

}
