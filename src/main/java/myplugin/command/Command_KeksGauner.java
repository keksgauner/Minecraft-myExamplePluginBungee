package myplugin.command;

import myplugin.external.Check;
import myplugin.external.TextComponentBuilder;
import myplugin.utils.Data;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

public class Command_KeksGauner extends Command {

    public Command_KeksGauner(String name) {
        super(name);
        //this.setDescription("Is a KeksGauner Command");
        //this.setPermission("keksgauner.use");
        //this.setUsage("/keksgauner")
        //this.setAliases(Arrays.asList("keksi", "mykeks","superkeks"));
    }

    @Override
    public void execute(CommandSender sender, String[] args) {
        // Check if commandsender a Player
        if(Check.isPlayer(sender)) return;
        ProxiedPlayer p = (ProxiedPlayer) sender;
        // Check player permission
        if(Check.hasPermission(p, "keksgauner.use", "§4Du bist nicht cool genug")) return;
        p.sendMessage(TextComponentBuilder.create(Data.getConfig().getConfig().getString("example.keksgauner_example")));
        // Example of TextCpmponent
        p.sendMessage(TextComponentBuilder.create(">> ", new TextComponentBuilder("Bin ich COOL?").addHover(" >> Coolnismode").addClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "Nein bist du nicht!").build(), " <<"));
        return;
    }
}
