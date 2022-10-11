package fr.levraigabin.trueplugin.scenarios.suncausesdamage;

import fr.levraigabin.trueplugin.TruePlugin;
import org.bukkit.Bukkit;
import org.bukkit.event.HandlerList;
import org.bukkit.event.Listener;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scheduler.BukkitTask;

public class SunCausesDamage {
    public static Listener listener = new SunCausesDamageListener();
    public static BukkitTask task;

    public static void load() {
        task = new SunCauseDamageRunnable().runTaskTimer(TruePlugin.plugin, 1,40);
    }
    public static void unload() {
        Bukkit.getScheduler().cancelTask(task.getTaskId());
    }
}
