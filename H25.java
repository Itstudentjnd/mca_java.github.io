//Write a program to calculate pi*r*r using With agrument no return value
class Abc{
    
    void disp(double r){
        double ans = 3.14*r*r;
        System.out.println("pi*r*r is :"+ans);
    }
}
class H25{
    public static void main(String[] args) {
       
        double r;
        System.out.print("Enter Radius :");
        r = Double.parseDouble(System.console().readLine());
        Abc a1 = new Abc();
        a1.disp(r);
    }
}
