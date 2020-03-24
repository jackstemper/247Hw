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
