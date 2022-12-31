package RecipeSearch;
import java.util.ArrayList;

public class Recipe {

    private String name;
    private int cookTime;
    private ArrayList<String> ingredients;

    public Recipe(String name, int cookTime, ArrayList<String> ingredients) {
        this.name = name;
        this.cookTime = cookTime;
        this.ingredients = ingredients;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getCookTime() {
        return this.cookTime;
    }
    
    public ArrayList<String> getIngredients() {
        return this.ingredients;
    }
    
    public String toString() {
        return this.name + this.cookTime + this.ingredients;
    }
    
    public boolean contains(String value) {
        if (this.name.contains(value)) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean timeContains(int value) {
        if (this.cookTime <= (value)) {
            return true;
        } else {
            return false;
        }
    }
    
}
