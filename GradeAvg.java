
public class GradeAvg {
	
	
	
	public static void main(String[] args) {
		
		//Creates and initialize 7 double variables 
		double quizScore1 = 100, quizScore2 = 70, quizScore3 = 50 ;
		double testScore1 = 90, testScore2 = 80;
		double quizScoreAvg, testScoreAvg;
		
		// calculate the average values
		quizScoreAvg = (quizScore1 + quizScore2 + quizScore3)/3;
		testScoreAvg = (testScore1 + testScore2)/2 ;
		
		//Display the average values
		System.out.println("The quiz score average is: "+ quizScoreAvg);
		System.out.println("The test score average is: " + testScoreAvg);
		
	}

}
