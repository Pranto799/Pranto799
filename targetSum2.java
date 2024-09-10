package Array;
import java.util.*;

public class targetSum2 {
    static int myFun(int[] arr,int size , int target){
        int ans=0;
        for(int i=0;i<size-1;i++){
            for(int j=i+1;j<size-1;j++){
                for(int k=j+1;k<size-1;k++){
                    if(arr[i]+arr[j]+arr[k]==target){
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size: ");
        int n=sc.nextInt();
        int[] arr1=new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter target: ");
        int target=sc.nextInt();
        int answer=myFun(arr1,n,target);
        System.out.println("The answer is: "+answer);

    }
    
}
