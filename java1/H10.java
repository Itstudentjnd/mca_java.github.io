//Write a program to input Rollno,name,three subject mark and return total and percentage from stud class
class Stud{
    int rno,m1,m2,m3,tot;
    String nm;
    double per;
    void setdata(int rno,String nm,int m1,int m2,int m3){
        this.rno = rno;
        this.nm = nm;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        tot = m1 + m2 + m3;
        per = tot / 3;
    }
    void disp(){
        System.out.println("Roll no is :"+rno);
        System.out.println("Name is :"+nm);
        System.out.println("Mark 1 is :"+m1);
        System.out.println("Mark 2 is :"+m2);
        System.out.println("Mark 3 is :"+m3);
    }
    int gettot(){
        return tot;
    }
    double getper(){
        return per;
    }
}
public class H10 {
    public static void main(String[] args) {
        
        System.out.print("Enter Roll no :");
        int rno = Integer.parseInt(System.console().readLine());
        System.out.print("Enter Name :");
        String nm = System.console().readLine();
        System.out.print("Enter Subject mark-1 :");
        int m1 = Integer.parseInt(System.console().readLine());
        System.out.print("Enter Subject mark-2 :");
        int m2 = Integer.parseInt(System.console().readLine());
        System.out.print("Enter Subject mark-3 :");
        int m3 = Integer.parseInt(System.console().readLine());
        
        Stud s1 = new Stud();
        s1.setdata(rno,nm,m1,m2,m3);
        s1.disp();
        System.out.println("Total is :"+s1.gettot());
        System.out.println("Percentage is :"+s1.getper());
        
    }
}
