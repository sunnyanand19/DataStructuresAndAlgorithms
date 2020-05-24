package Recursion;

public class Combination {
    static int num, den;

    static int fact(int n){
        if(n == 0){
            return 1;
        }else{
            return fact(n-1)*n;
        }
    }

    static int nCr(int n ,int r){
        
        num = fact(n);
        den = fact(r)*fact(n-r);

        return num/den;
    }

    static int NCR(int n, int r){
        if(n == r || r ==0)
            return 1;
        return NCR(n-1, r-1)+ NCR(n-1, r);
    }

    public static void main(String[] args) {
        System.out.println(nCr(4, 2));
        System.out.println(NCR(4, 2));
    }

}