package fr.levraigabin.trueplugin;

import fr.levraigabin.trueplugin.commands.CommandTruePlugin;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public final class TruePlugin extends JavaPlugin {

    public static Plugin plugin;

    @Override
    public void onEnable() {
        plugin = this;
        System.out.println("TruePlugin is enabled!");
        getCommand("trueplugin").setExecutor(new CommandTruePlugin());
    }

    @Override
    public void onDisable() {
        System.out.println("TruePlugin is disabled!");
    }

}
