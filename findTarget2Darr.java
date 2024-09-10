package BinarySearch;
import java.util.*;
public class findTarget2Darr {

    static boolean findTarget(int[][] arr,int target){
        //n -->number of rows
        int n=arr.length;
        //m--> number of cols
        int m=arr[0].length;
        int start=0;
        int end=n*m-1;
        while (start<=end) {
            int mid=(start+end)/2;
            int midElt=arr[mid/m][mid%m];
            if(target==midElt) return true;
            else if(target>midElt){
                start=mid+1;
            }
            else{
                end=mid-1;
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
