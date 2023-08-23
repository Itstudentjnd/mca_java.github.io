//write a program to create a class and pass name and age through argument
class Abc{
    String name;
    int agee;
    void setdata(String nm, int age){
        name = nm;
        agee = age;
    }
    void disp(){
        System.out.println("Name is :"+name);
        System.out.println("Age is :"+agee);
    }
}
public class H9 {
    public static void main(String[] args) {
        System.out.print("Enter Name:");
        String nm = System.console().readLine();
        System.out.print("Enter age:");
        int age = Integer.parseInt(System.console().readLine());

        Abc a1 = new Abc();
        a1.setdata(nm,age);
        a1.disp();
    }
}