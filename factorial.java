package Recursion;
import java.util.Scanner;
public class factorial {

    static int fact(int n){
        if(n==1) return 1;
        
        return n*fact(n-1);
        
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int number=sc.nextInt();
        int answer=fact(number);
        System.out.println("The factorial of "+number+" is: "+answer);
    }
    
}
