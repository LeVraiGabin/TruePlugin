package fr.levraigabin.trueplugin.scenarios.placeblocksdisabled;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class PlaceBlocksDisabledListener implements Listener {

    @EventHandler
    public void onBlockPlaced(BlockPlaceEvent event) {
        event.setCancelled(true);
    }
}
