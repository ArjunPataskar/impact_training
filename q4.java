import java.util.Scanner;
public class q4 {
    public static void main(String[] args) {
        System.out.println("Enter the forst number");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("Enter the second number");
        int b=sc.nextInt();
        for(int i=a;i<=b;i++){
            int digit1=i/10;
            int digit2=i%10;
            int sum=digit1+digit2;
            int product=digit1*digit2;
            if((sum+product)==i){
                System.out.println(i);
            }
        }
        }

    }

