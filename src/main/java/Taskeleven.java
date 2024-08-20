import java.util.Scanner;

public class Taskeleven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user how many favorite things they have
        System.out.print("How many favorite things do you have? ");
        int numberOfThings = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Create a String array of the correct size
        String[] favoriteThings = new String[numberOfThings];

        // Ask the user to enter their favorite things
        for (int i = 0; i < numberOfThings; i++) {
            System.out.print("Enter favorite thing #" + (i + 1) + ": ");
            favoriteThings[i] = scanner.nextLine();
        }

        // Print out the contents of the array
        System.out.println("Your favorite things are:");
        for (String thing : favoriteThings) {
            System.out.println(thing);
        }

        scanner.close();
    }
}
