package myplugin;

import myplugin.command.Command_KeksGauner;
import myplugin.external.InitializeManager;
import myplugin.listener.Event_Join;
import myplugin.utils.Data;
import net.md_5.bungee.api.plugin.Plugin;

/**
 * @author KeksGauner
 */
public final class Main extends Plugin {
    private static Main instance;
    private static Plugin plugin;

    public static Plugin getPlugin(){ return plugin; }
    public static Main getInstance(){ return instance; }

    @Override
    public void onEnable() {
        instance = this; plugin = this;
        Data.init();

        InitializeManager im = new InitializeManager();
        // Register a Commands
        im.registerCommand(this, new Command_KeksGauner("keksgauner"));

        // Register a Event
        im.registerEvent(this, new Event_Join());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
