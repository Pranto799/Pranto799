package exercise;
class Algebra{
    int a=5;
    int b=7;
    int add(){
        int ans=a+b;
        return ans;
    }
    int divid(){
        int ans=a/b;
        return ans;
    }
    int multi(){
        int ans=a*b;
        return ans;
    }
}

public class methord {
    public static void main(String[] args) {
        Algebra obj1=new Algebra();
        System.out.println(obj1.multi());
        
        
    }
    
}
