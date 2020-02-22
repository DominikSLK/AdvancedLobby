package de.cyne.advancedlobby.listener;

import de.cyne.advancedlobby.AdvancedLobby;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemHeldEvent;

public class PlayerItemHeldListener implements Listener {

    @EventHandler
    public void onPlayerItemHeld(PlayerItemHeldEvent e) {
        Player p = e.getPlayer();
        if (AdvancedLobby.bungeecord | p.getWorld() == AdvancedLobby.lobbyWorld) {
            if (!AdvancedLobby.build.contains(p)) {
                AdvancedLobby.playSound(p, p.getLocation(), "hotbar_switch");
            }
        }
    }

}
