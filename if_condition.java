import java.util.Scanner;
public class if_condition {
    public static void main(String[] args) {

        System.out.println("Enter a value");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n==0){
            System.out.println("it is odd number");
        }
        if (n==2&&n>=2&&n<=5){
            System.out.println("not wierd");
        }
        if (n==2&&n>=6&&n<=20){
            System.out.println("wiered");
        }


    }
}
