class Vehical{
    void Features(){
        System.out.println("Name: Suzuki Fiero");
        System.out.println("Colour: Candy Red");
        System.out.println("CC: 150CC");
    }
}

class Car extends Vehical{
    void Attributes(){
        System.out.println("Name: Honda City");
        System.out.println("Coluer: Whight");
        System.out.println("CC : 1500");
    }
}

class Electricvehical extends Car{
    void Feature(){
        System.out.println("Name: Tata Nexon EV");
        System.out.println("Coluer: Red");
        System.out.println("Avarege: 350");
    }
}
public class multi_inheritance{
    public static void main(String[] args){
        Electricvehical s = new Electricvehical();
        s.Features();
        s.Attributes();
        s.Feature();
    }
}