// Term 191 - Week 12
//Conformity
//11286
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class p11286 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int[] tempCourses = new int[5];
		HashMap<String, Integer> allCombinations;
		int numFrosh, sum, counter, mostPopular;
		
		numFrosh = kb.nextInt();
		while(numFrosh > 0) {
			allCombinations = new HashMap<>();
			for(int i = 0; i < numFrosh; i++) {
				for(int j = 0; j < 5; j++)
					tempCourses[j] = kb.nextInt();
				
				//Sort course numbers increasingly, this is used to detect similar course combinations.
				Arrays.sort(tempCourses);
				
				//If the hashmap contains the same string of courses, increment the popularity by 1.
				if(allCombinations.containsKey(Arrays.toString(tempCourses)))
					allCombinations.put(Arrays.toString(tempCourses), allCombinations.get(Arrays.toString(tempCourses)) + 1);
				else
					allCombinations.put(Arrays.toString(tempCourses), 1);
			}
			
			//Get all the popularity numbers
			Object[] values = allCombinations.values().toArray();
			
			//Sort popularity number increasingly
			Arrays.sort(values);
			
			mostPopular = (Integer) values[values.length - 1];
			counter = values.length - 1;
			sum = 0;
			
			//Add the most popular combinations to sum
			while(counter >= 0 && (Integer) values[counter] == mostPopular) {
				sum += (Integer) values[counter];
				counter--;
			}
			
			System.out.println(sum);
			numFrosh = kb.nextInt();
		}
	}
}