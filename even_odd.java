import java.util.Scanner;
public class even_odd {
   public static void main(String[] args){
    System.out.println("Enter a single digit number");
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    if(a%2==0){
        System.out.println("It is even number");
    }
    if(a==0){
        System.out.println("Entered number is zero");
    }
    else{
        System.out.println("It is odd number");
    }
   }
}
