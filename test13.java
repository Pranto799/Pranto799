package String;
import java.util.*;

public class test13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        String result="";
        for(int i=0;i<name.length();i++){
            if(name.charAt(i)=='e'){
                result += 'i';
            }
            else{
                result += name.charAt(i);
            }

        }
        System.out.println(result);
    }
}
