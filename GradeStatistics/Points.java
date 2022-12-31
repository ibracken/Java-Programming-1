package GradeStatistics;
import java.util.ArrayList;
public class Points {
    private ArrayList<Integer> inputs;
    private ArrayList<Integer> passing;
    
    public Points() {
        this.inputs = new ArrayList<>();
        this.passing = new ArrayList<>();
    }
    
    public ArrayList<Integer> getInputs() {
        return this.inputs;
    }

    public ArrayList<Integer> getPassing() {
        return this.passing;
    }

    public int sizeDifference() {
        int size = inputs.size();
        size = size - passing.size();
        return size;
    }
    
    public void addInputs(int value) {
        this.inputs.add(value);
    }
    
    public void addPassing(int value) {
        this.passing.add(value);
    }
    
    public double getInputAverage() {
        double num = 0;
        for (int input: inputs) {
            num += input;
        }
        num = 1.0 * num / inputs.size();
        return num;
    }
    
    public double getPassingAverage() {
        double num = 0;
        for (int input: passing) {
            num += input;
        }
        num = 1.0 * num / passing.size();
        return num;
    }
    
    public double passPercentage() {
        double percentage = (1.0 * passing.size() / inputs.size()) * 100;
        return percentage;
    }
    
    public String addStars(int starCount) {
        String stars = "";
        for (int i = 0; i < starCount; i++) {
            stars += "*";
        }
        return stars;
        
    }
}
