package net.thedragonteam.neverlookback.input;

import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import net.thedragonteam.neverlookback.client.gui.GuiNeverLookBack;

public class InputHandler {

    @SubscribeEvent
    public void onKeyInput(InputEvent.KeyInputEvent event) {
        if (KeyBindings.toggleNLBGui.isPressed()) {
            Minecraft.getMinecraft().displayGuiScreen(new GuiNeverLookBack());
        }
    }
}
