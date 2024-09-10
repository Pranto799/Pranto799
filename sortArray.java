package ArrayList;
import java.util.ArrayList;
import java.util.Collections;
public class sortArray {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(2);
        list.add(9);
        list.add(1);
        list.add(7);

        //original array
        System.out.println("Original array : "+list);

        //sort in Ascending order
        Collections.sort(list);
        System.out.println("Ascending order: "+list);

        //sort in decending order
         Collections.sort(list,Collections.reverseOrder());
        System.out.println("Decending order: "+list);
        
    }
}
