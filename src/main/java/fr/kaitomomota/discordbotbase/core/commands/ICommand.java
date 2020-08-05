package fr.kaitomomota.discordbotbase.core.commands;

import fr.kaitomomota.discordbotbase.core.commands.categories.Category;
import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.entities.MessageChannel;
import net.dv8tion.jda.core.entities.User;

public interface ICommand {
	
    public String[] getNames();
	
	public void execute(MessageChannel channel, String[] args, User user, Message message);
	
	public Category getCategory();
	
	public String getUsage();
	
}
