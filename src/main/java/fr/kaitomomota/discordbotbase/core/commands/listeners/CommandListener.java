package fr.kaitomomota.discordbotbase.core.commands.listeners;

import fr.kaitomomota.discordbotbase.DiscordSelfbot;
import fr.kaitomomota.discordbotbase.core.commands.finder.CommandFinder;
import fr.kaitomomota.discordbotbase.core.consts.Consts;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class CommandListener extends ListenerAdapter {
	
	@Override
	public void onMessageReceived(MessageReceivedEvent event) {
		if (event.getMessage().getContentStripped().startsWith(Consts.instance.prefix) && event.getAuthor().equals(DiscordSelfbot.getInstance().getJDA().getSelfUser())) {
			CommandFinder.instance.findCommandAndExecute(event.getChannel(), event.getMessage(), event.getAuthor());
		}
	}
	

}
