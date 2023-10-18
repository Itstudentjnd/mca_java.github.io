//interface
interface A{
    void setdata();
    void dispdata();
}
class B implements A{
    void dispB(){
        System.out.println("Class B Method");
    }
    public void setdata(){
        System.out.println("Interface set data Method");
    }
    public void dispdata(){
        System.out.println("Interface disp data Method");
    }
}
public class H45 {
    public static void main(String[] args) {
        B b1 = new B();
        b1.dispB();
        b1.setdata();
        b1.dispdata();
    }
}
