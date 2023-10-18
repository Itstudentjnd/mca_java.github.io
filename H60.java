//User define Exception
class InvalidAgeException extends Exception{
    public InvalidAgeException(String str){
        super(str);
    }
}

public class H60 {
    public static void main(String[] args) {
        int age = 25;
        try {
            if(age > 18){
                System.out.println("Welcome");
            }
            else{
                throw new InvalidAgeException("Not Valid...");
            }
        } catch (InvalidAgeException e) {
            System.out.println(e);
        }        
    }
}
