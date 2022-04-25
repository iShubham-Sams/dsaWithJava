import java.util.Scanner;

public class SquarePattern {
    public static void main(String[] args) {
        Scanner value=new Scanner(System.in);
        int n=value.nextInt();
        
        int  i=1;
        while(i<=n){
            int p=1;
            while(p<=n){
                System.out.print(n);
                p+=1;
            }
            System.out.println();
            i+=1;
        }
    }
}
