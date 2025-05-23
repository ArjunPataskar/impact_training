import java.util.Scanner;

public class characternotpresent {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string value: ");
        String s=sc.nextLine();
        String sr=sc.nextLine();

        String result = getSuffixDifference(s, sr);
        System.out.println("Output: " + result);
    }

    public static String getSuffixDifference(String base, String extended) {
        if (extended.startsWith(base)) {
            return extended.substring(base.length());
        } else {
            return "";
        }
    }
}
