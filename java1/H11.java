//Write a program to calculate Simple Intrest using No agrument with return value
class Abc{
    double p,r,n,si;
    void ins(){
        System.out.print("Enter Amount :");
        p = Double.parseDouble(System.console().readLine());
        System.out.print("Enter Rate :");
        r = Double.parseDouble(System.console().readLine());
        System.out.print("Enter Year :");
        n = Double.parseDouble(System.console().readLine());
    }
    double disp(){
        si = p*r*n/100;
        return si;
    }
}
class H11{
    public static void main(String[] args) {
        Abc a1 = new Abc();
        a1.ins();
        double si = a1.disp();
        System.out.println("Simple Intrest is :"+si);
    }
}