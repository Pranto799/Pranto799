package exercise;

public class swap {
    static void swaping(int a,int b){
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }
    public static void main(String[] args) {
        int a=6;
        int b=9;
        swaping(a, b);
    }
    
}
