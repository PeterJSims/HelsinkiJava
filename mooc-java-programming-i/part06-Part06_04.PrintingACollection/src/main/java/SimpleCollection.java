
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    @Override
    public String toString() {
        String returnStr = "";
        if (elements.isEmpty()) {
            returnStr += "The collection " + this.name + " is empty.";
        } else if(elements.size() == 1) {
            returnStr += "The collection " + this.name + " has 1 element:\n";
            for(String e: elements){
                returnStr += e;
            }
        } else {
            returnStr += "The collection " + this.name + " has " + this.elements.size() + " elements:\n";
            for(String e: elements){
                returnStr += e + "\n";
            }
        }
        return returnStr;
    }

}
