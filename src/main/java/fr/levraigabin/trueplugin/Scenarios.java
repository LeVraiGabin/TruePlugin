package fr.levraigabin.trueplugin;

import fr.levraigabin.trueplugin.scenarios.damagespawnmob.DamageSpawnEntity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Scenarios {
    public static List<String> scenarios = Arrays.asList(
            "damage-spawn-entity"
    );
    public static List<String> enabled = new ArrayList<>();

    public static boolean exists(String scenario) {
        if (scenarios.contains(scenario)) return true;
        return false;
    };

    public static void enable(String scenario) {
        if (scenarios.contains(scenario) && !enabled.contains(scenario)) {
            enabled.add(scenario);
            if (scenario.equalsIgnoreCase("damage-spawn-entity")) {
                DamageSpawnEntity.load();
            }
        }
    }

    public static void disable(String scenario) {
        if (scenarios.contains(scenario) && enabled.contains(scenario)) {
            enabled.remove(scenario);
            if (scenario.equalsIgnoreCase("damage-spawn-entity")) {
                DamageSpawnEntity.unload();
            }
        }
    }

    public static String help(){
        String text = "§eTruePlugin  Help\n" +
                "§m          \n" +
                "§eCommands:\n" +
                "§6/trp <enable/disable/list> <scenario>§r: §bManage scenarios.\n" +
                "§m          \n" +
                "§eScenarios:\n" +
                "§6damage-spawn-entity§r: §bSpawn a random entity when you take a damage";
        return text;
    }
}
