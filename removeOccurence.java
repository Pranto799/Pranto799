package Recursion;
import java.util.*;
public class removeOccurence {
    static String remove(String str,int idx){
        //base
        if(idx>=str.length()) return "";

        //recursive work
        String smallans=remove(str, idx+1);
        char current=str.charAt(idx);

        //self work
        if(current != 'a'){
            return current + smallans;
        }
        else return smallans;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string: ");
        String str1=sc.nextLine();
        System.out.println(remove(str1,0));
    }
    
}
