package fr.levraigabin.trueplugin.scenarios.suncausesdamage;

import fr.levraigabin.trueplugin.TruePlugin;
import org.bukkit.Bukkit;
import org.bukkit.scheduler.BukkitTask;

public class SunCausesDamage {
    public static BukkitTask task;

    public static void load() {
        task = new SunCausesDamageRunnable().runTaskTimer(TruePlugin.plugin, 1,40);
    }
    public static void unload() {
        Bukkit.getScheduler().cancelTask(task.getTaskId());
    }
}
