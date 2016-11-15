/*
 * Copyright (c) TheDragonTeam 2016.
 */

package net.thedragonteam.neverlookback.blocks.base;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thedragonteam.neverlookback.NeverLookBack;
import net.thedragonteam.neverlookback.blocks.BlockTypes;

import static net.thedragonteam.neverlookback.util.Utils.setName;

public class BlockBase extends Block {

    public BlockBase(BlockTypes types) {
        this(types.getMaterial(), types.getName(), types.getResistance(), types.getHardness(), types.getTool(), types.getHarvestLevel(), types.getLightLevel(), types.getLightOpacity());
    }

    public BlockBase(Material material, String name, boolean unbreakable) {
        this(material, name);
        if (unbreakable) {
            setBlockUnbreakable();
        }
    }

    public BlockBase(Material material, String name) {
        this(material, name, 0F);
    }

    public BlockBase(Material material, String name, float resistance) {
        this(material, name, resistance, 0F);
    }

    public BlockBase(Material material, String name, float resistance, float hardness) {
        this(material, name, resistance, hardness, null);
    }

    public BlockBase(Material material, String name, float resistance, float hardness, String tool) {
        this(material, name, resistance, hardness, tool, 0);
    }

    public BlockBase(Material material, String name, float resistance, float hardness, String tool, int harvestLevel) {
        this(material, name, resistance, hardness, tool, harvestLevel, 0F);
    }

    public BlockBase(Material material, String name, float resistance, float hardness, String tool, int harvestLevel, float lightLevel) {
        this(material, name, resistance, hardness, tool, harvestLevel, lightLevel, 0);
    }

    public BlockBase(Material material, String name, float resistance, float hardness, String tool, int harvestLevel, float lightLevel, int lightOpacity) {
        super(material);
        setRegistryName(name);
        setUnlocalizedName(setName(name));
        this.setResistance(resistance);
        this.setHardness(hardness);
        this.setHarvestLevel(tool, harvestLevel);
        this.setLightLevel(lightLevel);
        this.setLightOpacity(lightOpacity);
        setCreativeTab(NeverLookBack.nmTab);
        GameRegistry.register(this);
        GameRegistry.register(new ItemBlock(this), getRegistryName());
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}
