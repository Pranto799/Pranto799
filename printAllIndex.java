package Recursion;
import java.util.*;
public class printAllIndex {
    static void printIndex(int[] arr,int idx,int target){
        if(idx>=arr.length) return ;
        if(arr[idx]==target){
            System.out.print(idx+" ");
        }
        printIndex(arr, idx+1, target);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();
        int[] arr1=new int[n];
        System.out.println("Enter "+n+" elements: ");
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter target: ");
        int target=sc.nextInt();
        printIndex(arr1, 0, target);

    }
    
}
