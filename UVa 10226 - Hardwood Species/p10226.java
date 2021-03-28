//Hardwood Species
//10226
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class p10226 {
	public static void main(String[] args)  {
		Scanner kb = new Scanner(System.in);
		
		HashMap<String, Integer> trees;
		String tempInput;
		int numTestCases, sum;
		
		numTestCases = Integer.valueOf(kb.nextLine());
		kb.nextLine();
		for(int i = 0; i < numTestCases; i++) {
			sum = 0;
			trees = new HashMap<>();
			tempInput = kb.nextLine();
			
			while(!tempInput.equals("")) {
				sum++;
				if(trees.containsKey(tempInput))
					trees.put(tempInput, trees.get(tempInput) + 1);
				else
					trees.put(tempInput, 1);
				if(kb.hasNext())
					tempInput = kb.nextLine();
				else
					tempInput = "";
			}
			
			Object[] alphabeticalTrees = trees.keySet().toArray();
			Arrays.sort(alphabeticalTrees);
			
			for(int j = 0; j < alphabeticalTrees.length; j++)
				System.out.printf("%s %.4f\n", alphabeticalTrees[j], trees.get(alphabeticalTrees[j]) / (double) sum * 100);
			if(i != numTestCases - 1)
				System.out.println();
		}
	}
}
