package Recursion;
import java.util.*;
public class printSumOfArray {

    static int printSum(int[] arr,int idx){
        if(idx==arr.length-1) return arr[idx];
        int sum=printSum(arr, idx+1)+arr[idx];
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size: ");
        int n=sc.nextInt();
        int[] arr1=new int[n];
        System.out.println("Enter "+n+" elements: ");
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }

        int ans=printSum(arr1, 0);
        System.out.println("The max value of the array is: "+ans);

    }
    
}
