package fr.levraigabin.trueplugin.scenarios.timeincreasespeed;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitRunnable;

public class TimeIncreaseSpeedRunnable extends BukkitRunnable {
    private int currentLevel = 0;

    @Override
    public void run() {
        currentLevel++;
        for (Player player : Bukkit.getOnlinePlayers()) {
            if(player.getGameMode() == GameMode.SURVIVAL) {
                applySpeed(player);
            }
        }
    }
    public void applySpeed(Player player) {
        player.removePotionEffect(PotionEffectType.SPEED);
        player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 20 * 100, this.currentLevel, true, false));
    }
}
