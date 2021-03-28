//Packing for Holiday
//12372
import java.util.Scanner;
public class p12372 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int count = kb.nextInt();
		double totalVolume = 20 * 20 * 20;
		double length = 0, width = 0, height = 0;
		
		for(int i = 1; i <= count; i++) {
			length = kb.nextDouble();
			width = kb.nextDouble();
			height = kb.nextDouble();
			
			if(length > 20 || width > 20 || height > 20 || length*width*height > totalVolume)
				System.out.println("Case " + i + ": bad");
			else
				System.out.println("Case " + i + ": good");
		}
		kb.close();
	}
}
