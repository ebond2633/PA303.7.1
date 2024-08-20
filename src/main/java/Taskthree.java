import java.util.Arrays;

public class Taskthree {
    public static void main(String[] args) {
        // Initialize the array with the given strings
        String[] colors = {"red", "green", "blue", "yellow"};

        // Print out the array length
        System.out.println("Array length: " + colors.length);

        // Make a copy using the clone() method
        String[] colorsCopy = colors.clone();

        // Use the Arrays.toString() method on the new array to verify the original array was copied
        System.out.println("Original array: " + Arrays.toString(colors));
        System.out.println("Copied array: " + Arrays.toString(colorsCopy));
    }
}
