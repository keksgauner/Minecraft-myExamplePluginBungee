package myplugin.external;

import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.connection.ProxiedPlayer;

/**
 * @author KeksGauner
 */
public class Check {
    public static boolean isPlayer(CommandSender sender) {
        if(!(sender instanceof ProxiedPlayer)) {
            sender.sendMessage(TextComponentBuilder.create("This command is only for Player!"));
            return true;
        }
        return false;
    }

    public static boolean hasPermission(ProxiedPlayer player, String permission, String message) {
        if(!player.hasPermission(permission)) {
            player.sendMessage(TextComponentBuilder.create(message));
            return true;
        }
        return false;
    }
}
