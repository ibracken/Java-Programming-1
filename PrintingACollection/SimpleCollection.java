package PrintingACollection;

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
    
    public String toString() {
        ArrayList<String> stringz = new ArrayList<>(this.elements);
        String intro = "";
        if(stringz.isEmpty()) {
            intro = "The collection " + this.name + " is empty.";
            return intro;
        } else if (stringz.size() == 1){
            intro = "The collection " + this.name + " has " + stringz.size() + " element:";
        } else {
            intro = "The collection " + this.name + " has " + stringz.size() + " elements:";
        }
        String returnvalue = "";
        for (String element: elements) {
            returnvalue = returnvalue + "\n" + element;
        }
        return intro 
                + returnvalue;
    }
    
}
