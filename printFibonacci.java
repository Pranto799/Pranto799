package Recursion;
import java.util.*;
public class printFibonacci {

    static int   fibonacci(int n){
        if(n==1 || n==2) return 1;
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int n=sc.nextInt();
        int ans=fibonacci(n);
        System.out.println("The "+n+"th fibonacci number is: "+ans);



    }
}