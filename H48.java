//Constructor in Multilevel Inheritance
class A{
    A(){
        System.out.println("Class A Constructor");
    }
}
class B extends A{
    B(){
        System.out.println("Class B Constructor");
    }
}
class C extends B{
    C(){
        System.out.println("Class C Constructor");
    }
}
public class H48 {
    public static void main(String[] args) {
        C c1 = new C();
    }
}
