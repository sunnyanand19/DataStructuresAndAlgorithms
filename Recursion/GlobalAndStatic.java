package Recursion;

public class GlobalAndStatic{

    int fun(int n){
        
        if(n > 0){
            return fun(n-1)+n;
        }
        return 0;
    }

    public static void main(String[] args) {
        
    }
}