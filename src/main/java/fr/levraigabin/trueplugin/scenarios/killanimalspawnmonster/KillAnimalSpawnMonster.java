package fr.levraigabin.trueplugin.scenarios.killanimalspawnmonster;

import fr.levraigabin.trueplugin.TruePlugin;
import org.bukkit.event.HandlerList;
import org.bukkit.event.Listener;

public class KillAnimalSpawnMonster {
    public static Listener listener = new KillAnimalSpawnMonsterListener();

    public static void load() {
        TruePlugin.plugin.getServer().getPluginManager().registerEvents(listener, TruePlugin.plugin);
    }
    public static void unload() {
        HandlerList.unregisterAll(listener);
    }
}
