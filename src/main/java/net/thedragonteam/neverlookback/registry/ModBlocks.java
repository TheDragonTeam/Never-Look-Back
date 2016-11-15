/*
 * Copyright (c) TheDragonTeam 2016.
 */

package net.thedragonteam.neverlookback.registry;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thedragonteam.neverlookback.blocks.BlockTypes;
import net.thedragonteam.neverlookback.blocks.base.BlockBase;

public class ModBlocks {

    public static BlockBase none, normal, advanced, expert;

    public static void init() {
        none = new BlockBase(BlockTypes.NONE);
        normal = new BlockBase(BlockTypes.NORMAL);
        advanced = new BlockBase(BlockTypes.ADVANCED);
        expert = new BlockBase(BlockTypes.EXPERT);
    }

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        none.initModel();
        normal.initModel();
        advanced.initModel();
        expert.initModel();
    }
}
