//Write a program to input 10 different int & calculate total and avg using with argument with return val
class Abc{
    int tot(int a[]){
        int i,tot=0;
        for(i=0;i<a.length;i++){
            tot = tot + a[i];
        }
        return tot;
    }
    double avg(int a[]){
        int i,tot=0;
        double avg;
        for(i=0;i<a.length;i++){
            tot = tot + a[i];
        }
        avg = tot / a.length;
        return avg;
    }
}
public class H13 {
    public static void main(String[] args) {
        int a[] = new int[10];
        int i;
        for(i=0;i<a.length;i++){
            System.out.print("Enter Number :");
            a[i] = Integer.parseInt(System.console().readLine());
        }
        Abc a1 = new Abc();
        int tot = a1.tot(a);
        System.out.println("Total is :"+tot);
        double avg = a1.avg(a);
        System.out.println("Avg is :"+avg);

    }
}
