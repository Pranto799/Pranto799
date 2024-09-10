package Recursion;
import java.util.*;
public class findMaxInArray {

    static int findMax(int[] arr,int idx){
        if(idx==arr.length-1) return arr[idx];
        int smallans=findMax(arr, idx+1);
        return Math.max(arr[idx], smallans);
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

        int ans=findMax(arr1, 0);
        System.out.println("The max value of the array is: "+ans);

    }
    
}
