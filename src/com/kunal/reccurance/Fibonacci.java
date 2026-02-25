package com.kunal.reccurance;

public class Fibonacci {
    public static void main(String[] args) {
        int ans = fibonacci(8);
        System.out.println(ans);
    }
    // inefficient for large numbers
    public static int fibonacci(int n){
        if(n<2){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
