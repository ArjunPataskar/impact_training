import java.util.Scanner;

public class kaprekar_no {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int sqr = a*a;

        int count = 0, num = a;
        for (; num != 0; num /= 10, ++count){}
        int power=(int)Math.pow(10,count);
        int left=sqr/power;
        int right=sqr%power;
        int sum=left+right;
        if(sum==a){
            System.out.println("kaprekar number");
        }
        else{
            System.out.println("Not kaprekar number");
        }

    }
}
