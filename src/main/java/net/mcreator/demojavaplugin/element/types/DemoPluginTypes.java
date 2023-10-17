package net.mcreator.demojavaplugin.element.types;

import net.mcreator.element.BaseType;
import net.mcreator.element.ModElementType;
import net.mcreator.demojavaplugin.ui.modgui.DemoPluginGUI;

import static net.mcreator.element.ModElementTypeLoader.register;

public class DemoPluginTypes {
    public static ModElementType<?> DEMOPLUGIN;
    public static void load(){
        DEMOPLUGIN = register(new ModElementType<>("demojava", null, BaseType.OTHER, DemoPluginGUI::new, DemoPlugin.class));
    }
}
