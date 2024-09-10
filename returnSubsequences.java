package Recursion;
import java.util.*;
public class returnSubsequences {

    static ArrayList<String> subsequence(String str){
        ArrayList<String> ans=new ArrayList<>();
        //base case
        if(str.length()==0){
            ans.add("");
            return ans;
        }

        //recursive work
        char current=str.charAt(0);
        ArrayList<String> smallans=subsequence(str.substring(1));
        
        //self work
        for(String ss:smallans){
            ans.add(ss);
            ans.add(current + ss);
        }
        return ans;
   
   
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string: ");
       String str1=sc.nextLine();
        ArrayList<String> answer=subsequence(str1);
        for(String ss:answer){
            System.out.println(ss);
        }
    }
    
}
