package com.github.roadhog.qwerty.bugplugin;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class BugPlugin extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        PluginManager m =getServer().getPluginManager();
        m.registerEvents(this,this);
    }


    @EventHandler
    public void onKill(PlayerDeathEvent e) {
        Player p =e.getEntity();
        if(p.isDead()){
            p.setHealth(0);
        }
    }
}
