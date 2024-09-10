package multiDimentionArray;
import java.util.*;
public class transpose {
    static void printArray(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    //transpose matrix
    static int[][] trans(int[][] a,int r,int c){
        int[][] ans=new int[c][r];
                for(int i=0;i<c;i++){
                    for(int j=0;j<r;j++){
                        ans[i][j]=a[j][i];
                    }
                }
                return ans;
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
    int[][] transposeMarix=trans(arr1, r1, c1);
    System.out.println("The transpose matrix : ");
    printArray(transposeMarix);
       
    }
    
}
