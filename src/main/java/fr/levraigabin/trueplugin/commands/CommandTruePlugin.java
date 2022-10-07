package fr.levraigabin.trueplugin.commands;

import fr.levraigabin.trueplugin.Scenarios;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CommandTruePlugin implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length > 0) {
            if ((args[0].equalsIgnoreCase("enable") || args[0].equalsIgnoreCase("e")) && args.length == 2) {
                if (!Scenarios.exists(args[1])) {
                    sender.sendMessage("§cThis scenario does not exist.");
                    return false;
                }
                Scenarios.enable(args[1]);
                sender.sendMessage("§6Scenario §a" + args[1] + " §6is enabled!");
                return true;
            } else if ((args[0].equalsIgnoreCase("disable") || args[0].equalsIgnoreCase("d")) && args.length == 2) {
                if (!Scenarios.exists(args[1])) {
                    sender.sendMessage("§cThis scenario does not exist.");
                    return false;
                }
                Scenarios.disable(args[1]);
                sender.sendMessage("§6Scenario §a" + args[1] + " §6is disabled!");
                return true;
            } else if ((args[0].equalsIgnoreCase("list") || args[0].equalsIgnoreCase("l")) && Scenarios.enabled != null) {
                String enabledScenariosList = "";
                for (String enabledScenario : Scenarios.enabled) {
                    if (!enabledScenariosList.equals("")) enabledScenariosList = enabledScenariosList + "§r, ";
                    enabledScenariosList = enabledScenariosList + "§a" + enabledScenario;
                }
                String message = "§eTruePlugin  List\n" +
                        "§m          \n" +
                        "§eEnabled Scenarios:\n" +
                        enabledScenariosList;
                sender.sendMessage(message);
                return true;
            }
        }
        sender.sendMessage(Scenarios.help());
        return false;
    }
}
