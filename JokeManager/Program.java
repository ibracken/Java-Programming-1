package JokeManager;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        JokeManager jokes = new JokeManager();
        jokes.addJoke("Just joking 1");
        jokes.addJoke("Just joking 2");
        UserInterface UI = new UserInterface(jokes, scanner);
        UI.start();
    }
}
