package multiDimentionArray;
import java.util.*;

public class prefixSum2 {

    static void findPrefixSumMatrix(int[][] arr) {
        int r = arr.length;
        int c = arr[0].length;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (i > 0) arr[i][j] += arr[i-1][j];
                if (j > 0) arr[i][j] += arr[i][j-1];
                if (i > 0 && j > 0) arr[i][j] -= arr[i-1][j-1];
            }
        }
    }

    static int printSum(int[][] arr, int l1, int l2, int r1, int r2) {
        findPrefixSumMatrix(arr);
        int sum = arr[l2][r2];
        if (l1 > 0) sum -= arr[l1-1][r2];
        if (r1 > 0) sum -= arr[l2][r1-1];
        if (l1 > 0 && r1 > 0) sum += arr[l1-1][r1-1];
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int r = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int c = sc.nextInt();
        System.out.println("Enter " + r * c + " elements: ");
        int[][] arr1 = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter l1: ");
        int l1 = sc.nextInt();
        System.out.println("Enter r1: ");
        int r1 = sc.nextInt();
        System.out.println("Enter l2 greater than " + l1 + ": ");
        int l2 = sc.nextInt();
        System.out.println("Enter r2 greater than " + r1 + ": ");
        int r2 = sc.nextInt();
        int ans = printSum(arr1, l1, l2, r1, r2);
        System.out.println("The answer is: " + ans);
    }
}
