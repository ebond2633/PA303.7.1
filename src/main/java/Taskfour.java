public class Taskfour {
    public static void main(String[] args) {
        // Create an integer array with 5 elements
        int[] myArray = {10, 20, 30, 40, 50};

        // Print out the value at the first index
        System.out.println("Value at the first index: " + myArray[0]);

        // Print out the value at the last index using length - 1
        System.out.println("Value at the last index: " + myArray[myArray.length - 1]);

        try {
            // Try printing the value at index = length
            System.out.println("Value at index = length: " + myArray[myArray.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: " + e);
        }

        try {
            // Try to assign a value to the array index 5
            myArray[5] = 60;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: " + e);
        }
    }
}
