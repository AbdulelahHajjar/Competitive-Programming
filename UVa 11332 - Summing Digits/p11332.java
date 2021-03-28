// Term 191 - Week 09
//Summing Digits
//11332
import java.util.Scanner;
public class p11332 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int num = kb.nextInt();
		int sum = 0;
		
		while(num != 0) {
			sum = 0;
			while(num >= 10) {
				sum += num%10;
				num /= 10;
				if(num <= 9) {
					sum += num;
					if(sum >= 10) {
						num = sum;
						sum = 0;
					}
				}
			}
			if (num <= 9 && sum == 0)
				System.out.println(num);
			else
				System.out.println(sum);
			
			num = kb.nextInt();
		}
		kb.close();
	}
}
