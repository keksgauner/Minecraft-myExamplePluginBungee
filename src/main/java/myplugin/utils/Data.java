package myplugin.utils;

import myplugin.Main;
import myplugin.external.ConfigAccessor;

public class Data {
    public static ConfigAccessor getConfig() {return new ConfigAccessor(Main.getInstance(), "" + "config.yml");}

    public static void init() {
        Data.getConfig().saveDefaultConfig();
        Data.getConfig().saveConfig();
    }
}
