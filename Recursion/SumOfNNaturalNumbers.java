package Recursion;

public class SumOfNNaturalNumbers{

    //Direct formula = n*(n+1)/2
    //Time complexity = O(1)
    //Space complexity = O(1)
    static int sumUsingFormula(int n ){
        return n*(n+1)/2;
    }

    //using recursion
    //Time complexity = O(n)
    //Space complexity = O(n)
    static int sum(int n){
        if(n == 0){
            return 0;
        }else{
            return sum(n-1)+n;
        }
    }

    //using Iteration
    //Time complexity = O(n)
    //Space complexity = O(1)
    static int iSum(int n){
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result = result + i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(sum(5));
        System.out.println(iSum(5));
    }
}