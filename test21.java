package String;
import java.util.*;
public class test21{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder name=new StringBuilder("Pranto");

        for(int i=0;i<name.length()/2;i++){
            int front=i;
            int back=name.length()-i-1;

            char frontChar=name.charAt(front);
            char backChar=name.charAt(back);

            name.setCharAt(front,backChar);
            name.setCharAt(back,frontChar);
        }
        System.out.println(name);
    }

}