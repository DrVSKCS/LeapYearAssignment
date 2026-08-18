import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year to check: ");
        
        if (scanner.hasNextInt()) {
            int year = scanner.nextInt();
            
            // TODO: Implement your leap year logic here.
            // Print "<year> is a leap year." OR "<year> is not a leap year."
            
        } else {
            System.out.println("Invalid input.");
        }
        
        scanner.close();
    }
}
