//Write a program to input 10 different int & calculate total and avg using with argument with return val
class Abc{
    
}
public class H14 {

    public static int tot(int a[]){
        int i,tot=0;
        for(i=0;i<a.length;i++){
            tot = tot + a[i];
        }
        return tot;
    }
    public static double avg(int a[]){
        int tot=tot(a);
        double avg;
        avg = (float)tot / a.length;
        return avg;
    }
    public static void main(String[] args) {
        int a[] = new int[10];
        int i;
        for(i=0;i<a.length;i++){
            System.out.print("Enter Number :");
            a[i] = Integer.parseInt(System.console().readLine());
        }
        
        int tot = tot(a);
        System.out.println("Total is :"+tot);
        double avg = avg(a);
        System.out.println("Avg is :"+avg);

    }
}
