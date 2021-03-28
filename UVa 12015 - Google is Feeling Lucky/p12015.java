//Google is Feeling Lucky
//12015
import java.util.Scanner;
public class p12015 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int numCases = kb.nextInt(), currRelavanceScore = 0, nextRelavanceScore = 0;
        String[] websitesURLs;
        String tempWebsiteURL;

        for (int i = 1; i <= numCases; i++) {
            websitesURLs = new String[10];

            for (int j = 0; j < 10; j++) {
                tempWebsiteURL = kb.next();
                nextRelavanceScore = kb.nextInt();

                websitesURLs[j] = nextRelavanceScore + "|" + tempWebsiteURL;
                if (j == 0)
                    currRelavanceScore = nextRelavanceScore;

                if (nextRelavanceScore >= currRelavanceScore)
                    currRelavanceScore = nextRelavanceScore;
            }
            System.out.println("Case #" + i + ":");
            for(int j = 0; j < 10; j++)
                if(websitesURLs[j].contains(String.valueOf(currRelavanceScore)))
                    System.out.println(websitesURLs[j].substring(websitesURLs[j].indexOf('|') + 1));
        }
        kb.close();
    }
}