package Recursion;

//Using Horner's rule and recursion
public class TaylorSeries {

    double series(int x, int n){
        Double sum = 1d;
        Double d2 = 0d;
        if(Double.compare(n, d2) == 0)
            return sum;
        sum = 1+(x*sum)/n;
        System.out.println("value of sum = "+sum);
        return series(x, n-1);
    }

    public static void main(String[] args) {
        TaylorSeries taylorSeries = new TaylorSeries();
        System.out.println(taylorSeries.series(2, 10));
    }
}