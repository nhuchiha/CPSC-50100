import java.util.Scanner;
public class TimeComp {

	public static void main(String[] args) {
		//declare the variables
		int secondTotal;
		int hour;
		int minute;
		int second; 
		
		Scanner scan = new Scanner(System.in);
		
		//Prompt the user to enter the number of seconds
		System.out.print("Enter the number of seconds: ");
		secondTotal = scan.nextInt();
		
		//Compute the hour, minute and second from the provided seconds
		hour = secondTotal/3600;
		minute = (secondTotal - 3600*hour)/60;
		second = (secondTotal - 3600*hour) - (minute*60);
		
		//Display the result
		System.out.println(secondTotal + " is equvivalent to " + hour + " hours " + minute + " minutes " + second + " seconds");
	}

}
