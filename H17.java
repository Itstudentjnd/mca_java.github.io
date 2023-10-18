/*Write a program to calculate paybill buy earning salary & calculate Hra,ma,ta,da & find gross salary & also dedag pf & it to calculate net salary using with argument no return value 
 * hra = 10%
 * ma = 500
 * ta = 1.5%
 * da = 35%
 * ---------
 * pf = 8000 >= 1000
 *      12000 >= 1500
 *      18000 >= 1800
 * it = 10% of gross salary
 */

class Abc{
    double sal,pf;
    void salary(double sal){
         
        this.sal = sal;
        double hra = sal * 10/100;
        double ma = 500.00;
        double ta = sal * 7.5/100;
        double da = sal * 35/100;
        double gs = sal+hra+ma+ta+da;
        if(sal >= 18000){
            pf = 1800.00;
        }
        else if(sal >= 12000){
            pf =  1500.00;
        }
        else if(sal >= 8000){
            pf = 1000.00;
        }
        else{
            pf = 0.0;
        }
        double it = sal * 10/100;
        double ns = gs-pf-it;

        System.out.println("Salary   :"+sal);
        System.out.println("HRA      :"+hra);
        System.out.println("MA       :"+ma);
        System.out.println("TA       :"+ta);
        System.out.println("DA       :"+da);
         System.out.println("------------");
        System.out.println("GS       :"+gs);
        System.out.println("------------");
        System.out.println("PF       :"+pf);
        System.out.println("IT       :"+it);
        System.out.println("NS       :"+ns);
    }
    
}
public class H17 {
    public static void main(String[] args) {
        
        System.out.println("Enter Salary :");
        double sal = Integer.parseInt(System.console().readLine());
        Abc a1 = new Abc();
        a1.salary(sal);    
    }
}