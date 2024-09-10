package Array;
import java.util.*;


public class findSecondSmallest {
    static int myFun(int arr[]){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    static int myFun2(int arr[]){
        int min=myFun(arr);
        int secondsmallest=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(min!=arr[i] && secondsmallest>arr[i]){
                secondsmallest=arr[i];
            }
        }
        return secondsmallest;

    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size: ");
        int n=sc.nextInt();
        int[] arr1=new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }

        System.out.println("The answer is: "+myFun2(arr1));

    }
    
}
