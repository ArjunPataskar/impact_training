import java.util.Scanner;

public class new1 {
    public static void main(String[] args) {    
        for(int i=1;i<=5;i++){
            System.out.println("Enter the value:");
            Scanner sc = new Scanner(System.in);
            int arr[i]=sc.nextInt();
            System.out.println(arr);
        }
    }
}
