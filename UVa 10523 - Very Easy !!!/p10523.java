//Very Easy !!!
//10523
import java.math.BigInteger;
import java.util.Scanner;
public class p10523 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n, a;
		BigInteger sum;
		
		while(kb.hasNext()) {
			sum = new BigInteger("0");
			n = kb.nextInt();
			a = kb.nextInt();
			for(int i = 1; i <= n; i++)
				sum = sum.add(BigInteger.valueOf(i).multiply(BigInteger.valueOf(a).pow(i)));
			System.out.println(sum);
		}
	}
}