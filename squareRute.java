package BinarySearch;
import java.util.*;
public class squareRute {

    //find square rute
    static int squarerute(int x){
        int start=1;
        int end=x;
        int ans=-1;
        while (start<=end) {
            int mid=(start+end)/2;
            int value=mid*mid;
            if(value==x) return mid;
            else if(value<x){
                start=mid+1;
                ans=mid;
            }
            else{
                end=mid-1;
            }   
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        int answer=squarerute(n);
        System.out.println("The answer is: "+answer);
    }
    
}
