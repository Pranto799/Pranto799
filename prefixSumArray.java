package Array;
import java.util.*;
public class prefixSumArray {
    static void print(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int[] prefixSumArray(int[] arr){
        int n=arr.length;
        int[] prefix=new int[n];
        prefix[0]=arr[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        return prefix;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        System.out.println("Enter elements: ");
        for(int i = 0; i < n; i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("The answer is: ");
       int[] prefix=prefixSumArray(arr1);
        print(prefix);
    }
    
}
