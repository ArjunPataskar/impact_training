import java.util.Scanner;

public class firstnonreapetingelement {
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the string: ");
     String str = sc.nextLine();

      for (int i = 0; i < str.length(); i++) {
        char character = str.charAt(i);
        int a=i;
        if(a!=character){
          System.out.print(character);
        }
      }
    }
}
