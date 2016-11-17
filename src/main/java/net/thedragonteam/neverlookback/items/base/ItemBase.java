package net.thedragonteam.neverlookback.items.base;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thedragonteam.neverlookback.items.ItemTypes;

import static net.thedragonteam.neverlookback.util.Utils.setName;

public class ItemBase extends Item {

    private ItemTypes types;

    private String name;

    public ItemBase(ItemTypes typesIn) {
        this(typesIn.getName());
    }

    public ItemBase(String nameIn) {
        this(nameIn, 0);
    }

    public ItemBase(String nameIn, int durability) {
        setMaxDamage(durability);
        setRegistryName(nameIn);
        setUnlocalizedName(setName(nameIn));
        GameRegistry.register(this);
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}
