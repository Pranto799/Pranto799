package String;
import java.util.*;

public class test18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       StringBuilder name=new StringBuilder("Pranto Mandal");
        
       //insert
       name.insert(0,'S');
       System.out.println(name);

       //delete
       name.delete(0,7);
       System.out.println(name);
    }
    
}
