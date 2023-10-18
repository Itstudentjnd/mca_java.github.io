//user input one dimentional array
public class H32 {
    public static void main(String[] args) {
        System.out.print("Enter Length  of Array :");
        int no = Integer.parseInt(System.console().readLine()); 
        int a[] = new int[no];
        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter number :");
            a[i] = Integer.parseInt(System.console().readLine());  
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println("Number is :"+a[i]);   
        }
    }
}
