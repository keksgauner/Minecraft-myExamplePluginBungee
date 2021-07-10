package myplugin.utils;

import myplugin.Main;
import myplugin.external.ConfigAccessorBungee;

public class Data {
    private static ConfigAccessorBungee cfg_getConfig = new ConfigAccessorBungee(Main.getInstance(), "" + "config.yml");;
    public static ConfigAccessorBungee getConfig() {return cfg_getConfig;}

    public static void init() {
        Data.getConfig().saveDefaultConfig();
        Data.getConfig().getConfig().set("a","bc");
        Data.getConfig().saveConfig();
    }
}
