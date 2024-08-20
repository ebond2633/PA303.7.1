public class Taskeight {
    public static void main(String[] args) {
        // Create a String array with 5 elements
        String[] colors = {"red", "green", "blue", "yellow", "purple"};

        // Print the original array
        System.out.println("Original array: " + java.util.Arrays.toString(colors));

        // Swap the first element with the middle element
        int middleIndex = colors.length / 2;
        String temp = colors[0];
        colors[0] = colors[middleIndex];
        colors[middleIndex] = temp;

        // Print the array after swapping
        System.out.println("Array after swapping: " + java.util.Arrays.toString(colors));
    }
}
