package String;
import java.util.*;
public class test7 {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     String name=sc.nextLine();
     System.out.println(name);
     System.out.println("The length of the string is: ");
     System.out.println(name.length());
   for(int i=0;i<name.length();i++){
    System.out.println(name.charAt(i));
   }
    }
    
}
