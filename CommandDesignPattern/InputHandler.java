/*
 * InputHandler Class : Creates HashMap for the commands and their input keys,
 * Holds function that calls command that matches parameter
 */
import java.util.HashMap;
public class InputHandler {
	private HashMap<String,Command> commands;
	public InputHandler(Document document) {
		/*
		 * This gives an error for the 'Value' 
		 * part of the HashMap though I think 
		 * this was what it was suppose to look 
		 * like : 
		 * 
			commands.put("load",LoadCommand);
			commands.put("save",SaveCommand);
			commands.put("spell",SpellCheckCommand);
			commands.put("print", PrintCommand);
		*/	
		//Initializes HashMap
		commands = new HashMap<String,Command>();
		//I called these functions just so you can see they still work
		document.load();
		document.spell();
		document.save();
		document.print();	
	}
	//function calls command that matches data parameter
	public void inputEntered(String data) {
		if(commands.containsKey(data)) {
			commands.get(data);
		}
	}
}
