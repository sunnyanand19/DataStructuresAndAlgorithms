package Recursion;

public class TailAndHead {

    static void fun(int n){
        if(n > 0){
            System.out.println(n);
            fun(n-1);
        }
    }

    public static void main(String[] args) {
        int x = 3;
        fun(x);
    }

}