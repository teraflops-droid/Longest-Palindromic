import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Palindromic {

    public static String getLongestString(final List<String> palindrome) {
        int maxLength = 0;
        String longestString = null;
        for (final String s : palindrome) {
            if (s.length() > maxLength) {
                maxLength = s.length();
                longestString = s;
            }
        }
        return longestString;
    }

    public static String findPalindromic(final String input) {

        final ArrayList<String> palindrome = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            final StringBuilder normal = new StringBuilder();
            final StringBuilder temp = new StringBuilder();
            final char c = input.charAt(i);
            final String flag = "" + c;
            normal.append(flag);
            temp.append(flag);
            for (int j = i + 1; j < input.length(); j++) {
                normal.append(input.charAt(j));
                temp.append(input.charAt(j));
                final StringBuilder reverse = temp.reverse();
                final String normalStr = normal.toString();
                final String reverseStr = reverse.toString();
                if (normalStr.equals(reverseStr)) {
                    palindrome.add(normalStr);
                } else {
                    reverse.reverse();
                }
            }
        }
        System.out.println("Palindrome " + palindrome);
        System.out.println("Longest palindrome: " + getLongestString(palindrome));
        return getLongestString(palindrome);
    }

    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        final String input = sc.next();
        findPalindromic(input);
        sc.close();
    }
}