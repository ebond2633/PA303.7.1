import java.util.Arrays;

public class Tasknine {
    public static void main(String[] args) {
        // Initialize the array with the given values
        int[] array = {4, 2, 9, 13, 1, 0};

        // Sort the array in ascending order
        Arrays.sort(array);

        // Print the array in ascending order
        System.out.println("Array in ascending order: " + Arrays.toString(array));

        // Print the smallest and largest elements
        System.out.println("The smallest number is: " + array[0]);
        System.out.println("The biggest number is: " + array[array.length - 1]);
    }
}
