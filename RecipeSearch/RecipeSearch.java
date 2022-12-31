package RecipeSearch;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        
        ArrayList<String> recipes = new ArrayList<>(); // ALL recipes in recipe.txt
        ArrayList<Recipe> recipesFormatted = new ArrayList<>(); // recipes splitted & grouped in objects
        Integer cookTime = 0;
        ArrayList<String> ingredients = new ArrayList<>();
        String name = "";
        Scanner scan = new Scanner(System.in);
        
        // Moving file to ArrayList
        System.out.println("File to read:");
        String file = scan.nextLine();
        try (Scanner scanner = new Scanner(Paths.get(file))) {
            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();
                recipes.add(row);
            }
        }
        catch (Exception e) {
            System.out.println("An error occured..");
        }
        
        //Sorting the file into recipes 
        boolean isName = true;
        boolean isCookTime = false;
        for (String row: recipes) {
            if (isName) {
                name = row;
                isName = false;
                isCookTime = true;
            }
            
            else if (isCookTime) {
                cookTime = Integer.valueOf(row);
                isCookTime = false;
            } 
            
            else if (row.isEmpty()) {
                Recipe aRecipe = new Recipe(name, cookTime, ingredients);
                recipesFormatted.add(aRecipe);
                isName = true;
                isCookTime = false; 
                ingredients = new ArrayList<>();
            }
            
            else {
                ingredients.add(row);
            }
        }
        Recipe aRecipe = new Recipe(name, cookTime, ingredients);
        recipesFormatted.add(aRecipe);
        System.out.println(recipesFormatted);

        
        
        //Initial text
        System.out.println("");
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        System.out.println("");
        
        
        while (true) {
            System.out.println("Enter command: ");
        
            String command = scan.nextLine();

            //List command
            if (command.equals("list")) {
                int recipeNums = 0;
                for (Recipe r: recipesFormatted) {
                    recipeNums++;
                }
                System.out.println("Recipes: ");
                for (int i = 0; i < recipeNums; i++) {
                    String theName = recipesFormatted.get(i).getName();
                    int theCookTime = recipesFormatted.get(i).getCookTime();
                    String listItem = theName +", cooking time: " + theCookTime;
                    System.out.println(listItem);
                }
                System.out.println("");
            }

            //Stop command
            if (command.equals("stop")) {
                break;
            }
            
            if (command.equals("find name")) {
                System.out.println("Searched word: ");
                String searchedName = scan.nextLine();
                System.out.println("Recipes: ");
                for (Recipe r: recipesFormatted) {
                    if (r.contains(searchedName)) {
                        String theName = r.getName();
                        int theCookTime = r.getCookTime();
                        String listItem = theName +", cooking time: " + theCookTime;
                        System.out.println(listItem);
                    }
                    System.out.println("");
                }
            }
            if (command.equals("find cooking time")) {
                System.out.println("Max cooking time: ");
                int cookDuration = Integer.valueOf(scan.nextLine());
                System.out.println("Recipes: ");
                for (Recipe r: recipesFormatted) {
                    if (r.timeContains(cookDuration)) {
                        String theName = r.getName();
                        int theCookTime = r.getCookTime();
                        String listItem = theName +", cooking time: " + theCookTime;
                        System.out.println(listItem);
                    }
                }
            }
            if (command.equals("find ingredient")) {
                System.out.println("Ingredient: ");
                String ingredientName = scan.nextLine();
                System.out.println("Recipes: ");
                for (Recipe r: recipesFormatted) {
                    ArrayList<String> allIngredients = new ArrayList<>(r.getIngredients());
                    for (String ingredient: allIngredients) {
                        if (ingredient.equals(ingredientName)) {
                            String theName = r.getName();
                            int theCookTime = r.getCookTime();
                            String listItem = theName +", cooking time: " + theCookTime;
                            System.out.println(listItem);
                        }
                    }
                }
                
            }
        }
    }   
}