class Employee{
    void DisplayInfo(){
        System.out.println("Name: Arjun");
        System.out.println("id: 123456");
        System.out.println("salary: 658852349854");
    }
}
class Manager extends Employee{
    void conductMeeting(){

    }
}
class Developer extends Employee{
    void WriteCode(){

    }
}
public class Single_inhe{
    public static void main(String[] args){
        Developer s = new Developer();
        s.DisplayInfo();
    }
}