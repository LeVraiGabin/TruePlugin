package fr.levraigabin.trueplugin.trueplugin.commands;

import fr.levraigabin.trueplugin.trueplugin.TruePlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import java.util.Arrays;

public class CommandTruePlugin implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length > 0) {
            if ((args[0].equalsIgnoreCase("enable") || args[0].equalsIgnoreCase("e")) && args.length == 2) {
                if (TruePlugin.enabled == null) {
                    TruePlugin.enabled = Arrays.asList(args[1]);
                } else {
                    TruePlugin.enabled.add(args[1]);
                }
            } else if ((args[0].equalsIgnoreCase("disable") || args[0].equalsIgnoreCase("d")) && args.length == 2) {
                TruePlugin.enabled.remove(args[1]);
            }
            return true;
        }
        return true;
    }
}
