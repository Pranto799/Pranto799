package String;
import java.util.*;

public class test14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        String result="";
        for(int i=0;i<name.length();i++){
            if(name.charAt(i)=='@'){
                break;
            }
            else{
                result += name.charAt(i);
            }
        }
        System.out.println(result);
    }
}
