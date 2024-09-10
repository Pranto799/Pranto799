package Array;
import java.util.*;

public class test2 {
    static void myFun(int arr[],int n){
        int num=0;
        for(int i=0;i<arr.length;i++){
            if(n==arr[i]){
                num=i;

            }
        }
        System.out.println(num);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value: ");
        int n=sc.nextInt();
        int[] arr1={3,5,6,3,7};
        myFun(arr1, n);

    }
}
