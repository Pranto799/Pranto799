package Recursion;
import java.util.*;
public class kMultiples {

    static void multiple(int n,int k){
        if(k==1){
            System.out.print(n+" ");
            return ;
        }
       
       multiple(n,k-1);
       System.out.print(n*k+" ");
    
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n=sc.nextInt();
        System.out.println("Enter the value of k: ");
        int k=sc.nextInt();

        multiple(n, k);

    }
    
}

