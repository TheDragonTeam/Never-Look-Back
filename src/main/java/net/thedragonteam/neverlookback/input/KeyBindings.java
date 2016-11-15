package net.thedragonteam.neverlookback.input;

import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.lwjgl.input.Keyboard;

@SideOnly(Side.CLIENT)
public class KeyBindings {

    public static KeyBinding toggleNLBGui;

    public static void init() {
        toggleNLBGui = new KeyBinding("key.never_look_back", Keyboard.KEY_SEMICOLON, "key.categories.never_look_back");
        ClientRegistry.registerKeyBinding(toggleNLBGui);
    }
}