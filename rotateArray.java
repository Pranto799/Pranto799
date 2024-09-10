//only for square matrix

package multiDimentionArray;

import java.util.Scanner;

public class rotateArray {
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
    static void reverse(int arr[]){
        int n=arr.length;
        int temp;
        for(int i=0;i<arr.length/2;i++){
            temp= arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
    }
}


    static void rotate(int[][] arr,int r,int c){
        transposeInPlace(arr, r, c);
        for(int i=0;i<arr.length;i++){
            reverse(arr[i]);
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
       rotate(arr1, r1, c1);
        printArray(arr1);
    }
}
