//Try catch block
class H55{
    public static void main(String[] args){
        System.out.println("Program start");
        int a[] = new int[5];
        int x=10,y=0,z=0;
        try {
            z = x/y;
            a[5] = 10;
            System.out.println("Vaue of a[5] is :"+a[5]);
            
            System.out.println("Vaue of z is :"+z);
        } 
        catch (Exception e) {
            System.out.println("Error is :"+e);
        }
        
        System.out.println("Program stop");
    }
}
