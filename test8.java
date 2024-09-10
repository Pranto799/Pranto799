package String;
import java.util.*;

public class test8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("The first name is: ");
        String name1=sc.nextLine();
        System.out.println("The second name ia: ");
        String name2=sc.nextLine();
        if(name1.equals(name2)){
            System.out.println("Strings are same");
        }
        else{
            System.out.println("Strings are not same");
        }

    }
    
}
