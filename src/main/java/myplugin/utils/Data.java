package myplugin.utils;

import myplugin.Main;
import myplugin.external.ConfigAccessorBungee;

public class Data {
    public static ConfigAccessorBungee getConfig() {return new ConfigAccessorBungee(Main.getInstance(), "" + "config.yml");}

    public static void init() {
        Data.getConfig().saveDefaultConfig();
        Data.getConfig().saveConfig();
    }
}
