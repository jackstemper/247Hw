/*
 * PrintCommand Class : implements Command interface and calls function 
 * necessary to execute PrintCommand
 */
public class PrintCommand implements Command{
    private Document doc;
    public PrintCommand(Document doc) {
        this.doc = doc;
    }
    @Override
    public void execute() {
        doc.print();
    }
}
