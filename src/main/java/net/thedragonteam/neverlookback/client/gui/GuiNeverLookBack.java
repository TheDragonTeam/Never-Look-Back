package net.thedragonteam.neverlookback.client.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.item.ItemStack;
import net.thedragonteam.neverlookback.progression.DefaultProgressionHandler;
import net.thedragonteam.neverlookback.progression.ProgressionType;
import net.thedragonteam.neverlookback.registry.ModItems;

import java.util.Objects;

public class GuiNeverLookBack extends GuiScreen {

    public DefaultProgressionHandler handler = new DefaultProgressionHandler();

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        drawDefaultBackground();
        Minecraft mc = Minecraft.getMinecraft();
        int guiWidth = 256;
        int guiHeight = 256;
        int guiX = (width - guiWidth) / 2;
        int guiY = (height - guiHeight) / 2;
        if (Objects.equals(handler.getType(), ProgressionType.NONE.getType()))
            mc.getRenderItem().renderItemIntoGUI(new ItemStack(ModItems.none), guiX, guiY);
        if (Objects.equals(handler.getType(), ProgressionType.NORMAL.getType()))
            mc.getRenderItem().renderItemIntoGUI(new ItemStack(ModItems.normal), guiX, guiY);
        if (Objects.equals(handler.getType(), ProgressionType.ADVANCED.getType()))
            mc.getRenderItem().renderItemIntoGUI(new ItemStack(ModItems.advanced), guiX, guiY);
        if (Objects.equals(handler.getType(), ProgressionType.EXPERT.getType()))
            mc.getRenderItem().renderItemIntoGUI(new ItemStack(ModItems.expert), guiX, guiY);
        super.drawScreen(mouseX, mouseY, partialTicks);
    }
}
