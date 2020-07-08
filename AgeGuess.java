import java.util.Scanner;
public class AgeGuess {
	
	public static void main(String[] args) {
		//Declare variables
		String name;
		int ageGuess;
		
		Scanner scan = new Scanner(System.in);
		
		//Prompt the user to enter the name and age
		System.out.print("Enter your name: ");
		name = scan.next();
		System.out.print("Enter your age: ");
		ageGuess = scan.nextInt();	
		
		//Display user's inputs
		System.out.println("Name is " + name + " and ageGuess is " + ageGuess);
	}

}
