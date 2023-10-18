//Parameterized Constructor in Inheritance(Concept of This Keyword)
class A{
    int a;
    A(int a){
        this.a = a;
        System.out.println("Class A Constructor value is :"+a);
    }
}
class B extends A{
    int b;
    B(int b){
        super(b);
        this.b = b; 
        System.out.println("Class B Constructor value is :"+b);
    }
    int total(){
        return super.a + b;
    }
}
public class H50 {
    public static void main(String[] args) {
        B b1 = new B(10);
        System.out.println("Total is :"+b1.total());

    }
}
