package SimpleDictionary;
import java.util.Scanner;
import java.util.ArrayList;

public class TextUI {
    private Scanner scanner;
    
    private SimpleDictionary dict;
    
    public TextUI(Scanner scanner, SimpleDictionary dict) {
        this.scanner = scanner;
        this.dict = dict;
    }
    
    public void start() {
        ArrayList<String> Words = new ArrayList<>();
        while (true) {
            // Initiates the command
            System.out.println("Command: ");
            String command = scanner.nextLine();
        // Ends the command
            if (command.equals("end")) {
                break;
        //Adds to the dictionary
            } 
            if (command.equals("add")) {
                System.out.println("Word:");
                String word = scanner.nextLine();
                System.out.println("Translation:");
                String translation = scanner.nextLine();
                this.dict.add(word, translation);
                Words.add(word);
                Words.add(translation);
        // Searches up a value in the dictionary
            } 
            else if (command.equals("search")) {
                System.out.println("To be translated: ");
                String translator = scanner.nextLine();
                if (Words.contains(translator)) {
                     String translated = this.dict.translate(translator);
                     System.out.println("Translation: " + translated);
                } else {
                    System.out.println("Word "+ translator + " was not found");
                }

            }
             else {
                 System.out.println("Unknown comand");
            }
            }
            System.out.println("Bye bye!");
    }
        
}
