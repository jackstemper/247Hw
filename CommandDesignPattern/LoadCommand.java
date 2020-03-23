public class LoadCommand implements Command{

    private Document doc;

    public LoadCommand(Document doc){
        this.doc = doc;

    }

    @Override
    public void execute(){
        doc.load();
    }
}
