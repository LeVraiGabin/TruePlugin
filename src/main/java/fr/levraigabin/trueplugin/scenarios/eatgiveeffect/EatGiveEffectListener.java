package fr.levraigabin.trueplugin.scenarios.eatgiveeffect;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.concurrent.ThreadLocalRandom;

public class EatGiveEffectListener implements Listener {

    @EventHandler
    public static void onItemConsume(PlayerItemConsumeEvent event) {
        Player player = event.getPlayer();
        int random = ThreadLocalRandom.current().nextInt(PotionEffectType.values().length);
        PotionEffect effect = new PotionEffect(PotionEffectType.values()[random], 6000, 1);
        player.addPotionEffect(effect);
    }
}
