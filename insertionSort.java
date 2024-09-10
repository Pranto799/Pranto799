package Sort;
import java.util.*;

public class insertionSort {

    static void insertion(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int j = i;

            while (j > 0 && arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
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

        insertion(arr1);
        System.out.print("Sorted array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}
