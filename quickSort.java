package Sort;
import java.util.*;

public class quickSort {
    static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int partition(int[] arr, int st, int end) {
        int pivot = arr[end];
        int i = st - 1;
        for (int j = st; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, end);
        return i + 1;
    }

    static void sort(int[] arr, int st, int end) {
        if (st < end) {
            int pi = partition(arr, st, end);
            sort(arr, st, pi - 1);
            sort(arr, pi + 1, end);
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

        sort(arr1, 0, size - 1);
        print(arr1);
    }
}
