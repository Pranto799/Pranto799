package BinarySearch;
import java.util.*;
public class findIdxOfMin {

    static int findMin(int[] arr){
        int n=arr.length;
        int ans=Integer.MAX_VALUE;
        int start=0;
        int end=n-1;

        while (start<end) {
            int mid=(start+end)/2;
            if(arr[mid]<=arr[end]){ 
                ans=arr[mid];
               end=mid-1;
                
            }
            else{
                start=mid+1;
            }
            
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        int[] arr1=new int[size];
        System.out.println("Enter "+size+" elements: ");
        for(int i=0;i<size;i++){
            arr1[i]=sc.nextInt();
        }

        int answer=findMin(arr1);
        System.out.println("The minimun value is: "+answer);
    }
    
}
