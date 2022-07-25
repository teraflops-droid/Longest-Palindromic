import java.util.ArrayList;
import java.util.Scanner;


class Playground {

    public static String getLongestString(ArrayList<String> palindrome) {
        int maxLength = 0;
        String longestString = null;
        for (String s : palindrome) {
          if (s.length() > maxLength) {
            maxLength = s.length();
            longestString = s;
          }
        }
        return longestString;
      }
     

    public static void main(String[ ] args) {

        // String input = "babad";
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        ArrayList<String> palindrome = new ArrayList<String>();
        for (int i = 0; i < input.length(); i++) {
            StringBuilder normal = new StringBuilder();
            StringBuilder temp = new StringBuilder();
            char c = input.charAt(i);
            String flag = "" + c;
            normal.append(flag);
            temp.append(flag);
            for (int j = i+1; j < input.length(); j++) {
                normal.append(input.charAt(j));
                temp.append(input.charAt(j));
                StringBuilder reverse = temp.reverse();
                String normalStr = normal.toString();
                String reverseStr = reverse.toString();
                if(normalStr.equals(reverseStr)) {
                    palindrome.add(normalStr);
                } else {
                    reverse.reverse();
                }
            }
        }
        sc.close();
        System.out.println(palindrome);
        System.out.println("Longest palindrome: " + getLongestString(palindrome));
    }
}