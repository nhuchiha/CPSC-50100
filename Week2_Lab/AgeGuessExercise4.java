// Exercise #4
import java.util.Scanner;
import java.util.Random;
public class AgeGuessExercise4 {
	
	public static void main(String[] args) {
		//Declare variables
		int ageGuess;
		int age;
		
		Random generator = new Random();
		Scanner scan = new Scanner(System.in);
		
		age = generator.nextInt(101);
		
		//Prompt the user to enter the age
		System.out.print("Enter your age: ");
		ageGuess = scan.nextInt();	
		
		//Display user's input and generated integer
		System.out.println("Correct age is " + age + ".");
		
		if(age!=ageGuess)
		{
			System.out.print("You guessed wrong. ");
			if(ageGuess>age)
			{
				System.out.print("Older");
			}
			else
			{
				System.out.print("Younger");
			}
		}
			
	}

}
