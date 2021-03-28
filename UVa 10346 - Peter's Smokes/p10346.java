// Term 191 - Week 12
//Peter's Smokes
//10346
import java.util.Scanner;

public class p10346 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n, k;
		
		while(kb.hasNext()) {
			n = kb.nextInt();
			k = kb.nextInt();
			System.out.println(n + getTotalCigars(n, k));
		}
	}
	
	public static int getTotalCigars(int n, int k) {
		if(n < k)
			return 0;
		else {
			int leftover = n - n / k * k;
			return n / k + getTotalCigars(n / k + leftover, k);
		}
	}
}