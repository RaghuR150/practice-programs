package practice.programs;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        String str = "freefiremax";
        System.out.println(reverseUsingSB(str));
    }

    static String reverseUsingSB(String str){
        return new StringBuilder(str).reverse().toString();
    }

    static String reverse(String str){
        StringBuilder reversed = new StringBuilder();
        for(int i=str.length()-1; i>=0; i--){
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }

    static String reversed(String str){
      char[]  chars = str.toCharArray();
      int start = 0;
      int end = chars.length-1;
      while(start < end) {
          char temp = chars[start];
          chars[start] = chars[end];
          chars[end] = temp;
          start++;
          end--;
      }
        return String.valueOf(chars);
    }

}
