package Recursion;
import java.util.*;
public class findNumInArray {

    static boolean findNumber(int[] arr,int idx,int target){
      
        if(idx>=arr.length) return false;
        if(arr[idx]==target) return true;
        return findNumber(arr, idx+1, target);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int size=sc.nextInt();
        int[] arr1=new int[size];
        for(int i=0;i<arr1.length;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter the target: ");
        int tar=sc.nextInt();
      if(  findNumber(arr1, 0, tar)){
        System.out.println("Yes");
      }
      else{
        System.out.println("NO");
      }
    }
    
}
