public class Taskseven{
    public static void main(String[] args) {
        // Create an integer array with 5 elements
        int[] myArray = {10, 20, 30, 40, 50};

        // Loop through the array and print each element except the middle one
        for (int i = 0; i < myArray.length; i++) {
            if (i == 2) {
                continue; // Skip the middle element
            }
            System.out.println("Element at index " + i + ": " + myArray[i]);
        }
    }
}
