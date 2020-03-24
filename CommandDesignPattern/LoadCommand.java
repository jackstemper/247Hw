/*
 * LoadCommand Class : implements Command interface and calls function 
 * necessary to execute LoadCommand
 */
public class LoadCommand implements Command {
    private Document doc;
    public LoadCommand(Document doc) {
        this.doc = doc;
    }
    //Override to execute load
    @Override
    public void execute() {
        doc.load();
    }
}
