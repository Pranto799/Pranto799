package BinarySearch;
import java.util.*;

public class search2Dmatrix {

    static boolean findTarget(int[][] arr,int target){
        int n=arr.length;
        int m=arr[0].length;
        int i=0;
        int j=m-1;
        while (i<n && j>=0) {
            if(target==arr[i][j]) return true;
            else if(target>arr[i][j]){
                i++;
            }
            else{
                j--;
            }
            
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row: ");
        int r=sc.nextInt();
        System.out.println("Enter cols: ");
        int c=sc.nextInt();
        int[][] arr=new int[r][c];
        System.out.println("Enter "+r*c+" elements: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter target: ");
        int target=sc.nextInt();
        System.out.println(findTarget(arr, target));
    }
}
