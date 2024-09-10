package multiDimentionArray;
import java.util.*;
public class multification {

    static void printArray(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void multi(int[][] a,int r1,int c1,int[][] b,int r2,int c2){
        if(c1!=r2){
            System.out.println("Wrong inpuut - The programe can not be run");
        }
        
        int[][] mul=new int[r1][c2];

        for(int i=0;i<r1;i++){//number of rows
            for(int j=0;j<c2;j++){//number of columns
                for(int k=0;k<c1;k++){
                    mul[i][j] += (a[i][k]*b[k][j]);
                }

            }

        }
        printArray(mul);
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows: ");
        int r1=sc.nextInt();
        System.out.println("Enter colums : ");
        int c1=sc.nextInt();
        int[][] arr1=new int[r1][c1];
        System.out.println("Enter "+r1*c1+" Elements: ");
        for(int i=0;i<r1;i++){//rows
            for(int j=0;j<c1;j++){//columns
                arr1[i][j]=sc.nextInt();

            }

        }


        //2nd matrix
        System.out.println("Enter 2nd rows: ");
        int r2=sc.nextInt();
        System.out.println("Enter 2nd colums : ");
        int c2=sc.nextInt();
        int[][] arr2=new int[r2][c2];
        System.out.println("Enter "+r2*c2+" Elements: ");
        for(int i=0;i<r2;i++){//rows
            for(int j=0;j<c2;j++){//columns
                arr2[i][j]=sc.nextInt();

            }

        }
        multi(arr1, r1, c1, arr2, r2, c2);
        
       
    }
    
}
