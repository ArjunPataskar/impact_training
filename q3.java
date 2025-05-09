import java.util.Scanner;
public class q3 {
   public static void main(String[] args) {
    System.out.println("Enter a number");
    Scanner sc = new Scanner(System.in);
    int a=sc.nextInt();
    int c=((a/10)%10);
    if (c%3==0){
        System.out.println("tready number");
    }
    else{
        System.out.println("not tready number");
    }
   } 
}

//if middle number divided by 3 then it is tready number atherwise not tready number
