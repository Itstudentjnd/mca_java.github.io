//Write a program to calculate Simple Intrest using no agrument no return value
class Abc{
    double p,r,n;
    void setdata(){
        System.out.print("Enter Amount :");
        p = Double.parseDouble(System.console().readLine());
        System.out.print("Enter Rate :");
        r = Double.parseDouble(System.console().readLine());
        System.out.print("Enter Year :");
        n = Double.parseDouble(System.console().readLine());
    }
    void disp(){
        double si = p*r*n/100;
        System.out.println("Simple Intrest is :"+si);
    }
}
class H22{
    public static void main(String[] args) {
        Abc a1 = new Abc();
        a1.setdata();
        a1.disp();
    }
}
