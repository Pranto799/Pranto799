package multiDimentionArray;
import java.util.*;
public class spiralMatrix {

    //print Array
    static void printArray(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    //spiral Matrix
    static void spiral(int[][] arr,int r,int c){
        int terms=0;
        int toprow=0; int botomrow=r-1; int rightcolumn=c-1; int leftcolumn=0;
        while (terms<r*c) {
            //print top row
            for(int i=leftcolumn;i<=rightcolumn && terms<r*c;i++){
                System.out.print(arr[toprow][i]+" ");
                terms++;
            }
            toprow++;
            //print right column
            for(int j=toprow;j<=botomrow &&terms<r*c;j++){
                System.out.print(arr[j][rightcolumn]+" ");
                terms++;
            }
            rightcolumn--;
            //print botom row
            for(int i=rightcolumn;i>=leftcolumn && terms<r*c;i--){
                System.out.print(arr[botomrow][i]+" ");
                terms++;

            }
            botomrow--;
            //print left column
            for(int j=botomrow;j>=toprow && terms<r*c;j--){
                System.out.print(arr[j][leftcolumn]+" ");
                terms++;
            }
            leftcolumn++;
            
        }
        
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of row: ");
        int r=sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int c=sc.nextInt();
        int[][] arr1=new int[r][c];
       System.out.println("Enter "+r*c+" elements: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr1[i][j]=sc.nextInt();
            }
        }

        spiral(arr1, r, c);
    }
    
}
