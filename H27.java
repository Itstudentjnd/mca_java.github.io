//Write a program to calculate Simple Intrest using with agrument with return value
class Abc{
    double ans;
    double disp(double r){
       return ans = 3.14*r*r;
    }
}
class H27{
    public static void main(String[] args) {
        double r;
        System.out.print("Enter Radius :");
        r = Double.parseDouble(System.console().readLine());
        Abc a1 = new Abc();
        double ans = a1.disp(r);
        System.out.println("pi*r*r is :"+ans);   
    }
}
