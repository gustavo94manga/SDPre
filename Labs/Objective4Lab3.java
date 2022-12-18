import java.util.Scanner;
public class Objective4Lab3 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int brithYear, age, currentYear;

		int birthYear = 0;

		
		System.out.println("How old are you?");
		age = input.nextInt();
		System.out.println("What is the current calendar year?");
		currentYear = input.nextInt();

		int yourAge = currentYear - age;

		System.out.println("You are " + age + " years old," + " and you were born on " + yourAge + ".");


	}
}