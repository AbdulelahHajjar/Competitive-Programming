// Term 191 - Week 09
//Loansome Car Buyer
//10114
import java.util.Scanner;
public class p10114 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int duration, depRecords;
		double downPayment, loanAmount, carValue, monthlyFee;
		
		do {
			duration = kb.nextInt();
			downPayment = kb.nextDouble();
			loanAmount = kb.nextDouble();
			depRecords = kb.nextInt();

			carValue = loanAmount + downPayment;
			monthlyFee = loanAmount/(double) duration;
			
			if(duration > 0) {
				int monthNum = 0, i, currentUsedDepReports = 0;
				double  currDepPercent = 0, nextDepPercent = 0;
				
				monthNum = kb.nextInt();
				currDepPercent = kb.nextDouble();
				currentUsedDepReports++;
				carValue -= carValue * currDepPercent;
				
				for(i = 1; i <= duration && loanAmount >= carValue; i++) {

					if(currentUsedDepReports < depRecords && monthNum == i - 1) {
						monthNum = kb.nextInt();
						nextDepPercent = kb.nextDouble();
						currentUsedDepReports++;
					}

					if(monthNum == i)
						currDepPercent = nextDepPercent;

					carValue -= currDepPercent * (carValue);
					loanAmount -= monthlyFee;
				}

				while(currentUsedDepReports < depRecords) { //Exhaust leftover records
					kb.nextInt();
					kb.nextDouble();
					currentUsedDepReports++;
				}

				if(i-1 == 1)
					System.out.println((i-1) + " month");
				else
					System.out.println((i-1) + " months");
			}
		} while(duration > 0);
		kb.close();
	}
}

