package Array;
import java.util.*;

public class arrayManipulation {
    static int myFun(int arr[],int n){
       
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){ 
                  arr[i]=-1;
                  arr[j]=-1;
                }
                
            }
        }
        int ans=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                ans=arr[i];
            }
        }
        return ans;
       
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size: ");
        int n=sc.nextInt();
        int[] arr1=new int[n];
        for(int i=0;i<arr1.length;i++){
            arr1[i]=sc.nextInt();
        }
        
       System.out.println("The answer is: "+ myFun(arr1, n));
    }
    
}
