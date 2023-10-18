//Write a program to calculate pi*r*r using No agrument with return value
class Abc{
    double r,ans;
    void ins(){
        System.out.print("Enter Radius :");
        r = Double.parseDouble(System.console().readLine());
    }
    double disp(){
        ans = 3.14*r*r;
        return ans;
    }
}
class H24{
    public static void main(String[] args) {
        Abc a1 = new Abc();
        a1.ins();
        double ans = a1.disp();
        System.out.println("pi*r*r is :"+ans);
    }
}