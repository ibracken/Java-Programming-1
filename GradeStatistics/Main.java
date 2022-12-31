package GradeStatistics;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Points inputs = new Points();
        UserInterface UI = new UserInterface(scanner, inputs);
        UI.start();
    }
}
