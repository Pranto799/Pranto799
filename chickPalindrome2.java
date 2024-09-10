package Recursion;
import java.util.*;
public class chickPalindrome2 {
    static boolean isPalindrome(String str,int s,int l){
       //base case
        if(s>=l) return true;

        //recursive work & self work
        return (str.charAt(s)==str.charAt(l) && isPalindrome(str, s+1, l-1));


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string: ");
        String str1=sc.nextLine();

        System.out.println(isPalindrome(str1, 0, str1.length()-1));

    }
    
}
