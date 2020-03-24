

public class Document{
    private String name;
    public Document(String name){
        System.out.println("Document named " + name + " is created");
    }

    public void load(){
        System.out.println("document " + this.name + " is loaded into view");
    }

    public void spell(){
        System.out.println("document " + this.name + " is being checked for spelling errors");
    }

    public void save(){
        System.out.println("document " + this.name + " is being saved...");
    }

    public void print(){
        System.out.println("document " + this.name + " is printing..");
    }
}
