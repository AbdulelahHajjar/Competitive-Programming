// Term 191 - Week 10
//Zeros and Ones
//10324
import java.util.Scanner;

public class p10324 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        String originalString, tempS, flushNextLine;
        int numOfQueries = 0, min, max, m, n, caseNum = 0;
        boolean equal;

        originalString = kb.next();

        do {
            caseNum++;
            numOfQueries = kb.nextInt();
            System.out.println("Case " + caseNum + ":");
            for (int i = 1; i <= numOfQueries; i++) {
                equal = true;
                m = kb.nextInt();
                n = kb.nextInt();
                max = Math.max(m, n);
                min = Math.min(m, n);

                if (max == originalString.length() - 1)
                    tempS = originalString.substring(min);
                else
                    tempS = originalString.substring(min, max + 1);

                if (tempS.contains("0") && tempS.contains("1"))
                    equal = false;

                if (equal)
                    System.out.println("Yes");
                else
                    System.out.println("No");
            }
            kb.nextLine();
            if(kb.hasNextLine())
                originalString = kb.nextLine();
            else
                originalString = "";
        } while (!originalString.equals(""));

        kb.close();
    }
}