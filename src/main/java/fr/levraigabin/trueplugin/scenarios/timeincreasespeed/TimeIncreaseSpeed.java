package fr.levraigabin.trueplugin.scenarios.timeincreasespeed;

import fr.levraigabin.trueplugin.TruePlugin;
import org.bukkit.Bukkit;
import org.bukkit.scheduler.BukkitTask;

public class TimeIncreaseSpeed {
    public static BukkitTask task;

    public static void load() {
        task = new TimeIncreaseSpeedRunnable().runTaskTimer(TruePlugin.plugin, 1,20 * 60);
    }
    public static void unload() {
        Bukkit.getScheduler().cancelTask(task.getTaskId());
    }
}
