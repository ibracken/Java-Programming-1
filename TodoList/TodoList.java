package TodoList;
import java.util.ArrayList;
public class TodoList {
    private ArrayList<String> theList;
    public TodoList() {
        theList = new ArrayList <>();
    }
    public void add(String task) {
        theList.add(task);
    }
    public void print() {
        for(int i = 0; i < theList.size(); i++) {
            int j = i + 1;
            System.out.println(j + ": " + theList.get(i));
        }
    }
    
    public void remove(int number) {
        theList.remove(theList.get(number - 1));
    }
}
