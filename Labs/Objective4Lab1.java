import java.util.Scanner;
public class Objective4Lab1 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String fname = "";
		String lname = "";
		String favoriteAnimal = "";
		String favoriteFood = "";
		String favoriteSong = "";

		System.out.println("Please enter your First Name: ");
		fname = input.nextLine();
		System.out.println("Please enter your Last Name: ");
		lname = input.nextLine();
		System.out.println("Please enter the name of your favorite animal: ");
		favoriteAnimal = input.nextLine();
		System.out.println("Please enter your favorite food: ");
		favoriteFood = input.nextLine();
		System.out.println("Please enter your favorite song: ");
		favoriteSong = input.nextLine();

		System.out.println("Your First Name is " + fname + " , and your Last name is " + lname + "." + " Your favorite Animal is " + favoriteAnimal + ", your favorite food is " + favoriteFood + ", and your favorite song is " + favoriteSong + ".");
		
	}
}