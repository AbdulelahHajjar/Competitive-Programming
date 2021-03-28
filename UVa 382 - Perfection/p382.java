//Perfection
//382
import java.util.Scanner;

public class p382 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int num, sumOfDivisors;
		String status;
		
		num = kb.nextInt();
		System.out.println("PERFECTION OUTPUT");
		while(num != 0) {
			sumOfDivisors = 0;
			for(int i = 1; i < num; i++)
				if(num % i == 0) sumOfDivisors += i;
				
			if(sumOfDivisors < num)
				status = "DEFICIENT";
			else if(sumOfDivisors > num)
				status = "ABUNDANT";
			else
				status = "PERFECT";
			
			System.out.printf("%5d  %s\n", num, status);
			num = kb.nextInt();
		}
		System.out.println("END OF OUTPUT");
	}
}