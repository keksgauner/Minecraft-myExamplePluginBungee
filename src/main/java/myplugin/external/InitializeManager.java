package myplugin.external;

import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.plugin.Command;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.api.plugin.Plugin;

/**
 * @author KeksGauner
 */
public class InitializeManager {
    public static void registerCommand(Plugin plugin, Command register) {
        try {
            ProxyServer.getInstance().getPluginManager().registerCommand(plugin, register);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    public static void registerEvent(Plugin plugin, Listener register) {
        try {
            ProxyServer.getInstance().getPluginManager().registerListener(plugin, register);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
