//Method Overridding
class A{
    void disp(){
        System.out.println("Class A is super class");
    }
}
class B extends A{
    void disp(){
        super.disp();
        System.out.println("Class B is sub class");
    }
}
public class H52 {
    public static void main(String[] args) {
        B b1 = new B();
        b1.disp();
    }
}
