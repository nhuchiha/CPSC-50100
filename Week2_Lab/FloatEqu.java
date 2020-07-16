//Exercise 5

public class FloatEqu {

	public static void main(String[] args) 
	{
		double number1, number2;
		double delta = 0.000001;
		number1 = (1.0/10)*(1.0/10);
		number2 = (1.0/100);

		//a. The result is "NOT EQUAL". I would expect these two numbers to be equal to each other
		if(number1 == number2)
		{
			System.out.println("EQUAL");
		}
		else 
		{
			System.out.println("NOT EQUAL");
		}
		
         //b.the variables are  approximately equal 
		if(Math.abs(number1-number2) < delta)
		{
			System.out.println("These two numbers are approximately equal");
		}
		else
		{
			System.out.println("These two numbers are not equal");
		}
	}

		
		
}
