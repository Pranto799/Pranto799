package Array;
import java.util.*;
public class reverseArray {
    static void reverse(int arr[]){
      int n=arr.length;
      int j=0;
      int[] ans=new int[n];
      for(int i=n-1;i>=0;i--){
        ans[j]=arr[i];
        j++;

      }
      for( j=0;j<n;j++){
        System.out.print(ans[j]+" ");
      }



    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size: ");
        int n=sc.nextInt();
        int[] arr1=new int[n];
        for(int i=0;i<arr1.length;i++){
            arr1[i]=sc.nextInt();
        }
        reverse(arr1);


    }
    
}
