import java.util.Scanner;

public class wordakshri
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String previous_ele = sc.nextLine();
        String current_ele = sc.nextLine();
        
        while(current_ele!="####")
        {
            if(previous_ele.charAt(previous_ele.length()-1)==current_ele.charAt(0))
            {
                System.out.println(current_ele);
                previous_ele=current_ele;
            }
            else
            {
                break;
            }
        } 
    }
}
