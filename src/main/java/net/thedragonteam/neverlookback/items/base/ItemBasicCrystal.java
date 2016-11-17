package net.thedragonteam.neverlookback.items.base;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thedragonteam.neverlookback.NeverLookBack;
import net.thedragonteam.thedragonlib.util.InfoHelper;

import java.util.List;

public class ItemBasicCrystal extends ItemBase {

    public ItemBasicCrystal() {
        super("crystal");
        setHasSubtypes(true);
        setCreativeTab(NeverLookBack.neverLookBackTab);
    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {
        switch (stack.getItemDamage()) {
            case 0:
                return super.getUnlocalizedName(stack) + "_" + "black";
            case 1:
                return super.getUnlocalizedName(stack) + "_" + "white";
            case 2:
                return super.getUnlocalizedName(stack) + "_" + "blue";
            case 3:
                return super.getUnlocalizedName(stack) + "_" + "red";
        }
        return super.getUnlocalizedName(stack);
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced) {
        tooltip.add(InfoHelper.HITC() + "A crystal used for experiments");

    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName() + "_black", "inventory"));
        ModelLoader.setCustomModelResourceLocation(this, 1, new ModelResourceLocation(getRegistryName() + "_white", "inventory"));
        ModelLoader.setCustomModelResourceLocation(this, 2, new ModelResourceLocation(getRegistryName() + "_blue", "inventory"));
        ModelLoader.setCustomModelResourceLocation(this, 3, new ModelResourceLocation(getRegistryName() + "_red", "inventory"));
    }

    @Override
    public void getSubItems(Item itemIn, CreativeTabs tab, NonNullList<ItemStack> subItems) {
        for (int i = 0; i <= 3; i++) {
            subItems.add(new ItemStack(itemIn, 1, i));
        }
    }
}