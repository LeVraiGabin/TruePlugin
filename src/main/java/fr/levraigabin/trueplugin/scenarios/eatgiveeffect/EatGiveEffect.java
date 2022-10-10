package fr.levraigabin.trueplugin.scenarios.eatgiveeffect;

import fr.levraigabin.trueplugin.TruePlugin;
import org.bukkit.event.HandlerList;
import org.bukkit.event.Listener;

public class EatGiveEffect {
    public static Listener listener = (Listener) new EatGiveEffectListener();

    public static void load() {
        TruePlugin.plugin.getServer().getPluginManager().registerEvents(listener, TruePlugin.plugin);
    }
    public static void unload() {
        HandlerList.unregisterAll(listener);
    }
}
