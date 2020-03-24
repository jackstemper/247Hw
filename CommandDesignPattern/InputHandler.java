
import java.util.HashMap;
public class InputHandler {
	private HashMap<String,Command> commands;
	public InputHandler(Document document) {
		/*
		 * commands.put("load",LoadCommand);
		commands.put("save",SaveCommand);
		commands.put("spell",SpellCheckCommand);
		commands.put("print", PrintCommand);
		*/
		commands = new HashMap<String,Command>();
		document.load();
		document.spell();
		document.save();
		document.print();
	}
	public void inputEntered(String data) {
		if(commands.containsKey(data)) {
			commands.get(data);
		}
	}
}

