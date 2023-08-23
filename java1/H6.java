//Write a program to print Student Name,age and city with use of Console Method

public class H6 {
    public static void main(String[] args) {

        System.out.print("Enter Name:");
        String snm = System.console().readLine();

        System.out.print("Enter age:");
        int age = Integer.parseInt(System.console().readLine());

        System.out.print("Enter Your City:");
        String ct = System.console().readLine();

        System.out.println("Name is: "+snm);
        System.out.println("Age is: "+age);
        System.out.println("City is: "+ct);
    }
}
