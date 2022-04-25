import java.util.Scanner;

public class parallelogram {
    public static void main(String[] args) {
        Scanner value=new Scanner(System.in);
        int i=value.nextInt();
        int j=1;
        while(j<=i){

         int k=1;
         while(k<j){
         System.out.print(" ");
         k++;
         }

         int m=1;
         while(m<=i){
             System.out.print("*");
             m++;
         }
         System.out.println();
            j++;
        }
    }
    
}
