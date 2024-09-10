package Recursion;
import java.util.*;
public class reverseString {

    static String reverse(String str,int idx){
        //base case
        if(idx>=str.length()) return "";

        //recursive work
        String smallans=reverse(str, idx+1);
        char current=str.charAt(idx);

        //self work
        return smallans+current;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string: ");
        String str1=sc.nextLine();
        System.out.println(reverse(str1,0));
    }
    
}
