package fr.levraigabin.trueplugin.scenarios.killanimalspawnmonster;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Animals;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class KillAnimalSpawnMonsterListener implements Listener {

    @EventHandler
    public void onEntityDeath(EntityDeathEvent event) {
        Entity entity = event.getEntity();
        if (entity instanceof Animals && ((Animals) entity).getKiller() instanceof Player) {
            World world = entity.getWorld();
            Location location = entity.getLocation();
            spawnRandomMonster(world, location);
        }
    }

    public void spawnRandomMonster(World world, Location location) {
        List<EntityType> monsters = Arrays.asList(EntityType.ZOMBIE, EntityType.SKELETON, EntityType.CREEPER);
        Random random = new Random();
        EntityType monster = monsters.get(random.nextInt(monsters.size()));
        world.spawnEntity(location, monster);
    }
}
