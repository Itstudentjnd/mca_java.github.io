//No argument no return value With use of  Userdefine class
class Abc {
    int a,b;//Memver Varialble
    void setdata(){
        //Member Method
        a=10;
        b=20;
    }
    void disp(){
        System.out.println("Value of A is: "+a);
        System.out.println("Value of B is: "+b);
    }
}
public class H7 {
    public static void main(String[] args) {
        Abc a1= new Abc();//Object of class Abc
        a1.setdata();
        a1.disp();
    }
}
