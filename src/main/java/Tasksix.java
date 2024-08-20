public class Tasksix {
    public static void main(String[] args) {
        // Create an integer array with a length of 5
        int[] myArray = new int[5];

        // Loop through the array and assign the value of the loop control variable multiplied by 2 to each index
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i * 2;
        }

        // Print out the array elements to verify the assignment
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Element at index " + i + ": " + myArray[i]);
        }
    }
}
