package Sort;

import java.util.ArrayList;
import java.util.Collections;

public class bucketSort {

    static void bucketSort(float[] arr) {
        int n = arr.length;
        // Create buckets
        ArrayList<Float>[] buckets = new ArrayList[n];

        // Initialize empty buckets
        for (int i = 0; i < n; i++) {
            buckets[i] = new ArrayList<>();
        }

        // Add elements into the buckets
        for (int i = 0; i < n; i++) {
            int bucketIndex = (int) (arr[i] * n); // Calculate bucket index
            buckets[bucketIndex].add(arr[i]);
        }

        // Sort each bucket individually
        for (int i = 0; i < buckets.length; i++) {
            Collections.sort(buckets[i]);
        }

        // Merge all buckets to get the final sorted array
        int index = 0;
        for (int i = 0; i < buckets.length; i++) {
            for (float value : buckets[i]) {
                arr[index++] = value;
            }
        }
    }

    public static void main(String[] args) {
        float[] arr = {0.42f, 0.32f, 0.23f, 0.52f, 0.25f, 0.47f, 0.51f};
        bucketSort(arr);

        System.out.println("Sorted array: ");
        for (float value : arr) {
            System.out.print(value + " ");
        }
    }
}
