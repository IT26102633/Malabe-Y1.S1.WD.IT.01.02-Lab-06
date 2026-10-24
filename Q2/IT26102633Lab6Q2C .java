import java.util.Scanner;

public class IT26102633Lab6Q2C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] numbers = new int[10];
        int i = 1;
        int sum = 0;
        
        System.out.println("Please enter 10 numbers:");
		
		while (i <= 10) {
            System.out.print("Enter number " + i + ": ");
            numbers[i - 1] = scanner.nextInt();
            sum += numbers[i - 1]; // Add to sum
            i++;
        }
        
        System.out.println("\nThe numbers you entered are:");
		
		i = 0;
        while (i < 10) {
            System.out.print(numbers[i] + " ");
            i++;
        }
        System.out.println();
		
		double average = (double) sum / 10;
		
		System.out.println("Sum of the numbers: " + sum);
        System.out.println("Average of the numbers: " + average);
		
	}
}
