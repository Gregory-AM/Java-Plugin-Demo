package net.mcreator.demojavaplugin;

import net.mcreator.demojavaplugin.element.types.DemoPluginTypes;
import net.mcreator.plugin.JavaPlugin;
import net.mcreator.plugin.Plugin;
import net.mcreator.plugin.events.PreGeneratorsLoadingEvent;

public class Launcher extends JavaPlugin {
    public Launcher(Plugin plugin) {
        super(plugin);
        addListener(PreGeneratorsLoadingEvent.class, e -> DemoPluginTypes.load());
    }
}
