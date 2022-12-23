package CargoHold;
import java.util.ArrayList;
public class Suitcase {
    private ArrayList<Item> stuff;
    private int maxWeight;
    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.stuff = new ArrayList<>();
    }
    
    public void addItem(Item item) {
        int totals = totalWeight() + item.getWeight();        
        if (totals <= maxWeight) {
            stuff.add(item);
        }
    }
    
    public String toString() {
        if(this.stuff.size() == 1) {
            return this.stuff.size() + " item (" + totalWeight() + " kg)";
        }else if (this.stuff.size() == 0) {
            return "no items (0 kg)";
        } else {
            return this.stuff.size() + " items (" + totalWeight() + " kg)";
        }
    }
    
    public void printItems() {
        for (Item item: this.stuff) {
            System.out.println(item);
        }
    }
    
    public int totalWeight() {
        int weights = 0;
        for (Item item: this.stuff) {
            weights += item.getWeight();
        }
        return weights;
    }
    
    public Item heaviestItem() {
        if (this.stuff.isEmpty()) {
            return null;
        }
        Item heaviest = new Item("notme", -1);
        for (Item item: this.stuff) {
            if (item.getWeight() >= heaviest.getWeight()) {
                heaviest = item;
            }
        }
        return heaviest;
    }
    
}
