package Recursion;
import java.util.*;
public class removeOccurence2 {

    static String remove(String str){
        //base case
        if(str.length()==0) return "";

        //recursive work
        String smallans=remove(str.substring(1));
        char current=str.charAt(0);

        //selfwork
        if(current != 'a'){
            return current + smallans;
        }
        else return smallans;


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string: ");
        String str1=sc.nextLine();
        System.out.println(remove(str1));
    }
    
}
