//Parameterized Constructor
class Abc{
    int a,b;
    /*Abc(){
        System.out.print("Enter value of A :");
        a = Integer.parseInt(System.console().readLine());
        System.out.print("Enter value of b :");
        b = Integer.parseInt(System.console().readLine());
    }*/
    Abc(int i,int j){
        a = i;
        b = j;
    }
    void disp(){
        System.out.println("Value of a is :"+a);
        System.out.println("Value of b is :"+b);
    }
}
public class H19 {
    public static void main(String[] args) {
        Abc  a1 = new Abc(10,20);
        a1.disp();
        Abc  a2 = new Abc(30,40);
        a2.disp();
        Abc  a3 = new Abc(50,60);
        a3.disp();
    }
}
