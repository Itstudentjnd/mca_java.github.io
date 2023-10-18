//Write a program to calculate pi*r*r using no agrument no return value
class Abc{
    double r;
    void setdata(){
        System.out.print("Enter Radius :");
        r = Double.parseDouble(System.console().readLine());
    }
    void disp(){
        double ans = 3.14*r*r;
        System.out.println("pr*r*r is :"+ans);
    }
}
class H26{
    public static void main(String[] args) {
        Abc a1 = new Abc();
        a1.setdata();
        a1.disp();
    }
}
