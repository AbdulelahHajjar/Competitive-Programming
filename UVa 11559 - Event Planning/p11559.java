//Event Planning
//11559
import java.util.Scanner;
public class p11559 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int numParticipants = 0, budget = 0, numHotels = 0, numWeeks = 0, pricePerPerson = 0, currMinCost = 0, nextMinCost = 0;
        String loopChecker = "";
        do {
            numParticipants = kb.nextInt();
            budget = kb.nextInt();
            numHotels = kb.nextInt();
            numWeeks = kb.nextInt();

            nextMinCost = -1;
            currMinCost = -1;

            for (int i = 0; i < numHotels; i++) {
                pricePerPerson = kb.nextInt();

                for (int j = 0; j < numWeeks; j++) {
                    if(kb.nextInt() >= numParticipants)
                        nextMinCost = pricePerPerson * numParticipants;
                }
                if(i == 0 || currMinCost == -1)
                    currMinCost = nextMinCost;

                if(i > 0 && nextMinCost < currMinCost)
                    currMinCost = nextMinCost;
            }

            if (currMinCost <= budget && currMinCost != -1)
                System.out.println(currMinCost);
            else
                System.out.println("stay home");
        } while(kb.hasNextInt());
    }
}
