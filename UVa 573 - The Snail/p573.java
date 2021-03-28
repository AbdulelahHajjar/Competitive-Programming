// Term 191 - Week 09
//The Snail
//573
import java.util.Scanner;
public class p573 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		double wellHeight = 0, climbFactor = 0, nightDown = 0, fatigueFactor = 0, totalClimbed = 0, climbRate = 0;
		int dayNumber = 0;
		
		do {
			wellHeight = kb.nextDouble();
			climbFactor = kb.nextDouble();
			nightDown = kb.nextDouble();
			fatigueFactor = kb.nextDouble();
			
			if(wellHeight != 0) {
				dayNumber = 0;
				totalClimbed = 0;
				climbRate = 0;
				
				while(totalClimbed <= wellHeight && totalClimbed >= 0) {
					dayNumber++;
					climbRate = climbFactor - fatigueFactor/100.0 * climbFactor * (dayNumber - 1);
					
					if(climbRate >= 0)
						totalClimbed += climbRate;
					if(totalClimbed <= wellHeight)
						totalClimbed -= nightDown;
				}
				
				if(totalClimbed >= wellHeight)
					System.out.println("success on day " + (dayNumber));
				else
					System.out.println("failure on day " + (dayNumber));
			}

		}while(wellHeight != 0);
		kb.close();
	}
}
