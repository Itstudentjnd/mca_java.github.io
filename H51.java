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
    
}
class C extends B{
    int c;
    C(int c){
        super(c);
        this.c = c;
        System.out.println("Class A Constructor value is :"+c);
    }
    int total(){
        return super.a + super.b+c;
    }
}
public class H51 {
    public static void main(String[] args) {
        C c1 = new C(10);
        System.out.println("Total is :"+c1.total());

    }
}
