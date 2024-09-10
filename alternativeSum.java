package Recursion;
import java.util.*;
public class alternativeSum {

    //Alternative sum
    static int sum(int n){
        if(n==0) return 0;
        if(n%2!=0){//odd number
            return sum(n-1)+n;

        }
        else{//even number
            return sum(n-1) - n;

        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int n=sc.nextInt();
        int ans=sum(n);
        System.out.print("the answer is: "+ans);
    }
    
}
