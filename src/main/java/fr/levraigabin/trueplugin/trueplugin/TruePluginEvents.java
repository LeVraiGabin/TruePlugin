package fr.levraigabin.trueplugin.trueplugin;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

import java.util.Random;

public class TruePluginEvents implements Listener {

    @EventHandler
    public void onEntityDamaged(EntityDamageEvent event) {
        if (TruePlugin.enabled != null && TruePlugin.enabled.contains("damage-spawn-mob")) {
            if (event.getEntity() instanceof Player) {
                Player player = (Player) event.getEntity();
                World world = player.getWorld();
                Location location = player.getLocation();
                spawnRandomMob(world, location);
            }
        }
    }

    public void spawnRandomMob(World world, Location location) {
        EntityType[] mobs = EntityType.values();
        EntityType mob = mobs[(int) (Math.random() * (mobs.length))];
        world.spawnEntity(location, mob);
    }
}
