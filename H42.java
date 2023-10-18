//Multilevel Inheritence
class vehical{
    String compnay,model,year;
    void vehical_getinfo(){
        compnay = "maruti";
        model = "basic";
        year = "2023";
    }
    void vehical_dispinfo(){
        System.out.println("company :"+compnay);
        System.out.println("model :"+model);
        System.out.println("year :"+year);
    }
}
class car extends vehical{
    String fule_type,color;
    void car_getinfo(){
        fule_type = "Petrol";
        color = "white";
    }
    void car_dispinfo(){
        System.out.println("Fule Type :"+fule_type);
        System.out.println("color :"+color);
    }
}
class sports_car extends car{
    int speed;
    void sportcar_getinfo(){
        speed = 240;
    }
    void sportcar_dispinfo(){
        System.out.println("Top speed :"+speed);
    }
}
public class H42 {
    public static void main(String[] args) {
        sports_car s1 = new sports_car();
        s1.vehical_getinfo();
        s1.car_getinfo();
        s1.sportcar_getinfo();
        s1.vehical_dispinfo();
        s1.car_dispinfo();
        s1.sportcar_dispinfo();
    }
}
