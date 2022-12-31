package BigYear;
import java.util.ArrayList;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter
        ArrayList<Bird> birds = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("?");
            String command = scan.nextLine();
            
            if (command.equals("Quit")) {
                break;
            }
            
            if (command.equals("Add")) {
                System.out.println("Name: ");
                String newName = scan.nextLine();
                System.out.println("Name in Latin: ");
                String newLatin = scan.nextLine();
                Bird aBird = new Bird(newName, newLatin);
                birds.add(aBird);
            }
            
            if (command.equals("Observation")) {
                System.out.println("Bird?");
                String birdObservation = scan.nextLine();
                for (Bird bird: birds) {
                    String birdName = bird.getName();
                    if (birdName.equals(birdObservation)) {
                        bird.birdObserved();
                    }
                }
            }
            
            if (command.equals("All")) {
                for(Bird bird: birds) {
                    System.out.println(bird);
                }
            }
            
            if (command.equals("One")) {
                System.out.println("Bird?");
                String birdSelection = scan.nextLine();
                for (Bird bird: birds) {
                    String birdName = bird.getName();
                    if (birdName.equals(birdSelection)) {
                        System.out.println(bird);
                        break;
                    }
                }
            }
        }

    }

}
