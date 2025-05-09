import java.util.Scanner;

public class reverserightangletrangle{
    public static void main(String[] args) {
        System.out.print("Enter the values of rows :");
        Scanner sc = new Scanner(System.in);
        int rows=sc.nextInt();
        

        for (int i =0; i <= rows; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            
            System.out.println();
        }
    }
}