import java.util.*;
public class H29 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int ans,no1,no2,ch;
        System.out.print("Enter first no :");
        no1 = Integer.parseInt(System.console().readLine());
        System.out.print("Enter second no :");
        no2 = Integer.parseInt(System.console().readLine());
        System.out.println("ARITHMETIC OPERATION");
        System.out.println("+.          Add");
        System.out.println("-.          Sub");
        System.out.println("*.          Multi");
        System.out.println("/.          Divide");
        System.out.print("Enter your choise :");
        ch = s1.next().charAt(0);
        switch(ch){
            case '+':
                ans = no1 + no2;
                break;
            case '-':
                ans = no1 - no2;
                break;
            case '*':
                ans = no1 * no2;
                break;
            case '/':
                ans = no1 / no2;
                break;
            default:
                System.out.println("Wrong Choise");
                ans = 0;
        }
        System.out.println("Answer is :"+ans);
    }
}
