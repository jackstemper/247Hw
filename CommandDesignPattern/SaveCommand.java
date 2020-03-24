/*
 * SaveCommand Class : implements Command interface and calls function 
 * necessary to execute SaveCommand
 */
public class SaveCommand implements Command {
    private Document doc;  
    public SaveCommand(Document doc) {
        this.doc = doc;
    } 
    @Override
    public void execute() {
        doc.save();
    }
}
