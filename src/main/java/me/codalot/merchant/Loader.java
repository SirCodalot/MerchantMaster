package me.codalot.merchant;

import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;

public class Loader extends JavaPlugin {

    @Getter private static Loader instance;

    @Override
    public void onEnable() {
        instance = this;
    }

}
