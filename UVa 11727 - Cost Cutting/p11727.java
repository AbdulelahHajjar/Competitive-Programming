//Cost Cutting
//11727
import java.util.Scanner;
public class p11727 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int numTestCases = kb.nextInt();
		
		for(int i = 0; i < numTestCases; i++) {
			int salary1 = kb.nextInt(), salary2 = kb.nextInt(), salary3 = kb.nextInt();
			
			int mid = 0, low = 0;
			
			if(salary1 > salary2 && salary1 > salary3) {
				mid = salary2;
				low = salary3;
			}
			else if(salary2 > salary1 && salary2 > salary3) {
				mid = salary3;
				low = salary1;
			}
			else if(salary3 > salary1 && salary3 > salary2) {
				mid = salary1;
				low = salary2;
			}
			
			if(mid > low)
				System.out.println("Case " + (i+1) + ": " + mid);
			else
				System.out.println("Case " + (i+1) + ": " + low);
		}
		kb.close();
	}
}
