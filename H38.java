//Example of static member method
class Abc{
    static int a = 0;
    static void setdata(){
        a++;
    }
    static void disp(){
        System.out.println("A is :"+a);
    }
}
public class H38 {
    public static void main(String[] args) {
        Abc.setdata();
        Abc.disp();

        Abc.setdata();
        Abc.disp();
    }
}
