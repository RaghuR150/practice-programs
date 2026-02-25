package com.kunal.string;

public class Palindrome {
    public static void main(String[] args) {
        String str = "racecar";
        System.out.println(isPalindrome(str));
    }

    static boolean isPalindrome(String str){

        for(int index=0; index<= str.length()/2; index++){
            if(str.charAt(index) != str.charAt(str.length()-1-index)){
                return false;
            }
        }
        return true;
    }

}
