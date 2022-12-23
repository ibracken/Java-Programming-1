package CargoHold;
import java.util.ArrayList;
public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;
    private int weight;
    
    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.weight = 0;
        this.suitcases = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitcase) {
        this.weight = 0;
        for (Suitcase aSuitcase: suitcases) {
            this.weight += aSuitcase.totalWeight();
        }   
        if (this.weight + suitcase.totalWeight() <= maxWeight) {
            suitcases.add(suitcase);
        }
    }
    
    public String toString() {
        this.weight = 0;
        for (Suitcase aSuitcase: suitcases) {
            this.weight += aSuitcase.totalWeight();
        }
        return this.suitcases.size() +" suitcases (" + this.weight + " kg)";
    }
    
    public void printItems() {
        for (Suitcase sc: suitcases) {
            sc.printItems();
        }
    }
}
