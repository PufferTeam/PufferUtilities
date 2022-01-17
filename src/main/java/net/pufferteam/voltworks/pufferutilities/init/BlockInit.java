package net.pufferteam.voltworks.pufferutilities.init;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.pufferteam.voltworks.pufferutilities.objects.blocks.BlockBase;
import net.pufferteam.voltworks.pufferutilities.objects.blocks.BlockBaseRotatedPillar;
import net.pufferteam.voltworks.pufferutilities.objects.blocks.CampfireLogBlock;

import java.util.ArrayList;
import java.util.List;

public class BlockInit {

    public static final List<Block> BLOCKS = new ArrayList<>();

    public static final Block MOSS = new BlockBase("moss", Material.GRASS, SoundType.PLANT);
    public static final Block TUFF = new BlockBase("tuff", Material.GROUND);
    public static final Block CALCITE = new BlockBase("calcite", Material.GROUND);
    public static final Block SMOOTH_BASALT = new BlockBase("smooth_basalt", Material.GROUND);
    public static final Block BASALT = new BlockBaseRotatedPillar("basalt", Material.GROUND);
    public static final Block POLISHED_BASALT = new BlockBaseRotatedPillar("polished_basalt", Material.GROUND);
    public static final Block DEEPSLATE = new BlockBase("deepslate", Material.GROUND);
    public static final Block DEEPSLATE_BRICKS = new BlockBase("deepslate_bricks", Material.GROUND);
    public static final Block CHISELED_DEEPSLATE = new BlockBase("chiseled_deepslate", Material.GROUND);
    public static final Block COBBLED_DEEPSLATE = new BlockBase("cobbled_deepslate", Material.GROUND);
    public static final Block CRACKED_DEEPSLATE_BRICKS = new BlockBase("cracked_deepslate_bricks", Material.GROUND);
    public static final Block CRACKED_DEEPSLATE_TILES = new BlockBase("cracked_deepslate_tiles", Material.GROUND);
    public static final Block CAMPFIRE_LOG = new CampfireLogBlock();

}
