import java.util.Scanner;
public class Objective5Lab4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num;

		System.out.println("Please enter a random whole number: ");
		num = scanner.nextInt();

		if(num % 2 == 0) {
			System.out.println("The number you entered is an Even number.");
		}
		else if(num % 2 ==1) {
				System.out.println("The number you entered is an Odd number.");
			}
		}
	}
