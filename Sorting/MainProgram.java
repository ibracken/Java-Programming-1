package Sorting;


public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
    }
    
    public static int smallest(int[] array) {
        int small = array[0];
        for (int placehold: array) {
            if (small >= placehold) {
                small = placehold;
            }
        }
        return small;
    }
    
    public static int indexOfSmallest(int[] array) {
        int small = MainProgram.smallest(array);
        int smallIndex = 0;
        for (int i = 0; i < array.length; i ++) {
            if (small ==(array[i])) {
                small = array[i];
                smallIndex = i;
            }
        }
        return smallIndex;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int small = table[startIndex];
        int smallIndex = startIndex;
        for (int i = startIndex; i < table.length; i ++) {
            if (small >=(table[i])) {
                smallIndex = i;
                small = table[i];
            }
        }
        return smallIndex;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int placehold = 0;
        placehold = array[index1];
        array[index1] = array[index2];
        array[index2] = placehold;
    }
    
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            MainProgram.swap(array, i, indexOfSmallestFrom(array, i));
            System.out.println(array);
        }
    }

}
