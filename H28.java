//Switch case
public class H28 {
    public static void main(String[] args) {
        int ans,no1,no2,ch;
        System.out.print("Enter first no :");
        no1 = Integer.parseInt(System.console().readLine());
        System.out.print("Enter second no :");
        no2 = Integer.parseInt(System.console().readLine());
        System.out.println("ARITHMETIC OPERATION");
        System.out.println("1.          Add");
        System.out.println("2.          Sub");
        System.out.println("3.          Multi");
        System.out.println("4.          Divide");
        System.out.print("Enter your choise :");
        ch = Integer.parseInt(System.console().readLine());
        
        switch(ch){
            case 1:
                ans = no1 + no2;
                break;
            case 2:
                ans = no1 - no2;
                break;
            case 3:
                ans = no1 * no2;
                break;
            case 4:
                ans = no1 / no2;
                break;
            default:
                System.out.println("Wrong Choise");
                ans = 0;
        }
        System.out.println("Answer is :"+ans);
    }
}
