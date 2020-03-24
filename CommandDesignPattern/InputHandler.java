package csce247.assignments.command;

import java.util.HashMap;

public class InputHandler {
	private HashMap<String, Command>commands = new HashMap;
	public InputHandler(Document document){
		commands.put("load", LoadCommand);
		commands.put("save", SaveCommand);
		commands.put("spell", SpellCheckCommand);
		commands.put("print", PrintCommand);
		
	}

	public void inputEntered(String data){
		if(commands.containsKey(data)){
			commands.get(data);
	}

}
