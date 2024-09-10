package Array;
import java.util.*;
public class test1 {
    static void myFun(int arr[], int n){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(n==arr[i]){
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       
        System.out.println("Enter number: ");
        int n=sc.nextInt();
        int[] arr1=new int[14];
        arr1[0]=2;
        arr1[1]=3;
        arr1[2]=4;
        arr1[3]=9;
        arr1[4]=4;
        arr1[5]=2;
        arr1[6]=4;
        arr1[7]=8;
        arr1[8]=5;
        arr1[9]=4;
        arr1[10]=4;
        arr1[11]=4;
        arr1[12]=8;
        arr1[13]=4;
        myFun(arr1, n);
    }
}