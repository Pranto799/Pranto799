package BinarySearch;
import java.util.*;
public class returnIdxOfTarget {

    static int targetIdx(int[] arr,int target){

        int n=arr.length;
        int start=0;
        int end=n-1;
        while (start<=end) {
            int mid=(start+end)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<arr[end]){//mid to end is sorted
                if(target>arr[mid] && target<=arr[end]){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }

            }
            else{//start to mid is sorted
                if(target<arr[mid] && target>=arr[start]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        int[] arr1=new int[size];
        System.out.println("Enter "+size+" elements: ");
        for(int i=0;i<size;i++){
            arr1[i] =sc.nextInt();
        }

        System.out.println("Enter target:  " );
        int target=sc.nextInt();
        int answer=targetIdx(arr1, target);
        System.out.println("The answer is: "+answer);
    }
    
}
