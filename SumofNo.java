import java.util.Scanner;

public class SumofNo {
    public static void main(String[] args) {
        Scanner val =new Scanner(System.in);

        int n=val.nextInt();
        int i=1;
        int d=0;
        while(i<=n){
           
            d=d+i;
         System.out.println(d);
         i=i+1;
        }
    }
}
