package Recursion;
import java.util.*;
public class sumOfItsDigit {

    static int printSum(int n){
        if(n>=0 && n<=9) return n;

        return printSum(n/10) + n%10;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int n=sc.nextInt();
        int ans=printSum(n);
        System.out.println("The answer is:  "+ans);

    }
    
}
