package exercise;
import java.util.*;
public class sum {
    static int printSum(int n){
        if(n==1) return 1;
        return printSum(n-1)+n;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int n=sc.nextInt();
        int ans=printSum(n);
        System.out.println(ans);
    }
    
}
