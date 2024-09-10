package ArrayList;
import java.util.ArrayList;
import java.util.Collections;
public class printString {
    public static void main(String[] args) {
        ArrayList<String> li=new ArrayList<>();
        li.add("My");
        li.add("name");
        li.add("is Pranto");
        li.add("Mandal");

        //original string
        System.out.println("Orininal: "+li);

        //ascending order
        Collections.sort(li);
        System.out.println("Ascending: "+li);

        //decending order
        Collections.sort(li,Collections.reverseOrder());
        System.out.println("Decending: "+li);
        
    }
    
}
