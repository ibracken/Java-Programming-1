package menu;

import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }
    
    public void addMeal(String meal) {
        boolean aTrue = true;
        for (String aMeal: this.meals) {
            if (meal == aMeal) {
                aTrue = false;
            }
        }
        if (aTrue) {
            this.meals.add(meal);
        }
    }
    
    public void printMeals() {
        for (int i = 0; i < this.meals.size(); i++) {
            System.out.println(this.meals.get(i));        
        }
    }
    
    public void clearMenu() {
        this.meals = new ArrayList<>();
    }
    

    // implement the required methods here
}