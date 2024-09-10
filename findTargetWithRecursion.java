package BinarySearch;
import java.util.*;

public class findTargetWithRecursion {

    static boolean findTarget(int[] arr, int start, int end, int target) {
        if (start > end) return false;
        
        int mid = (start + end) / 2;
        
        if (arr[mid] == target) {
            return true;
        } else if (arr[mid] < target) {
            return findTarget(arr, mid + 1, end, target);
        } else {
            return findTarget(arr, start, mid - 1, target);
        }
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

        System.out.println("Enter target: ");
        int target = sc.nextInt();
        System.out.printf("%b", findTarget(arr1, 0, size - 1, target));
    }
}
