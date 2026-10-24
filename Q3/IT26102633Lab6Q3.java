import java.util.Scanner;

public class IT26102633Lab6Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double sumOfSquares = 0;
        int count = 0;
		
		System.out.println("Enter positive integers (terminate input with -99):");
        
        while (true) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            
            if (number == -99) {
                break; 
            } else if (number < 0) {
                
                System.out.println("Invalid input. Please enter a positive integer or -99 to terminate");
            } else {
                
                sumOfSquares += (double) number * number;
                count++;
            }
        }
		
		if (count > 0) {
            double rms = Math.sqrt(sumOfSquares / count);
            System.out.println("The Root Mean Square (RMS) is: " + rms);
        } else {
            System.out.println("No positive numbers were entered.");
        }
		
	}
}