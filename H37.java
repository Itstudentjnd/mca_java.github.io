//Example of static member variable
class Abc{
    static int a = 0;
    void setdata(){
        a++;
    }
    void disp(){
        System.out.println("A is :"+a);
    }
}
public class H37 {
    public static void main(String[] args) {
        Abc a1 = new Abc();
        a1.setdata();
        a1.disp();

        Abc a2 = new Abc();
        a2.setdata();
        a2.disp();
    }
}
