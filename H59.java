//throws keyword

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class H59 {
    public static void main(String[] args)throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);

        System.out.print("Enter name :");
        String nm = br.readLine();
        System.out.println("Name is :"+nm);
    }
}
