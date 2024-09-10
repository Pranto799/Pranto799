package Recursion;
import java.util.*;
public class printArraylistOfIdx {

    static ArrayList<Integer> printIndex(int[] arr,int idx,int target){
        ArrayList<Integer> ans=new ArrayList<>();
        if(idx>=arr.length) return ans;
        if(arr[idx]==target) {
            ans.add(idx);
        }
        ArrayList<Integer> smallans=printIndex(arr, idx+1, target);
        ans.addAll(smallans);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();
        int[] arr1=new int[n];
        System.out.println("Enter "+n+" elements: ");
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter the target: ");
        int target=sc.nextInt();
       ArrayList<Integer> answer= printIndex(arr1, 0, target);
        System.out.println(answer);

    }
    
}
