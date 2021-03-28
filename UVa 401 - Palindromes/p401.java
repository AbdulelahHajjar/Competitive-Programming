//Palindromes
//401
import java.util.Scanner;
public class p401 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String word;

        boolean isP = false, isM = false, firstTime = true;

        while (kb.hasNext()) {
            word = kb.next();
            isP = isPalindrome(word);
            isM = isMirrored(word);

            if (isP && isM)
                System.out.println(word + " -- is a mirrored palindrome.");
            else if (!isP && isM)
                System.out.println(word + " -- is a mirrored string.");
            else if (isP && !isM)
                System.out.println(word + " -- is a regular palindrome.");
            else if (!isP && !isM)
                System.out.println(word + " -- is not a palindrome.");
            System.out.println();
        }
    }

    public static boolean isPalindrome(String s) {
        if (s.length() == 1 || s.length() == 0)
            return true;
        else if (s.charAt(0) == s.charAt(s.length() - 1))
            return true && isPalindrome(s.substring(1, s.length() - 1));
        else
            return false;
    }

    public static boolean isMirrored(String s) {
        if (s.length() == 0)
            return true;
        else if (s.length() == 1)
            return true && areTwoEqualMirrored(s.charAt(0), s.charAt(0));
        else if (areTwoEqualMirrored(s.charAt(0), s.charAt(s.length() - 1)))
            return true && isMirrored(s.substring(1, s.length() - 1));
        else
            return false;
    }

    public static boolean areTwoEqualMirrored(char a, char b) {

        if ((String.valueOf(a) + String.valueOf(b)).replaceAll("[AHIMOTUVWXY18]", "").length() == 0)
            return a == b;
        else if (a == 'E' && b == '3' || a == '3' && b == 'E') return true;
        else if (a == 'J' && b == 'L' || a == 'L' && b == 'J') return true;
        else if (a == 'S' && b == '2' || a == '2' && b == 'S') return true;
        else if (a == 'Z' && b == '5' || a == '5' && b == 'Z') return true;
        else return false;
    }
}
