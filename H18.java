/*Write a program to calculate paybill buy earning salary & calculate Hra,ma,ta,da & find gross salary & also dedag pf & it to calculate net salary using no argument with return value 
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
    double sal;
    double salary(){
        System.out.println("Enter Salary :");
        sal = Integer.parseInt(System.console().readLine()); 
        return sal;
    }
    double hra_calc(){
        return sal * 10/100;
    }
    double ma_calc(){
        return 500.00;
    }
    double ta_calc(){
        return sal * 7.5/100;
    }
    double da_calc(){
        return sal * 35/100;
    }
    double pf_calc(){
        if(sal >= 18000){
            return 1800.00;
        }
        else if(sal >= 12000){
            return 1500.00;
        }
        else if(sal >= 8000){
            return 1000.00;
        }
        else{
            return 0.0;
        }
    }
    double it_calc(double gs){
        return gs * 10/100;
    }
}
public class H18 {
    public static void main(String[] args) {
        

        Abc a1 = new Abc();
        double sal = a1.salary();
        double hra = a1.hra_calc();
        double ma = a1.ma_calc();
        double ta = a1.ta_calc();
        double da = a1.da_calc();
        double gs = sal+hra+ma+ta+da;
        double pf = a1.pf_calc();
        double it = a1.it_calc(gs);
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
