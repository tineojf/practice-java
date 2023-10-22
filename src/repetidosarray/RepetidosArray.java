package repetidosarray;

import java.util.Arrays;
import java.util.HashSet;

public class RepetidosArray {
    private int[] array;
    private HashSet<Integer> uniqueSet;
    private HashSet<Integer> repeatedSet;
    private int[] duplicateArray;

    // Constructor
    public RepetidosArray(int[] _array) {
        this.uniqueSet = new HashSet<>();
        this.repeatedSet = new HashSet<>();
        this.setArray(_array);
    }

    // Getters and setters
    public void setArray(int[] array) {
        this.array = array;
    }

    // To string
    @Override
    public String toString() {
        return "Original array: " + Arrays.toString(this.array) + "\n"
                + "Duplicate array: " + Arrays.toString(this.duplicateArray) + "\n";
    }

    // Methods
    public void run() {
        // Verify if array is null
        if (this.array == null) {
            System.out.println("Array is null");
            return;
        }

        // Add elements to Sets
        for (int element : this.array) {
            if (this.uniqueSet.contains(element)) {
                this.repeatedSet.add(element);
            } else {
                this.uniqueSet.add(element);
            }
        }

        // Create & addduplicate array
        this.duplicateArray = new int[this.repeatedSet.size()];
        int i = 0;
        for (int value : this.repeatedSet) {
            this.duplicateArray[i] = value;
            i++;
        }

        System.out.println(this);
    }
}
