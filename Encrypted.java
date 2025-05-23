import java.util.Scanner;

public class Encrypted{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Please enter a non-negative integer.");
            return;
        }

        if (n == 0) {
            System.out.println(0);
            return;
        }

        String numStr = String.valueOf(n);
        int length = numStr.length();
        int[] digits = new int[length];

        for (int i = 0; i < length; i++) {
            digits[i] = numStr.charAt(i) - '0';
        }

        for (int i = 0; i < length - 1; i += 2) {
            int temp = digits[i];
            digits[i] = digits[i + 1];
            digits[i + 1] = temp;
        }

        int result = 0;
        for (int i = 0; i < length; i++) {
            result = result * 10 + digits[i];
        }
        System.out.println("Encrypted number: " + result);
    }
}
