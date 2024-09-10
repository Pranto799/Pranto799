package Sort;
import java.util.*;

public class mergeSort {
    static void merge(int[] arr,int l,int mid,int r){
        int n1=mid-l+1;
        int n2=r-mid;
        int[] left=new int[n1];
        int[] right=new int[n2];

        for(int i=0;i<n1;i++) left[i]=arr[l+i];
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

    static void sort(int[] arr,int l,int r){
        if(l>=r) return;
        int mid=(l+r)/2;
        sort(arr,l,mid);
        sort(arr,mid+1,r);
        merge(arr,l,mid,r);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        int[] arr1=new int[size];
        System.out.println("Enter "+size+" elements: ");
        for(int i=0;i<size;i++){
            arr1[i] =sc.nextInt();

        }
        sort(arr1, 0, size-1);
        System.out.println("The answer is: ");
        for(int i=0;i<size;i++){
            System.out.print(arr1[i]+" ");
        }
    }
    
}
