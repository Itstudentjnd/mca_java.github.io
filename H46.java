//Multiple inheritance
interface A{
    void setdata();
}
class B{
    void dispB(){
        System.out.println("Class B Method");
    }
}
class C extends B implements A{
    void dispC(){
        System.out.println("Class C Method");
    }
    public void setdata(){
        System.out.println("Interface Set Data Method");
    }
}
public class H46 {
    public static void main(String[] args) {
        C c1 = new C();
        c1.setdata();
        c1.dispB();
        c1.dispC();
    }
}
