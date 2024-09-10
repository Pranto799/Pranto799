package Sort;
import java.util.*;
public class bubbleSort {
    static void increasing(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size: ");
        int size=sc.nextInt();
        System.out.println("Enter "+size+" elements: ");
        int[] arr1=new int[size];
        for(int i=0;i<size;i++){
            arr1[i]=sc.nextInt();
        }
        increasing(arr1);
        for(int i=0;i<size;i++){
            System.out.print(arr1[i]+" ");
        }

        


    }
    
}
