//Write a program to print name and surname using Buffer reader class
import java.io.*;
class H3 {
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);

        System.out.print("Enter Name:");
        String fnm = br.readLine();

        System.out.print("Enter Surname:");
        String snm = br.readLine();

        System.out.println("Name is: "+fnm);
        System.out.println("Surname is: "+snm);
    }
}
