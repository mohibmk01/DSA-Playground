import java.util.Scanner;

public class evenOdd{
    public static void main(String[] args) {
        
    
   
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Use ternary operator to check if the number is even or odd
        String result = (number % 2 == 0) ? "even" : "odd";

        // Print the result
        System.out.println(number + " is an " + result + " number.");

        // Close the scanner
        scanner.close();
    }
}
