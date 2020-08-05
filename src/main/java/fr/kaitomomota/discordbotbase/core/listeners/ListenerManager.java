package fr.kaitomomota.discordbotbase.core.listeners;

import java.util.ArrayList;
import java.util.List;

import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class ListenerManager {
	
	List<ListenerAdapter> listeners = new ArrayList<>();
	
	public void registerListeners() {
		// Listeners goes here:
		
	}
	
	public List<ListenerAdapter> getListeners() {
		return listeners;
	}

}
