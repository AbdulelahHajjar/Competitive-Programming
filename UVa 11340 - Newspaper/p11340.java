// Term 191 - Week 12
//Newspaper
//11340
import java.util.HashMap;
import java.util.Scanner;

public class p11340 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String currLine;
		HashMap<Character, Integer> map;
		
		int numTests, tableSize, numOfLines;
		double totalPrice, currPrice;
		
		numTests = kb.nextInt();
		for(int i = 0; i < numTests; i++) {
			map = new HashMap<>();
			totalPrice = 0;
			
			tableSize = kb.nextInt();
			for(int j = 0; j < tableSize; j++)
				map.put(Character.valueOf(kb.next().charAt(0)), kb.nextInt());
			
			numOfLines = kb.nextInt();
			
			kb.nextLine();
			for(int k = 0; k < numOfLines; k++) {
				currLine = kb.nextLine();
				for(int m = 0; m < currLine.length(); m++) {
					try {
						currPrice = map.get(Character.valueOf(currLine.charAt(m)));
						totalPrice += currPrice;
					} catch(Exception e) {}
				}
			}
			System.out.println(String.format("%.2f", totalPrice / 100) + "$");
		}
	}
}
