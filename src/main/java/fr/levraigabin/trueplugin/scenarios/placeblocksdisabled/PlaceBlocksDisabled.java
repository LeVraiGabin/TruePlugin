package fr.levraigabin.trueplugin.scenarios.placeblocksdisabled;

import fr.levraigabin.trueplugin.TruePlugin;
import org.bukkit.event.HandlerList;
import org.bukkit.event.Listener;

public class PlaceBlocksDisabled {
    public static Listener listener = new PlaceBlocksDisabledListener();

    public static void load() {
        TruePlugin.plugin.getServer().getPluginManager().registerEvents(listener, TruePlugin.plugin);
    }
    public static void unload() {
        HandlerList.unregisterAll(listener);
    }
}
