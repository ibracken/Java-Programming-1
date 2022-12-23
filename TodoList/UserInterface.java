package TodoList;
import java.util.Scanner;
public class UserInterface {
    private TodoList assignment;
    private Scanner scanner;
    
    public UserInterface(TodoList assignment, Scanner scanner) {
        this.assignment = assignment;
        this.scanner = scanner;
    }
    public void start() {
        while (true) {
            System.out.println("Command");
            String command = scanner.nextLine();
            if (command.equals("add")){
                System.out.println("To add:");
                String add = scanner.nextLine();
                this.assignment.add(add);
            }
            if (command.equals("list")){
                this.assignment.print();
            }
            if (command.equals("remove")){
                int remove = Integer.valueOf(scanner.nextLine());
                this.assignment.remove(remove);
            }
            if (command.equals("stop")) {
                break;
            }
        }
    }
}