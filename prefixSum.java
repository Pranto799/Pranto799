package multiDimentionArray;
import java.util.*;
public class prefixSum {

    static int pref(int[][] arr,int l1, int l2, int r1, int r2){

        int sum=0;
        for(int i=l1;i<=l2;i++){
            for(int j=r1;j<=r2;j++){
                sum +=arr[i][j];
            }
        }
        return sum;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of row : ");
        int r=sc.nextInt();
        System.out.println("Enter the number of column: ");
        int c=sc.nextInt();
        System.out.println("Enter "+r*c+" elements: ");
        int[][] arr1=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr1[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter l1 : ");
        int l1=sc.nextInt();
        System.out.println("Enter r1: ");
        int r1=sc.nextInt();
        System.out.println("Enter l2 greater than "+l1+" :");
        int l2=sc.nextInt();
        System.out.println("Enter r2 greater than "+r1+" : ");
        int r2=sc.nextInt();
        int ans=pref(arr1, l1, l2, r1, r2);
        System.out.println("The answer is: "+ans);
    }
    
}
