package Array;
import java.util.*;
public class reverseArray2 {
    static void reverse(int arr[]){
        int n=arr.length;
        int temp;
        for(int i=0;i<arr.length/2;i++){
            temp= arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
    }
    for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
    }
}
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       
        System.out.println("Enter size: ");
        int n=sc.nextInt();
        int[] arr1=new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        reverse(arr1);
    }
}
