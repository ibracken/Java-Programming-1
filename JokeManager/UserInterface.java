package JokeManager;

import java.util.Scanner;

public class UserInterface {
    private JokeManager jokez;
    private Scanner scanner;
    public UserInterface(JokeManager jokez, Scanner scanner) {
        this.jokez = jokez;
        this.scanner = scanner;
    }
    
    public void start() {
        while (true)  {
            System.out.println("Commands:");
            System.out.println("1 - add a joke");
            System.out.println("2 - draw a joke");
            System.out.println("3 - list jokes");
            System.out.println("X - stop");
            String command = scanner.nextLine();
            if (command.equals("X")) {
                break;
            }
            if (command.equals("1")) {
                System.out.println("Write the joke to be added:");
                String joke = scanner.nextLine();
                jokez.addJoke(joke);
            } else if (command.equals("2")) {
                System.out.println("Drawing a joke.");
                String pickJoke = jokez.drawJoke();
                System.out.println(pickJoke);
            } else {
                System.out.println("Printing the jokes.");
                jokez.printJokes();
            }
        }
    }
}
