package Array;
import java.util.*;
public class checksort {

    static boolean myFun(int[] arr,int n){
        boolean check=true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                check=false;
                break;
            }
        }
        return check;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Is sorted: "+myFun(arr, size));

    }
    
}
