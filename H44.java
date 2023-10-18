class A{
    int rno;
    String name,city,cno;
    void student_info(){
        System.out.print("Enter Roll no :");
        rno = Integer.parseInt(System.console().readLine());

        System.out.print("Enter Name :");
        name = System.console().readLine();
        
        System.out.print("Enter City :");
        city = System.console().readLine();

        System.out.print("Enter Contact no :");
        cno = System.console().readLine();
    }
    void student_dispinfo(){
        System.out.println("Roll no :"+rno);
        System.out.println("Name :"+name);
        System.out.println("City :"+city);
        System.out.println("Contact no :"+cno);
    }
}
class B extends A{
    int tot_mark,obt_mark;
    String result,subject;
    void exam_info(){
        System.out.print("Enter Subject :");
        subject = System.console().readLine();

        System.out.print("Enter Total Mark :");
        tot_mark = Integer.parseInt(System.console().readLine());
        
        System.out.print("Enter Obtain Mark :");
        obt_mark = Integer.parseInt(System.console().readLine());

        System.out.print("Enter Result :");
        result = System.console().readLine();
    }
    void exam_dispinfo(){
        System.out.println("Roll no :"+rno);
        System.out.println("Subject :"+subject);
        System.out.println("Total mark :"+tot_mark);
        System.out.println("Obtain mark :"+obt_mark);
        System.out.println("Result :"+result);
    }
}
class C extends B{
    String game,achiv;
    void sports_info(){
        System.out.print("Enter Game :");
        game = System.console().readLine();

        System.out.print("Enter Achivement :");
        achiv = System.console().readLine();
    }
    void sports_dispinfo(){
        System.out.println("Roll no :"+rno);
        System.out.println("Game :"+game);
        System.out.println("Achivement :"+achiv);
        System.out.println("Result :"+result);
    }
}
public class H44 {
    public static void main(String[] args) {
        C c1 = new C();
        c1.student_info();
        c1.exam_info();
        c1.sports_info();
        c1.student_dispinfo();
        c1.exam_dispinfo();
        c1.sports_dispinfo();
    }
}
