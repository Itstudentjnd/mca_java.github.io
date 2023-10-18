//Method overloading 
class Xyz{
    void disp(String nm){
        System.out.println(""+nm);
    }
    void disp(){
        System.out.println("Output Aav Gya");
    }
    void disp(int a){
        System.out.println("Output is :"+a);
    }
}
public class H39 {
    public static void main(String[] args) {
        Xyz x1 = new Xyz();
        x1.disp("Hurry.....");
        x1.disp();
        x1.disp(10);
    }
}
