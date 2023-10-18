//Write a program to calculate Simple Intrest using with agrument with return value
class Abc{
    double si;
    double disp(double p,double r,double n){
       return si = p*r*n/100;
    }
}
class H23{
    public static void main(String[] args) {
        double p,r,n;
        System.out.print("Enter Amount :");
        p = Double.parseDouble(System.console().readLine());
        System.out.print("Enter Rate :");
        r = Double.parseDouble(System.console().readLine());
        System.out.print("Enter Year :");
        n = Double.parseDouble(System.console().readLine());
        Abc a1 = new Abc();
        double si = a1.disp(p,r,n);
        System.out.println("Simple Intrest is :"+si);
    }
}
