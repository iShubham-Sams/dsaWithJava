import java.util.Scanner;

public class CodeTrangleStar {
    public static void main(String[] args) {
        Scanner value =new Scanner(System.in);
        int n =value.nextInt();

        int i=0;
        while(i<=n){
          int k=0;
          while(k<=i){
              System.out.print("*");
              k+=1;
          }
          System.out.println();
            i+=1;
        }
    }
}
