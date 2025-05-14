import java.util.Scanner;

public class sepret_two_integer_by_space {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of person :");
        int n=sc.nextInt();
        int array[]=new int[n*2];
        int max_h=0;
        int max_w=0;
        int max_h_i=0;
        int max_w_i=0;
        System.out.print("Element in the array");
        for(int i=0;i<n*2;i++){
            array[i]=sc.nextInt();
        }
        for(int i=0;i<n*2;i++){
            if(i%2==0){
                if(array[i]>max_h){
                    max_h=array[i];
                    max_h_= i;
                }
            }
            else{
                if(array[i]>max_w)
                {
                    max_h=array[i];
                    max_h_i=i;
                }
            }
        }
        System.out.println("maximum height:" +max_h);
        System.out.println(" the number the ");

    }
}



