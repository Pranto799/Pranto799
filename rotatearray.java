package Array;
import java.util.*;

public class rotatearray {
    static void print(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void rotate(int[] arr, int k){
        int n = arr.length;
        k = k % n; // Ensure k is within the bounds of the array length
        int[] ans = new int[n];
        int j = 0;

        // Copy the last k elements to the beginning of the new array
        for(int i = n - k; i < n; i++){
            ans[j++] = arr[i];
        }

        // Copy the first n-k elements to the end of the new array
        for(int i = 0; i < n - k; i++){
            ans[j++] = arr[i];
        }

        // Print the rotated array
        print(ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter number of rotations: ");
        int k = sc.nextInt();

        rotate(arr, k);
    }
}
