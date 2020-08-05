package fr.kaitomomota.discordbotbase.api.boot;

import fr.kaitomomota.discordbotbase.DiscordSelfbot;

public class DiscordSelfbotBootstrap {

	public static void main(String[] args) {
		new DiscordSelfbotBootstrap().boot();
	}
	
	private void boot() {
		new DiscordSelfbot().launchBot();
	}
	
}
