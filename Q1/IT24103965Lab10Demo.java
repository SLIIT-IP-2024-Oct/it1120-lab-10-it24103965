import java.util.Scanner;

public class IT24103965Lab10Demo {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the mark
        System.out.print("Enter a mark (0 to 100): ");
        int mark = scanner.nextInt();
        
        // Use an assertion to check if the mark is within the valid range
        assert mark >= 0 && mark <= 100 : "Invalid Mark";
        
        // If the mark is valid, display a confirmation message
        System.out.println("Mark is Validated");
        
        // Close the scanner object
        scanner.close();
    }
}
