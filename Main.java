import java.util.ArrayList;

class Palindromic {
    public static ArrayList<String> longest(ArrayList<String> palindrome){
        ArrayList<String> temp = new ArrayList<>();
        temp.add("0");
        for(int i = 0; i< palindrome.size(); i++) {
            String data = palindrome.get(i).toString();
            if(data.length() >= temp.get(0).toString().length()) {
                temp.add(data);
            }
        }
        return temp;
  
    }

    public static void main(String[ ] args) {
        String input = "babad";
        ArrayList<String> palindrome = new ArrayList<String>();
        for (int i = 0; i < input.length(); i++) {
            StringBuilder normal = new StringBuilder();
            StringBuilder temp = new StringBuilder();
            char c = input.charAt(i);
            String flag = "" + c;
            normal.append(flag);
     

          for (int j = i+1; j < iput.lengt
            normal.append(i
            temp.append(input.charAt(j));
            System.out.println("Next char " + 
          StringBuilder reverse = temp.reverse();
          System.out.println(reverse.toString()
          String normalStr = no
          String reverseStr
          System.out.print
          System.out.pri 
          if(normalStr.equals(reverseStr)) {
              System . out.print("Normal String: " +
            System.out.println("Reverse
            palindrome.add(normalStr)
        } else {
            reverse.reverse();
        }
        
        
        ut.println(palindrome);
        
         
          
          
          
        
          
        
      
    
    
    
   System.out.println("Longest palindrome: " + longest(palindrome));
    }
}