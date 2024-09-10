package Array;
import java.util.*;
public class findSecondLarge {
    static int myFun(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            
        }
        return max;
    }
    static int myFun2(int arr[]){
        int max=myFun(arr);
        int secondmax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=max && arr[i]>secondmax){
                secondmax=arr[i];
            }
        }
        return secondmax;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size: ");
        int n=sc.nextInt();
        int[] arr1=new int[n];
        for(int i=0;i<arr1.length;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("The answer is: "+myFun2(arr1));
    }
    
}
