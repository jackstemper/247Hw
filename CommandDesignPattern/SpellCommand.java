/*
 * SpellCommand Class : implements Command interface and calls function 
 * necessary to execute SpellCommand
 */
public class SpellCommand implements Command {
    private Document doc;
    public SpellCommand(Document doc) {
        this.doc = doc;
    }
    //Override to execute spell
    @Override
    public void execute() {
        doc.spell();
    }
}

