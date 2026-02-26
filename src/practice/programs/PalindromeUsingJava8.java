package practice.programs;

import java.util.stream.IntStream;

public class PalindromeUsingJava8 {
    public static void main(String[] args) {
        String str = "racecar";
        System.out.println(isPalindrome(str));
    }

    static boolean isPalindrome(String str){
       return  IntStream.range(0,str.length()/2)
                .allMatch( i -> str.charAt(i) == str.charAt(str.length()-1-i));
    }
}
