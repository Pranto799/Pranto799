package Recursion;
import java.util.*;
public class chickPalindrome {

    static String reverse(String str,int idx){
        //base work
        if(idx==str.length()) return "";

        //recursive work
        String smallans=reverse(str, idx+1);
        char current=str.charAt(idx);

        //self work
        return smallans + current;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string: ");
        String str1=sc.nextLine();
        String rev=reverse(str1,0);

        if(rev.equals(str1)){
            System.out.println("The string is palindrome");
        }
        else {
            System.out.println("The string is not palinedrome");
        }

    }
    
}
