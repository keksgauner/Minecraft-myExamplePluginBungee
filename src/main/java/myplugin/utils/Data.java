package myplugin.utils;

import myplugin.Main;
import myplugin.external.ConfigAccessorBungee;

/**
 * @author KeksGauner
 */
public class Data {
    private static ConfigAccessorBungee cfg_getConfig = new ConfigAccessorBungee(Main.getInstance(), "" + "config.yml");;
    public static ConfigAccessorBungee getConfig() {return cfg_getConfig;}

    public static void init() {
        // Copy files (if needed)
        Data.getConfig().saveDefaultConfig();
        Data.getConfig().saveConfig();
    }
}
