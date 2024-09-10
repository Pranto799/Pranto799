package Recursion;
import java.util.*;
public class returnSubsequence2 {
    static void subsequence(String str, String curntans){
        if(str.length()==0){
            System.out.println(curntans);
            return ;
        }
        char curr=str.charAt(0);
        String restring=str.substring(1);
        subsequence(restring, curntans+curr);
        subsequence(restring, curntans);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string: ");
       String str1=sc.nextLine();
       subsequence(str1, "");
    }
    
}
