import java.util.Scanner;

public class InterestingAlphabate {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        int i=value.nextInt();

        int j=1;
        while(j<=i){
         char ch='A';
         int k=1;
         while(k<=j){
          System.out.print((char)(ch+i-k));
          k++;
         }


         System.out.println();
            j++;
        }
    }
    
}
