package Sort;
import java.util.*;
public class countSort {
    //print array
    static void print(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    //max number
    static int findmax(int[] arr){
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    //count sort
    static void countsort(int[] arr){
        int n=arr.length;
        int[] output=new int[n];
        //find the largest number
        int mx=findmax(arr);
        int[] count=new int[mx+1];

        //make friquency array
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }

        //make prefix sum array
        for(int i=1;i<count.length;i++){
            count[i] += count[i-1];
        }

        //find the index of each elements in the original array & put it in output array
        for(int i=n-1;i>=0;i--){
            int idx=count[arr[i]]-1;
            output[idx]=arr[i];
            count[arr[i]]--;
        }
        
        //copy the sorted array in the original array
        for(int i=0;i<n;i++){
            arr[i]=output[i];
        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        int[] arr1=new int[size];
        System.out.println("Enter "+size+" elements: ");
        for(int i=0;i<size;i++){
            arr1[i]=sc.nextInt();
           
        }

        countsort(arr1);
        print(arr1);


    }
}