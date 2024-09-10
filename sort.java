package exercise;
import java.util.*;
public class sort {
    static void print(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }

    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    
    // //bubble sort
    // static void bubble(int[] arr){
    //     for(int i=0;i<arr.length-1;i++){
    //         for(int j=0;j<arr.length-1-i;j++){
    //             if(arr[j]>arr[j+1]){
    //                 swap(arr, j, j+1);
    //             }
    //         }
    //     }

    //}

    // //selection sort
    // static void selection(int[] arr){
    //     int n=arr.length;
    //     for(int i=0;i<n;i++){
    //         int min_value=i;
    //         for(int j=i+1;j<n;j++){
    //             if(arr[j]<arr[min_value]){
    //                 min_value=j;
    //             }
    //         }
    //         swap(arr, i, min_value);
    //     }
    // }
   
    // //insertion
    // static void insertion(int[] arr){
    //     int n=arr.length;
    //     for(int i=0;i<n;i++){
    //         int j=i;
    //         while (j>0 && arr[j]<arr[j-1]) {
    //             swap(arr, j-1, j);
    //             j--;
                
    //         }
    //     }
    // }
    
    //merge
    static void merge(int[] arr,int l,int mid,int r){
        int n1=mid+1-l;
        int n2=r-mid;

        int[] left=new int[n1];
        int[] right=new int[n2];

        for(int i=0;i<n1;i++) left[i]=arr[i+l];
        for(int j=0;j<n2;j++) right[j]=arr[mid+1+j];

        int i=0;
        int j=0;
        int k=l;

        while (i<n1 && j<n2) {
            if(left[i]<=right[j]){
                arr[k]=left[i];
                k++;
                i++;
            }
            else{
               arr[k]=right[j];
               k++;
               j++;
            }
            
        }
        while (i<n1) {
            arr[k]=left[i];
            k++;
            i++;
            
        }

        while (j<n2) {
            arr[k]=right[j];
            k++;
            j++;
            
        }
    }
    //merge sort
    static void mergeSort(int[] arr,int l,int r){
        if(l>=r) return ;
        int mid=(l+r)/2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid+1, r);
        merge(arr,l,mid,r);
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

        // bubble(arr1);
        //selection(arr1);
        //insertion(arr1);
        mergeSort(arr1, 0, size-1);
        print(arr1);
    }
    
}
