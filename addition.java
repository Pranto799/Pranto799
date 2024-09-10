package multiDimentionArray;
import java.util.*;
public class addition {
    static void printArray(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void add(int[][] a,int r1,int c1,int[][] b,int r2,int c2){
        if(r1!=r2 || c1!=c2){
            System.out.println("Wrong input - the programe can not be run");
            return;
        }
        int[][] sum=new int[r1][c1];
        for(int i=0;i<r1;i++){//number of rows

            for(int j=0;j<c1;j++){//number of columns
                sum[i][j]=a[i][j]+b[i][j];

            }

        }
        System.out.println("The sum of two matrix: ");
        printArray(sum);
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
        add(arr1, r1, c1, arr2, r2, c2);
       
    }
}
