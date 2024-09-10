package Recursion;
import java.util.*;
public class power {
    static int pow(int p, int q){
        if(q==0) return 1;
        return pow(p, q-1)*p;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the base number(p): ");
        int p=sc.nextInt();
        System.out.println("Enter the power(q): ");
        int q=sc.nextInt();
        int ans=pow(p, q);
        System.out.println("THe answer is: "+ans);

    }
    
}
