package myplugin.listener;

import myplugin.Main;
import myplugin.external.TextComponentBuilder;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.event.PostLoginEvent;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.event.EventHandler;

import java.util.concurrent.TimeUnit;

/**
 * This is a example of a event
 *
 * @author KeksGauner
 */
public class Event_Join implements Listener {
    @EventHandler
    public void onEvent(PostLoginEvent event)
    {
        ProxiedPlayer p = event.getPlayer();


        // Example of a scheduke task
        ProxyServer.getInstance().getScheduler().schedule(Main.getInstance(), new Runnable() {
            @Override
            public void run() {
                // Example of a try and catch
                try {
                    // This text must be a BaseComponent! Thats why I use TextComponentBuilder.create
                    p.sendMessage(TextComponentBuilder.create(""));
                    p.sendMessage(TextComponentBuilder.create("Folge uns auf onlyfans mit /onlyfans"));
                    p.sendMessage(TextComponentBuilder.create(""));
                } catch (Exception e) {}
            }
        }, 1, TimeUnit.SECONDS);
    }
}