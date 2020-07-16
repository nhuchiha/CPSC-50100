//Exercise #3
import java.util.Scanner;
import java.util.Random;

public class UserNames {

	public static void main(String[] args) 
	{
		String firstName;
		String lastName;
		int randomNumber;
		
		Scanner scan = new Scanner(System.in);
		Random generator = new Random();
		
		System.out.print("Enter your first name: ");
		firstName = scan.next();
		System.out.print("Enter your last name: ");
		lastName = scan.next();
        
		randomNumber = generator.nextInt(90)+10; 
		System.out.print("Your username is: " + lastName.substring(0,4) 
											  + firstName.substring(0,1)
											  + randomNumber);
	}

}
