package String;
import java.util.*;

public class test4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String fullname=sc.nextLine();
        System.out.println(fullname.length());
        //charAt
        for(int i=0;i<fullname.length();i++){
            System.out.println(fullname.charAt(i));
        }
    }
    
}
