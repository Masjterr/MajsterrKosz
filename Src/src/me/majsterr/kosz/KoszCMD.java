package me.majsterr.kosz;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;

public class KoszCMD implements CommandExecutor {
   Main plugin;

   public KoszCMD(Main var1) {
      this.plugin = var1;
      this.plugin.getCommand("kosz").setExecutor(this);
   }

   public boolean onCommand(CommandSender var1, Command var2, String var3, String[] var4) {
      Player var5 = (Player)var1;
      var5.openInventory(Bukkit.createInventory(var5, InventoryType.CHEST, "Kosz"));
      return false;
   }
}