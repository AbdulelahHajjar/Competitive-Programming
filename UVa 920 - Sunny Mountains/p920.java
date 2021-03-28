import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class p920 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int numTestCases, numOfPairs;
		
		numTestCases = kb.nextInt();
		for(int i = 0; i < numTestCases; i++) {
			numOfPairs = kb.nextInt();
			HashMap<Integer, Integer> points = new HashMap<>();
			for(int j = 0; j < numOfPairs; j++)
				points.put(kb.nextInt(), kb.nextInt());
			
			ArrayList<Integer> sortedXs = new ArrayList<>(points.keySet());
			Collections.sort(sortedXs);
			
			int leftSideLength = 0, prevValidYValue = 0;
			double sum = 0, slope = 0, baseLength = 0;

			for(int j = sortedXs.size() - 1; j >= 1; j--) {
				leftSideLength = points.get(sortedXs.get(j - 1)) - prevValidYValue;
				if(leftSideLength > 0) {
					slope = (points.get(sortedXs.get(j - 1)) - points.get(sortedXs.get(j))) / (double) (sortedXs.get(j - 1) - sortedXs.get(j));
					
					baseLength = (prevValidYValue + slope * sortedXs.get(j) - points.get(sortedXs.get(j)))/slope - sortedXs.get(j - 1);
					sum += Math.sqrt(baseLength * baseLength + leftSideLength * leftSideLength);
					prevValidYValue = points.get(sortedXs.get(j - 1));
				}
			}
			System.out.printf("%.2f\n", sum);
		}
	}
}
