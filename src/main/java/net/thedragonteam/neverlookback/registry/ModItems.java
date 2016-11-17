/*
 * Copyright (c) TheDragonTeam 2016.
 */

package net.thedragonteam.neverlookback.registry;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thedragonteam.neverlookback.items.ItemTypes;
import net.thedragonteam.neverlookback.items.base.ItemBase;
import net.thedragonteam.neverlookback.items.base.ItemBasicCrystal;

public class ModItems {

    public static ItemBase none, normal, advanced, expert;

    public static ItemBasicCrystal crystals;

    public static void init() {
        none = new ItemBase(ItemTypes.NONE);
        normal = new ItemBase(ItemTypes.NORMAL);
        advanced = new ItemBase(ItemTypes.ADVANCED);
        expert = new ItemBase(ItemTypes.EXPERT);
        crystals = new ItemBasicCrystal();
    }

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        none.initModel();
        normal.initModel();
        advanced.initModel();
        expert.initModel();
        crystals.initModel();
    }
}
