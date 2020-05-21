package Recursion;

public class Exponential {

    //m power n
    static int pow(int m, int n){
        if(n ==0){
            return 1;
        }else{
            return pow(m, n-1) * m;
        }
    }

    //took 6 multiplications
    static int powFast(int m, int n){
        if(n == 0){
            return 1;
        }if(n %2 == 0){
            return powFast(m*m, n/2);
        }else{
            return m * powFast(m*m, (n-1)/2);
        }
    }

    public static void main(String[] args) {
        System.out.println(pow(2, 9));
        System.out.println(powFast(2, 9));
    }

}