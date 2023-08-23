//Write a program to print Student Name,age and city with use of scanner class

import java.util.*;
public class H5 {
    public static void main(String[] args){
        Scanner s1 = new Scanner(System.in);

        System.out.print("Enter Name:");
        String snm = s1.nextLine();

        System.out.print("Enter age:");
        int age = Integer.parseInt(s1.nextLine());

        System.out.print("Enter Your City:");
        String ct = s1.nextLine();

        System.out.println("Name is: "+snm);
        System.out.println("Age is: "+age);
        System.out.println("City is: "+ct);
    }
}
