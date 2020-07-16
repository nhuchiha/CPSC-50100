//Exercise #2
import java.util.Scanner;
import java.text.DecimalFormat;
public class DistCalc {

	public static void main(String[] args) 
	{
		int x1, y1, x2, y2;
		double dist;
		
		Scanner scan = new Scanner(System.in);
		DecimalFormat fmt = new DecimalFormat("0.###");
		
		System.out.print("Enter the x-coordinate for Point1: x1=");
		x1 = scan.nextInt();
		System.out.print("Enter the y-coordinate for Point1: y1=");
		y1 = scan.nextInt();
		System.out.print("Enter the x-coordinate for Point2: x2=");
		x2 = scan.nextInt();
		System.out.print("Enter the y-coordinate for Point2: y2=");
		y2 = scan.nextInt();
		
		dist = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2 - y1),2));
		
		System.out.print("The distance between these two points is: " + fmt.format(dist) + ".");				
	}

}
