//Faynman
//12149
import java.util.Scanner;
public class p12149 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int size = kb.nextInt(), sum;
		
		while (size > 0) {
			sum = 0;
			
			for (int i = 1; i <= size; i++)
				sum += i * i;
			System.out.println(sum);
			
			size = kb.nextInt();
		}
	}
}