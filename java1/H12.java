//Write a program to calculate Simple Intrest using With agrument no return value
class Abc{
    
    void disp(double p,double r,double n){
        double si = p*r*n/100;
        System.out.println("Simple Intrest is :"+si);
    }
}
class H12{
    public static void main(String[] args) {
       
        double p,r,n;
        System.out.print("Enter Amount :");
        p = Double.parseDouble(System.console().readLine());
        System.out.print("Enter Rate :");
        r = Double.parseDouble(System.console().readLine());
        System.out.print("Enter Year :");
        n = Double.parseDouble(System.console().readLine());
        Abc a1 = new Abc();
        a1.disp(p,r,n);
    }
}
