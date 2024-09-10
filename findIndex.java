package Recursion;
import java.util.*;
public class findIndex {

    static int findIdx(int[] arr,int idx,int target ){
        if(idx>=arr.length) return -1;
        if(arr[idx]==target) return idx;
        return findIdx(arr, idx+1, target);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int size=sc.nextInt();
        int[] arr1=new int[size];
        System.out.println("Enter "+size+" elements: ");
        for(int i=0;i<arr1.length;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter the target: ");
        int tar=sc.nextInt();
        int ans=findIdx(arr1, 0, tar);
        System.out.println("The answer is: "+ans);
    }
    
}
