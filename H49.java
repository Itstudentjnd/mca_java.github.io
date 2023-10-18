//Parameterized Constructor in Inheritance(Concept of Super Keyword)
class A{
    A(int a){
        System.out.println("Class A Constructor value is :"+a);
    }
}
class B extends A{
    B(int a,int b){
        super(a);
        System.out.println("Class B Constructor value is :"+b);
    }
}
public class H49 {
    public static void main(String[] args) {
        B b1 = new B(10,20);
    }
}
