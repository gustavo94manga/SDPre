import java.util.Scanner;
public class Objective5Lab3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int userNum;
		int userNum2;

		System.out.println("Please enter a whole number: ");
		userNum = scanner.nextInt();
		System.out.println("Please enter a second whole number: ");
		userNum2 = scanner.nextInt();

		if(userNum == userNum2) {
			System.out.println(userNum + " equals " + userNum2);
		}
		else if (userNum >= userNum2) {
			System.out.println(userNum + " is greater than " + userNum2);
		}
		else if(userNum <= userNum2) {
			System.out.println(userNum + " is less than " + userNum2);
		}

	}
}