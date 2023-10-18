//class and object of non static method and member variable
class Abc{
    int a = 0;
    void setdata(){
        a++;
    }
    void disp(){
        System.out.println("A is :"+a);
    }
}
public class H36 {
    public static void main(String[] args) {
        Abc a1 = new Abc();
        a1.setdata();
        a1.disp();

        Abc a2 = new Abc();
        a2.setdata();
        a2.disp();
    }
}
