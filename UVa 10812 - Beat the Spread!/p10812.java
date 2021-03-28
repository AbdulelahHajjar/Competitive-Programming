// Term 191 - Week 11
//Beat the Spread!
//10812
import java.util.Scanner;

public class p10812 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int numOfEntries = kb.nextInt();
		long s, d, score1, score2;
		
		for(int i = 0; i < numOfEntries; i++) {
			s = kb.nextLong();
			d = kb.nextLong();
			score1 = (s + d) / 2;
			score2 = (s - d) / 2;
			
			if((s + d) % 2 != 0 || (s - d) % 2 != 0 || s < 0 || d < 0 || score1 < 0 || score2 < 0)
				System.out.println("impossible");
			else
				System.out.println(Math.max(score1, score2) + " " + Math.min(score1, score2));
		}
	}
}