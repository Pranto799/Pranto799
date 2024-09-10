package multiDimentionArray;
import java.util.*;

public class generateSpiral {
    // Print Array
    static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Spiral Matrix
    static int[][] spiral(int n) {
        int[][] matrix = new int[n][n];
        int curnt = 1;
        int toprow = 0, botomrow = n - 1, leftcolumn = 0, rightcolumn = n - 1;

        while (curnt <= n * n) {
            // Print top row
            for (int i = leftcolumn; i <= rightcolumn && curnt <= n * n; i++) {
                matrix[toprow][i] = curnt;
                curnt++;
            }
            toprow++;

            // Print right column
            for (int j = toprow; j <= botomrow && curnt <= n * n; j++) {
                matrix[j][rightcolumn] = curnt;
                curnt++;
            }
            rightcolumn--;

            // Print bottom row
            for (int i = rightcolumn; i >= leftcolumn && curnt <= n * n; i--) {
                matrix[botomrow][i] = curnt;
                curnt++;
            }
            botomrow--;

            // Print left column
            for (int j = botomrow; j >= toprow && curnt <= n * n; j--) {
                matrix[j][leftcolumn] = curnt;
                curnt++;
            }
            leftcolumn++;
        }
        return matrix;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        int[][] ans = spiral(n);
        printArray(ans);
    }
}
