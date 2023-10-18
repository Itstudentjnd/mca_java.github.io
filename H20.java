//Non-Parameterized Constructor OR Default Constructor
class Abc{
    int a,b;
    Abc(){
        System.out.print("Enter value of A :");
        a = Integer.parseInt(System.console().readLine());
        System.out.print("Enter value of b :");
        b = Integer.parseInt(System.console().readLine());
    }
    void disp(){
        System.out.println("Value of a is :"+a);
        System.out.println("Value of b is :"+b);
    }
}
public class H20 {
    public static void main(String[] args) {
        Abc  a1 = new Abc();
        a1.disp();
        Abc  a2 = new Abc();
        a2.disp();
        Abc  a3 = new Abc();
        a3.disp();
    }
}
