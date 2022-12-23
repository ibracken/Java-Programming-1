package Stack;
import java.util.ArrayList;

public class Stack {
    private ArrayList <String> stringz;
    
    public Stack() {
        this.stringz = new ArrayList<>();
    }
    
    public boolean isEmpty() {
        if(this.stringz.size() == 0 ) {
            return true;
        } else {
            return false;
        }
    }
    
    public void add(String value) {
       this.stringz.add(value);
    }
    
    public ArrayList<String> values() {
        return this.stringz;
    }
    
    public String take() {
        int i = this.stringz.size();
        String taken = this.stringz.get(i -1);
        this.stringz.remove(i - 1);
        return taken;
    }
}
