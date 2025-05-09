import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        System.out.println("Enter the 3 digit number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b=a/1000;
        int c=((a/10)%10);
        int d=a%10;
        System.err.println(b+c+d);

    }
}
