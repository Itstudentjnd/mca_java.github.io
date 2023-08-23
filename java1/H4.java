//Write a program to print Student Name,age and city with use of buffer reader class

import java.io.*;
public class H4 {
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);

        System.out.print("Enter Name:");
        String snm = br.readLine();

        System.out.print("Enter age:");
        int age = Integer.parseInt(br.readLine());

        System.out.print("Enter Your City:");
        String ct = br.readLine();

        System.out.println("Name is: "+snm);
        System.out.println("Age is: "+age);
        System.out.println("City is: "+ct);
    }
}
