//Constructor overloading
class Xyz{
    Xyz(){
        System.out.println("Hurry.....");
    }
    Xyz(String nm){
        System.out.println(""+nm);
    }
    Xyz(int a){
        System.out.println("Output is :"+a);
    }
}
public class H40 {
    public static void main(String[] args) {
        Xyz x1 = new Xyz();
        Xyz x2 = new Xyz("Output Aav Gya");
        Xyz x3 = new Xyz(10);
    }
}
