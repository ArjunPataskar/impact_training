import java.util.Scanner;

public class trianglePattern {
    public static void main(String[] args) {
        System.out.print("Enter the values of rows :");
        Scanner sc = new Scanner(System.in);
        int rows=sc.nextInt();
        

        for (int i =1; i <= rows; i++) {
            for (int j = 1; j <=(rows-i); j++) {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}