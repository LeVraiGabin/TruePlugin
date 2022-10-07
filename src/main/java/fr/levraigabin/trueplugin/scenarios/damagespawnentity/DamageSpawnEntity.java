package fr.levraigabin.trueplugin.scenarios.damagespawnentity;

import fr.levraigabin.trueplugin.TruePlugin;
import org.bukkit.event.HandlerList;
import org.bukkit.event.Listener;

public class DamageSpawnEntity {
    public static Listener listener = new DamageSpawnEntityListener();

    public static void load() {
        TruePlugin.plugin.getServer().getPluginManager().registerEvents(listener, TruePlugin.plugin);
    }
    public static void unload() {
        HandlerList.unregisterAll(listener);
    }
}
