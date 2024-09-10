package Sort;
import java.util.*;
public class selectionSort {

    static void selectionsort(int[] arr){
        int n=arr.length;

        for(int i=0;i<n-1;i++){
            int min_value=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min_value]){
                    min_value=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min_value];
            arr[min_value]=temp;
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

        selectionsort(arr1);
        for(int i=0;i<size;i++){
            System.out.print(arr1[i]+" ");
        }

    }
    
}
