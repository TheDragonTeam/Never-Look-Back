package net.thedragonteam.neverlookback.blocks;

import net.minecraft.block.material.Material;

public enum BlockTypes {
    NONE(Material.AIR, "none"),
    NORMAL(Material.WOOD, "normal"),
    ADVANCED(Material.ROCK, "advanced"),
    EXPERT(Material.IRON, "expert");

    private final Material material;

    private final String name;

    private final float resistance;

    private final float hardness;

    private final String tool;

    private final int harvestLevel;

    private final float lightLevel;

    private final int lightOpacity;

    BlockTypes(Material materialIn, String nameIn) {
        this(materialIn, nameIn, 0, 0.0F, null, 0, 0.0F, 0);
    }

    BlockTypes(Material materialIn, String nameIn, float resistanceIn) {
        this(materialIn, nameIn, resistanceIn, 0.0F, null, 0, 0.0F, 0);
    }

    BlockTypes(Material materialIn, String nameIn, float resistanceIn, float hardnessIn) {
        this(materialIn, nameIn, resistanceIn, hardnessIn, null, 0, 0.0F, 0);
    }

    BlockTypes(Material materialIn, String nameIn, float resistanceIn, float hardnessIn, String toolIn) {
        this(materialIn, nameIn, resistanceIn, hardnessIn, toolIn, 0, 0.0F, 0);
    }

    BlockTypes(Material materialIn, String nameIn, float resistanceIn, float hardnessIn, String toolIn, int harvestLevelIn) {
        this(materialIn, nameIn, resistanceIn, hardnessIn, toolIn, harvestLevelIn, 0.0F, 0);
    }

    BlockTypes(Material materialIn, String nameIn, float resistanceIn, float hardnessIn, String toolIn, int harvestLevelIn, float lightLevelIn) {
        this(materialIn, nameIn, resistanceIn, hardnessIn, toolIn, harvestLevelIn, lightLevelIn, 0);
    }

    BlockTypes(Material materialIn, String nameIn, float resistanceIn, float hardnessIn, String toolIn, int harvestLevelIn, float lightLevelIn, int lightOpacityIn) {
        this.material = materialIn;
        this.name = nameIn;
        this.resistance = resistanceIn;
        this.hardness = hardnessIn;
        this.tool = toolIn;
        this.harvestLevel = harvestLevelIn;
        this.lightLevel = lightLevelIn;
        this.lightOpacity = lightOpacityIn;
    }

    public Material getMaterial() {
        return material;
    }

    public String getName() {
        return "block_" + name;
    }

    public float getResistance() {
        return resistance;
    }

    public float getHardness() {
        return hardness;
    }

    public String getTool() {
        return tool;
    }

    public int getHarvestLevel() {
        return harvestLevel;
    }

    public float getLightLevel() {
        return lightLevel;
    }

    public int getLightOpacity() {
        return lightOpacity;
    }
}
