/* Nhu-Chi Ha
 * Course: CPSC-50100
 * Summer 2020
 * Programming Assignment 1 (Cipher) 
 */
import java.util.Random;
import java.util.Scanner;

public class Cipher {

	public static void main(String[] args) 
	{
		// define variables
		int num1 = 0, keyNum;
		int firstNum, secondNum;
		int sum = 0, encodedNum = 0;
		
		Random generator = new Random();
		Scanner scan = new Scanner(System.in);
		
		// generate the key number
		keyNum = generator.nextInt(10);
			
		//Ask user to enter 5 numbers
		for (int i = 1; i < 6 && num1<20; i++)
		{
			System.out.print("Please enter number " + i + " between 0 and 19: ");
			num1 = scan.nextInt();
			if (num1>19)
				System.out.println("Please read the direction and try again.");
			
			sum +=num1;		
		}
		
		//Calculate the encoded number
		firstNum = (sum/10 + keyNum) % 10; // need to grab the 10th
		secondNum = (sum % 10 + keyNum) % 10; //need to grab the secondNum
		encodedNum = firstNum * 10 + secondNum;
		
		//Display the numbers
		if(num1<19)
		{	
			System.out.println("The unencoded number (sum) is: " + sum);
			System.out.println("The first number is: "+ firstNum);
			System.out.println("The second number is: "+ secondNum);
			System.out.println("#########################################");
			System.out.println("The key number is: " + keyNum);
			System.out.println("The encoded number is: "+ encodedNum);
		}
		
	}

}
