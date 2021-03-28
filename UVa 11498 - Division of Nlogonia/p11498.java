//Division of Nlogonia
//11498
import java.util.Scanner;
public class p11498 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int numOfQueries = kb.nextInt();
		
		while(numOfQueries > 0) {
			double xD = kb.nextDouble(), yD = kb.nextDouble();
			for(int i = 0; i < numOfQueries; i++) {
				double x = kb.nextDouble(), y = kb.nextDouble();
				if(x == xD || y == yD)
					System.out.println("divisa");
				else if(x < xD && y > yD)
					System.out.println("NO");
				else if(x > xD && y > yD)
					System.out.println("NE");
				else if(x > xD && y < yD)
					System.out.println("SE");
				else
					System.out.println("SO");
			}
			numOfQueries = kb.nextInt();
		}
		kb.close();
	}
}
