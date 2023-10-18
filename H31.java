//one dimentional array
public class H31 {
    public static void main(String[] args) {
        int a[] = new int[5];
        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter number :");
            a[i] = Integer.parseInt(System.console().readLine());  
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println("Number is :"+a[i]);   
        }
    }
}
