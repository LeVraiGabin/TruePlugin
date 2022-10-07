package fr.levraigabin.trueplugin.trueplugin;

import fr.levraigabin.trueplugin.trueplugin.commands.CommandTruePlugin;
import org.bukkit.entity.EntityType;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class TruePlugin extends JavaPlugin {

    public static List<String> enabled;

    @Override
    public void onEnable() {
        System.out.println("TruePlugin is enabled!");
        getCommand("trueplugin").setExecutor(new CommandTruePlugin());
        getServer().getPluginManager().registerEvents(new TruePluginEvents(), this);
    }

    @Override
    public void onDisable() {
        System.out.println("TruePlugin is disabled!");
    }

}
