package Recursion;

import java.util.Arrays;

public class Fibonacci {

    static int[] arr = new int[10];

    static int iterativeFib(final int n) {

        int sum = 0;
        int t0 = 0;
        int t1 = 1;
        if (n <= 1)
            return n;
        for (int i = 2; i <= n; i++) {
            sum = t0 + t1;
            t0 = t1;
            t1 = sum;
        }
        return sum;
    }

    //Fibonacci using memoization
    static int recFib(int n) {
        if(n <=1){
            arr[n] = n;
            return n;
        }else{
            if(arr[n-2] == -1)
                arr[n-2] = recFib(n-2);
            if(arr[n-1] == -1)
                arr[n-1] = recFib(n-1);

        return arr[n-2]+arr[n-1];
        }
    }

    public static void main(final String[] args) {
        Arrays.fill(arr, -1);
        System.out.println(iterativeFib(9));
        System.out.println(recFib(9));
        
    }

}