import java.util.ArrayList;


class Palindromic {

    public static void main(String[ ] args) {

        String input = "babad";
        ArrayList<String> palindrome = new ArrayList<String>();
        for (int i = 0; i < input.length(); i++) {
            StringBuilder normal = new StringBuilder();
            StringBuilder temp = new StringBuilder();
            char c = input.charAt(i);
            String flag = "" + c;
            normal.append(flag);
            temp.append(flag);
            System.out.println("First char " + normal);
            for (int j = i+1; j < input.length(); j++) {
                normal.append(input.charAt(j));
                temp.append(input.charAt(j));
                System.out.println("Next char " + normal);
                StringBuilder reverse = temp.reverse();
                System.out.println(reverse.toString());
                String normalStr = normal.toString();
                String reverseStr = reverse.toString();
                System.out.println("Normal String: " + normalStr);
                System.out.println("Reverse String: " + reverseStr);
                if(normalStr.equals(reverseStr)) {
                    System.out.print("Normal String: " + normalStr + " is equal to ");
                    System.out.println("Reverse String: " + reverseStr);
                    palindrome.add(normalStr);
                } else {
                    reverse.reverse();
                }
            }
        }
        System.out.println(palindrome);
    }
}