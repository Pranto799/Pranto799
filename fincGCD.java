package Recursion;
import java.util.Scanner;
public class fincGCD {
    //print GCD
    static int GCD(int x,int y){
        if(y==0) return x;
        return GCD(y, x%y);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of x: ");
        int x=sc.nextInt();
        System.out.println("Enter the value of Y: ");
        int y=sc.nextInt();
       int ans= GCD(x, y);
        System.out.println("The answer is: "+ans);


    }
    
}
