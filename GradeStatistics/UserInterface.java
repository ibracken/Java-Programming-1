package GradeStatistics;
import java.util.Scanner;
import java.util.ArrayList;
public class UserInterface {
    private Scanner scanner;
    private Points points;
    
    public UserInterface(Scanner scanner, Points points) {
        this.scanner = scanner;
        this.points = points;
    }
    
    public void start() {
        System.out.println("Enter point totals, -1 stops:");        
        while (true) {
            int scan = Integer.valueOf(scanner.nextLine());
            if (scan == -1) {
                break;
            }
            if (scan >= 0 && scan <= 100) {
                this.points.addInputs(scan);
            }
            if (scan >=50 && scan<= 100) {
                this.points.addPassing(scan);
            }
        }
        //Point and passing averages
        double inputAverage = this.points.getInputAverage();
        double passingAverage = this.points.getPassingAverage();
        System.out.println("Point average (all): " + inputAverage);
        if (this.points.getPassing().isEmpty()) {
            System.out.println("Point average (passing: -");
        } else{
            System.out.println("Point average (passing): " + passingAverage);        
        }
        //Pass percentage
        double passPercent = this.points.passPercentage();
        System.out.println("Pass percentage: " + passPercent);
        //Grade distribution
        System.out.println("Grade distribution");
        ArrayList<Integer> allInputs = points.getInputs();
        int counter = 0;
        for (int i = 5; i >= 0; i = i - 1) {
            counter = 0;
            for (int grade: allInputs) {
                if (i == 5) {
                    if (grade <= (50 + 10 * i) && grade >= (40 + 10 * i)) {
                        counter += 1; 
                    }               
                } else if (i != 0) {
                    if (grade < (50 + 10 * i) && grade >= (40 + 10 * i)) {
                        counter += 1;
                    }
                } else {
                    if (grade < 50) {
                        counter += 1;
                    }
                }
            }
            System.out.println(i + ": " + points.addStars(counter));
        }
    }
}
