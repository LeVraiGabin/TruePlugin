package fr.levraigabin.trueplugin;

import fr.levraigabin.trueplugin.scenarios.damagespawnentity.DamageSpawnEntity;
import fr.levraigabin.trueplugin.scenarios.eatgiveeffect.EatGiveEffect;
import fr.levraigabin.trueplugin.scenarios.placeblocksdisabled.PlaceBlocksDisabled;
import fr.levraigabin.trueplugin.scenarios.suncausesdamage.SunCausesDamage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Scenarios {
    public static List<String> scenarios = Arrays.asList(
            "damage-spawn-entity",
            "place-blocks-disabled",
            "eat-give-effect",
            "sun-causes-damage"
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
            } else if (scenario.equalsIgnoreCase("place-blocks-disabled")) {
                PlaceBlocksDisabled.load();
            } else if (scenario.equalsIgnoreCase("eat-give-effect")) {
                EatGiveEffect.load();
            } else if (scenario.equalsIgnoreCase("sun-causes-damage")) {
                SunCausesDamage.load();
            }
        }
    }

    public static void disable(String scenario) {
        if (scenarios.contains(scenario) && enabled.contains(scenario)) {
            enabled.remove(scenario);
            if (scenario.equalsIgnoreCase("damage-spawn-entity")) {
                DamageSpawnEntity.unload();
            } else if (scenario.equalsIgnoreCase("place-blocks-disabled")) {
                PlaceBlocksDisabled.unload();
            } else if (scenario.equalsIgnoreCase("eat-give-effect")) {
                EatGiveEffect.unload();
            } else if (scenario.equalsIgnoreCase("sun-causes-damage")) {
                SunCausesDamage.unload();
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
                "§6damage-spawn-entity§r: §bSpawn a random entity when you take a damage.\n" +
                "§6place-blocks-disabled§r: §bDisable block placement.\n" +
                "§6eat-give-effect§r: §bEating gives you a random effect.";
        return text;
    }
}
