import java.util.Scanner;

public class IT24103965Lab10Q1 { 
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the mark
        System.out.print("Enter a mark (0 to 100): ");
        int mark = scanner.nextInt();
        
        // Use an assertion to check if the mark is within the valid range (0 to 100)
        assert mark >= 0 && mark <= 100 : "Invalid Mark";
        
        // Determine the grade based on the mark
        String grade = "";
        if (mark >= 75) {
            grade = "A";
        } else if (mark >= 60) {
            grade = "B";
        } else if (mark >= 50) {
            grade = "C";
        } else if (mark >= 40) {
            grade = "D";
        } else {
            grade = "F";
        }

        // Use an assertion to verify the grade assigned
        assert isValidGrade(grade) : "Incorrect Grade Assigned";
        
        // If the mark is valid and the grade is correctly assigned, display the grade
        System.out.println("Grade: " + grade);
        
        // Close the scanner object
        scanner.close();
    }
    
    // Helper method to validate the grade
    public static boolean isValidGrade(String grade) {
        return grade.equals("A") || grade.equals("B") || grade.equals("C") || grade.equals("D") || grade.equals("F");
    }
}
