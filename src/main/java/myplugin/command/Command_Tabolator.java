package myplugin.command;

import myplugin.external.Check;
import myplugin.external.TextComponentBuilder;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;
import net.md_5.bungee.api.plugin.TabExecutor;

import java.util.ArrayList;
import java.util.List;

/**
 * This is a example of a command with tabolator
 *
 * @author KeksGauner
 */
public class Command_Tabolator extends Command implements TabExecutor {


    public Command_Tabolator(String name) {
        super(name);
        //super(name,"keksgauner.use","keksi", "mykeks","superkeks");
    }

    @Override
    public void execute(CommandSender sender, String[] args) {
        // Check if commandsender a Player
        if(Check.isPlayer(sender)) return;
        ProxiedPlayer p = (ProxiedPlayer) sender;
        // Check player permission
        if(Check.hasPermission(p, "keksgauner.use.tabolator", "§4Du bist nicht cool genug")) return;

        if(args.length > 3) { // i use this because i cannot use < in switch
            ProxiedPlayer targetPlayer = ProxyServer.getInstance().getPlayer(args[1]);

            if(targetPlayer == null)
                p.sendMessage(TextComponentBuilder.create("Player not Found"));
            else {
                // Example of get multible messages
                String msg = ""; int startBy = 2;
                for (int argCurrent = startBy; argCurrent < args.length; argCurrent++) {
                    msg = msg + args[argCurrent] + " ";
                }
                p.sendMessage(TextComponentBuilder.create("Sended to " + targetPlayer.getName() + ": " + msg));
                targetPlayer.sendMessage(TextComponentBuilder.create(msg));
            }
            return; // if return they stop
        }

        switch (args.length) {
            default:
                p.sendMessage(TextComponentBuilder.create("/tabolator <send> <player> <message>"));
                break;
            case 2: // If the args equal a length of 2
            //case 3: // This is how to add something
                p.sendMessage(TextComponentBuilder.create("Why you dont use: /tabolator <send> <player> <message>"));
                break;
        }
        return;
    }

    public List<String> onTabComplete(CommandSender sender, String[] args) {
        if (args.length == 1){ // first args
            List<String> arguments = new ArrayList<>();
            arguments.add("send");
            return arguments; // give a list back
        }
        if (args.length == 3){ // third args
            List<String> arguments = new ArrayList<>();
            ProxiedPlayer p = (ProxiedPlayer) sender;
            arguments.add("I am on server:" + p.getServer().getInfo().getName());
            return arguments; // give a list back
        }

        // A other default return
        List<String> playerNames = new ArrayList<>();
        for (ProxiedPlayer all : ProxyServer.getInstance().getPlayers()){
            playerNames.add(all.getName());
        }
        return playerNames;

        //return null; // default return
    }
}
