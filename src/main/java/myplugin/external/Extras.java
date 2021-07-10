package myplugin.external;

import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.connection.ProxiedPlayer;

/**
 * @author KeksGauner
 */
public class Extras {

    //Example of randomize the Lobby
    public static void teleportLobby(ProxiedPlayer p){
        if(p.getServer().getInfo().getName().startsWith("Lobby")){
            p.sendMessage(TextComponentBuilder.create("§cDu befindest dich bereits auf den Server."));
        }else{
            int anzahl = Integer.valueOf(1);
            int i = (int) (Math.random() * anzahl + 1);
            if (anzahl >= 1) {
                p.connect(ProxyServer.getInstance().getServerInfo("Lobby" + i));
            } else {
                p.connect(ProxyServer.getInstance().getServerInfo("Lobby" + i));
            }
        }
    }

    // Example of sending a Player
    public static void teleportPlayerServer(ProxiedPlayer p, String server){
        if(p.getServer().getInfo().getName().startsWith(server)){
            p.sendMessage(TextComponentBuilder.create("§cDu befindest dich bereits auf dem " + server +" Server!"));
        } else {
            p.connect(ProxyServer.getInstance().getServerInfo(server));
        }
    }
}
