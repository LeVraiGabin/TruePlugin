package fr.levraigabin.trueplugin.scenarios.suncausesdamage;

import org.bukkit.Bukkit;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

public class SunCauseDamageRunnable extends BukkitRunnable {
    @Override
    public void run() {
        for (Player player : Bukkit.getOnlinePlayers()) {
            Block block = player.getLocation().getBlock().getRelative(0, 1, 0);
            int lightLevel = block.getLightFromSky();
            if (lightLevel > 5) {
                player.damage(1.0);
            }
        }
    }
}
