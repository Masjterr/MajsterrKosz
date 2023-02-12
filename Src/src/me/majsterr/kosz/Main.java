package me.majsterr.kosz;

import org.bukkit.plugin.java.JavaPlugin;

import me.majsterr.kosz.Main;
import me.majsterr.kosz.KoszCMD;


public class Main extends JavaPlugin {
	
	public static Main main;
	
	public void onEnable() {
		System.out.println("[MajsterrKOSZ] plugin zostal uruchomiony");
		
		main = this;
		new KoszCMD(this);
	}
	
	public static Main getMain() {
		return main;
	}
	
	public void onDisable() {
		System.out.println("[MajsterrKosz] plugin zostal wylaczony");
	}

}
