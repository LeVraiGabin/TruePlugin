package fr.levraigabin.trueplugin.scenarios.darknesscausesdamage;

import fr.levraigabin.trueplugin.TruePlugin;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.scheduler.BukkitTask;

public class DarknessCausesDamage {
    public static Listener listener = new DarknessCausesDamageListener();
    public static BukkitTask task;

    public static void load() {
        task = new DarknessCausesDamageRunnable().runTaskTimer(TruePlugin.plugin, 1,40);
    }
    public static void unload() {
        Bukkit.getScheduler().cancelTask(task.getTaskId());
    }
}
