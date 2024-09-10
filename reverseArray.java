package ArrayList;
import java.util.ArrayList;
public class reverseArray {

    static void reverselist(ArrayList<Integer> list){
        int i=0;
        int j=list.size()-1;
        while (i<j) {

            Integer temp=list.get(i);
            list.set(i,list.get(j));
            list.set(j,temp);

            i++;
            j--;
            
        }
    }
   public static void main(String[] args) {
    ArrayList<Integer> li=new ArrayList<>();
    li.add(2);
    li.add(3);
    li.add(4);
    li.add(5);
    li.add(6);
    li.add(7);
    li.add(8);
    System.out.println(li.get(0));
    reverselist(li);
    System.out.println(li);

   }
    
    
}
