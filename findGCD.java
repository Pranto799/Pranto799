package exercise;
import java.util.Scanner;

public class findGCD {
    static int GCD(int x,int y){
        int rem;
        while(x%y!=0){
            rem=x%y;
            x=y;
            y=rem;
        }
        return y;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of x: ");
        int x=sc.nextInt();
        System.out.println("Enter the value of y : ");
        int y=sc.nextInt();
        int ans=GCD(x, y);
        System.out.println("The answer is: "+ans);
    }
    
}
