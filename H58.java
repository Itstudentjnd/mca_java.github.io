//Try catch Finally block
class H58{
    public static void main(String[] args){
        System.out.println("Program start");
        int a[] = new int[5];
        int x=10,y=0,z=0;
        try {
            a[5] = 10;
            z = x/y;
            System.out.println("Vaue of a[5] is :"+a[5]);
            System.out.println("Vaue of z is :"+z);
        } 
        catch (ArithmeticException e) {
            System.out.println("Error is :"+e);
        }
        finally{
            System.out.println("Program stop");
        }
    }
}
