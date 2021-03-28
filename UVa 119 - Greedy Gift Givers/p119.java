// Term 191 - Week 10
//Greedy Gift Givers
//119
import java.util.Scanner;
public class p119 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int numGroup = 0, groupNetWorth[], moneyOut = 0, numOfGiftReceivers = 0, moneyIn = 0, nameIndex = 0;
        String[] groupNames;
        String loopChecker = "";
        boolean firstTime = true;

        loopChecker = kb.next();
        do {
            if(!firstTime)
                System.out.println();
            numGroup = Integer.valueOf(loopChecker);
            groupNames = new String[numGroup];
            groupNetWorth = new int[numGroup];

            for (int i = 0; i < numGroup; i++)
                groupNames[i] = kb.next();

            for (int i = 0; i < numGroup; i++) {
                nameIndex = findIndexByName(groupNames, kb.next());
                moneyOut = kb.nextInt();
                numOfGiftReceivers = kb.nextInt();

                if (moneyOut != 0 && numOfGiftReceivers != 0)
                    moneyIn = moneyOut / numOfGiftReceivers;
                else
                    moneyIn = 0;

                groupNetWorth[nameIndex] -= moneyIn * numOfGiftReceivers;

                for (int j = 0; j < numOfGiftReceivers; j++) {
                    nameIndex = findIndexByName(groupNames, kb.next());
                    groupNetWorth[nameIndex] += moneyIn;
                }
            }
            for(int i = 0; i < numGroup; i++)
                System.out.println(groupNames[i] + " " + groupNetWorth[i]);
            kb.nextLine();
            if(kb.hasNextLine())
                loopChecker = kb.nextLine();
            else
                loopChecker = "";
            firstTime = false;
        } while (!loopChecker.equals(""));
        kb.close();
    }

    public static int findIndexByName(String[] array, String name) {
        for (int i = 0; i < array.length; i++)
            if (array[i].equals(name))
                return i;
        return -1;
    }
}
