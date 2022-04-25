import java.util.Scanner;

public class MirrorImage {
    public static void main(String[] args) {
        Scanner value=new Scanner(System.in);
        int i =value.nextInt();
        int j=1;
        while(j<=i){
         int k=1;
         while(k<=(i-j)){
           System.out.print(" ");
             k++;
         }
         int n=1;
         while(n<=j){
         System.out.print("*");
         n++;
         }
         System.out.println();

            j++;
        }


    }
    
}
