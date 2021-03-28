// Term 191 - Week 11
//Y3K Problem
//893
import java.util.Scanner;

public class p893 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int daysToAdd = 0, dayNum = 0, monthNum = 0, yearNum = 0, daysLeftInCurrentMonth = 0;
		
		//Starting from index 1, because it is more comprehensive.
		//February is left -1, and is altered in each combination later.
		int[] maxDaysEachMonth = {-1, 31, -1, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		do {
			daysToAdd = kb.nextInt();
			dayNum = kb.nextInt();
			monthNum = kb.nextInt();
			yearNum = kb.nextInt();
			
			if(daysToAdd != 0 || dayNum != 0 || monthNum != 0 || yearNum != 0) {
				while(daysToAdd > 0) {
					
					//If it is leap, assign 29 as the max. day in Feb., otherwise assign 28.
					if(isLeap(yearNum))
						maxDaysEachMonth[2] = 29;
					else
						maxDaysEachMonth[2] = 28;
					
					//Find the days left in the current month
					daysLeftInCurrentMonth = maxDaysEachMonth[monthNum] - dayNum + 1;
					
					//If no days are left (i.e. it is the last day), append the month and add remaining days in the next month.
					if(daysToAdd + dayNum > maxDaysEachMonth[monthNum]) {
						daysToAdd -= daysLeftInCurrentMonth;
						dayNum = 1;
						monthNum++;
						
						//If after appending the month, it became 13, append the year, and reset month to 1.
						if(monthNum == 13) {
							monthNum = 1;
							yearNum++;
						}
					}
					else {
						dayNum += daysToAdd;
						daysToAdd -= daysLeftInCurrentMonth;
					}
				}
				System.out.println(dayNum + " " + monthNum + " " + yearNum);
			}
		} while(daysToAdd != 0 || dayNum != 0 || monthNum != 0 || yearNum != 0);
	}
	
	public static boolean isLeap(int year) {
		if(year % 4 == 0) {
			if( year % 100 == 0) {
				if ( year % 400 == 0)
					return true;
				else
					return false;
			}
			else
				return true;
		}
		else
			return false;
	}
}