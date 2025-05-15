import java.util.Scanner;

public class addtwonum {
    public static void main(String[] args) {
       System.out.print("enter the first number :");
       Scanner sc=new Scanner(System.in);

       int a=sc.nextInt(); 
       int arr1[] = new int[a];
       for(int i=0;i<a;i++){
        arr1[i]=sc.nextInt();
       }
       System.out.print("Enter the second number :");
       int n=sc.nextInt();
       int arr2[] = new int[n];
       for(int i=0;i<n;i++){
        arr2[i]=sc.nextInt();
       }
    
       int arr3[] = new int[n];
       for(int i=0;i<n;i++){
       arr3[i] = arr1[i] + arr2[i];
       System.out.print(arr3[i]);
       }
       int carry=0;
       for(int i=0;i<=n-1;i--){
        

       }

    
    
    }
}