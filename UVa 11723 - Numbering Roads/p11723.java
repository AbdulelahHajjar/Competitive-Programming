// Term 191 - Week 13
//Numbering Roads
//11723
import java.util.Scanner;
public class p11723 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int numOfRoads, numOfInt, caseNum = 0, i, numOfSuff;
		numOfRoads = kb.nextInt();
		numOfInt = kb.nextInt();
		
		while(numOfRoads != 0 && numOfInt != 0) {
			caseNum++;
			if(numOfInt >= numOfRoads)
				System.out.println("Case " + caseNum + ": 0");
			
			else {
				numOfRoads -= numOfInt;
				numOfSuff = (int) Math.ceil((double) numOfRoads / numOfInt);
				if(numOfSuff > 26)
					System.out.println("Case " + caseNum + ": impossible");
				else
					System.out.println("Case " + caseNum + ": " + numOfSuff);
			}
			numOfRoads = kb.nextInt();
			numOfInt = kb.nextInt();
		}
	}
}