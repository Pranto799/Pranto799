package Array;
import java.util.*;
public class repetedValue {
    static void myFun(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length-1;j++){
                if(arr[i]==arr[j]){
                    System.out.println("The repeted value is: "+arr[i]);
                    
                }

            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size: ");
        int size=sc.nextInt();
        int[] arr1=new int[size];
        for(int i=0;i<arr1.length;i++){
            arr1[i]=sc.nextInt();
        }
        myFun(arr1);



    }
    
}
