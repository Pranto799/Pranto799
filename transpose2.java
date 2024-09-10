//only for square matrix

package multiDimentionArray;

import java.util.Scanner;

public class transpose2 {
    static void printArray(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void transposeInPlace(int[][] arr,int r,int c){
        for(int i=0;i<c;i++){
            for(int j=i;j<r;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
    }


     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        //1st matrix input
        System.out.println("Enter 1st row: ");
        int r1=sc.nextInt();
        System.out.println("Enter 1st colum: ");
        int c1=sc.nextInt();
        int[][] arr1=new int[r1][c1];
        System.out.println("Enter "+r1*c1+" elements: ");
        for(int i=0;i<r1;i++){//number of rows

            for(int j=0;j<c1;j++){//number of columns
                arr1[i][j]=sc.nextInt();

            }

        }
        transposeInPlace(arr1, r1, c1);
        printArray(arr1);
    }
}
