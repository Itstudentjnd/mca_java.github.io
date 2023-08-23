//write a program to create a class and pass name and age through argument
class Abc{
    void setdata(String nm, int age){
        System.out.println("Name is :"+nm);
        System.out.println("Age is :"+age);
    }
}
public class H8 {
    public static void main(String[] args) {
        System.out.print("Enter Name:");
        String nm = System.console().readLine();
        System.out.print("Enter age:");
        int age = Integer.parseInt(System.console().readLine());

        Abc a1 = new Abc();
        a1.setdata(nm,age);
    }
}
