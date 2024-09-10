package Recursion;
import java.util.*;
public class printArray {
    //print array
    static void printArr(int[] arr,int index){
        if(index==arr.length) return;

        System.out.print(arr[index]+" ");
        printArr(arr, index+1);
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

        printArr(arr1,0);

    }
    
}
