import java.util.Scanner;

public class IT26102633Lab6Q2B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		
		int[] numbers = new int[10];
        int i = 1;
		
		System.out.println("Please enter 10 numbers:");
		
		while (i <= 10) {
            System.out.print("Enter number " + i + ": ");
            numbers[i - 1] = scanner.nextInt();
            i++;
        }
		
		System.out.println("\nThe numbers you entered are:");
		
		i = 0;
        while (i < 10) {
            System.out.print(numbers[i] + " ");
            i++;
        }
        System.out.println();
		
	}
}