class Shape{
    void Attribute(){
        System.out.println("colour is red ");
        System.out.println("Area is 10");
    }
}
class Circle extends Shape{
    void Attributes(){
        System.out.println("Radius is 10");
    }
}
public class Single_inheritance{
    public static void main(String[] args){
        Circle s = new Circle();
        s.Attribute();
        s.Attributes();
    }
}
