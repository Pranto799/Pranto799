package ArrayList;
import java.util.ArrayList;
import java.util.Collections;
public class reverseArray2 {
    
   
        public static void main(String[] args) {
            ArrayList<Integer> li=new ArrayList<>();
            li.add(2);
            li.add(3);
            li.add(4);
            li.add(5);
            li.add(6);
            li.add(7);
            li.add(8);


            Collections.reverse(li);
            System.out.println(li);
    }
}
