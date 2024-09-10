package BinarySearch;
import java.util.*;
public class chickElement {
    //check target
    static boolean chickTarget(int[] arr,int target){
        int n=arr.length;
        int start=0;
        int end=n-1;
        while (start<=end) {
        int mid=(start+end)/2;
        if(arr[mid]==target){
            return true;
        } 
        else if(arr[start]==arr[mid] && arr[end]==arr[mid]){
            start++;
            end--;
        } 
        else if(arr[mid]<=arr[end]){//mid to end is sorted

            if(arr[mid]<target && target<arr[end]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        } 
        else{
            if(target>=arr[start] && target<arr[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }         
        }
        return false;
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

        System.out.println("Enter target: ");
        int target=sc.nextInt();
        System.out.println(chickTarget(arr1, target));
    }
    
}
