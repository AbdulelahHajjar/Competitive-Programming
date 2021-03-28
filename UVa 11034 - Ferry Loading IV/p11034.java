//Ferry Loading IV
//11034
import java.util.ArrayList;
import java.util.Scanner;

public class p11034 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String currentSide = "left", carSide;
		ArrayList<Integer> leftCars, rightCars, currentCarList;
		
		int numTestCases, numOfCars, maxFerryLength, currentFerryLength, carLength, numCrossings;
		
		numTestCases = kb.nextInt();
		for(int i = 0; i < numTestCases; i++) {
			maxFerryLength = kb.nextInt() * 100;
			numOfCars = kb.nextInt();
			
			currentFerryLength = maxFerryLength;
			currentSide = "left";
			numCrossings = 0;
			leftCars = new ArrayList<>(numOfCars);
			rightCars = new ArrayList<>(numOfCars);
			
			//Copy all elements to either leftCars or rightCars list.
			for(int j = 0; j < numOfCars; j++) {
				carLength = kb.nextInt();
				carSide = kb.next();
				if(carSide.equals("left"))
					leftCars.add(carLength);
				else
					rightCars.add(carLength);
			}
			
			//Repeat while there are cars on either end of the river
			while(leftCars.size() > 0 || rightCars.size() > 0) {
				
				//If the ferry is on the left side, use the left cars list, otherwise, use the right cars list.
				if(currentSide.equals("left"))
					currentCarList = leftCars;
				else
					currentCarList = rightCars;
				
				//Lift all cars on the ferry, and stop lifting when there is no enough space.
				if(currentCarList.size() > 0)
					while(currentCarList.size() > 0 && currentFerryLength >= currentCarList.get(0)) {
						currentFerryLength -= currentCarList.get(0);
						currentCarList.remove(0);
					}
				
				//These lines will only be executed if the boat is full, and cannot handle more cars.
				
				//Go to the other side
				numCrossings++;
				//Empty the boat
				currentFerryLength = maxFerryLength;
				//Assign the current side to be the opposite
				currentSide = reverseSide(currentSide);
				
				//The loop will repeat with fewer amounts of cars the next time, and will eventually stop.
			}
			System.out.println(numCrossings);
		}
	}
	
	public static String reverseSide(String currentSide) {
		return currentSide.equals("left") ? "right" : "left";
	}
}