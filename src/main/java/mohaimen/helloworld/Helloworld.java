package mohaimen.helloworld;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public final class Helloworld extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("HelloWorldが動き始めました");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("HelloWorldが終了しました");
    }
    @Override
    public boolean  onCommand(CommandSender sender, Command command, String label, String[] args){
        if (command.getName().equalsIgnoreCase("hello")) {
            sender.sendMessage("こんにちは世界");
            return true;
        }return true;
    }
}
