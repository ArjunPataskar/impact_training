import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        System.out.println("Enter the four digit number");
        Scanner sc =  new Scanner(System.in);
        int a= sc.nextInt();
        int b= a/1000;
        int c=a%10;
        System.out.println(b+c);

       
    }
    
}