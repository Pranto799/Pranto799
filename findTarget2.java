package BinarySearch;
import java.util.*;

public class findTarget2 {

    static boolean findtarget(int[] arr, int target) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) return true;
            else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr1 = new int[size];
        System.out.println("Enter " + size + " elements: ");
        for (int i = 0; i < size; i++) {
            arr1[i] = sc.nextInt();
        }

        int target = 1;
        while (target != 10) {
            System.out.printf("%b \n", findtarget(arr1, target));
            target++;
        }
    }
}
