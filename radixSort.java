package Sort;
import java.util.*;
public class radixSort {
    //print array
    static void print(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    //find max number
    static int findMax(int[] arr){
        int n=arr.length;
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>mx){
                mx=arr[i];
            }
        }
        return mx;
    }

    //count sort
    static void countSort(int[] arr,int inPlace){
        int n=arr.length;
        int[] output=new int[n];
        int[] count=new int[10];

        //make friquancy array
        for(int i=0;i<n;i++){
            count[(arr[i]/inPlace)%10]++;
        }

        //make prefix sum array
        for(int i=1;i<count.length;i++){
            count[i] += count[i-1];
        }

        //find the index of each elements in the original array & put it in output array
        for(int i=n-1;i>=0;i--){
            int idx=count[(arr[i]/inPlace)%10] -1;
            output[idx]=arr[i];
            count[(arr[i]/inPlace)%10]--;
        }

        //copy all the elements int out put array
        for(int i=0;i<n;i++){
            arr[i]=output[i];
        }
    }

    //radix sort 
    static void radixsort(int[] arr){
        int max =findMax(arr);
        for(int place=1;max/place>0; place *= 10){
            countSort(arr, place);
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

        radixsort(arr1);
        print(arr1);


    }
    
}
