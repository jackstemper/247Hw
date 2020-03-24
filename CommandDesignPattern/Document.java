/*
 * Document class: initializes document name, displays different 
 * messages when you call each method 
 */
public class Document {
	private String name;
	//Document Constructor : initializes name lets user know document is created
    public Document(String name) {
    	this.name=name;
        System.out.println("Document named " + name + " is created");
    }
    /*
     * Each method displays message based on command called
     */
    public void load() {
        System.out.println("document " + name + " is loaded into view");
    }
    public void spell() {
        System.out.println("document " + name + " is being checked for spelling errors");
    }
    public void save() {
        System.out.println("document " + name + " is being saved...");
    }
    public void print() {
        System.out.println("document " + name + " is printing..");
    }
}

