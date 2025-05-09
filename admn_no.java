import java.util.Scanner;

public class admn_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        int originalNumber = number; 
        int reverse = 0;

        while (number != 0) {
            int digit = number % 10;    
            reverse = reverse * 10 + digit; 
            number = number / 10;        
        }

        System.out.println(reverse);
        int in_number=number*number;
        int sqr=reverse*reverse;
        
        

        //System.out.println(sqr);
    }
}
