import java.util.Scanner;

public class IsoscalsTrangle {
    public static void main(String[] args) {
        Scanner value=new Scanner(System.in);
        int i= value.nextInt();
        int j=1;
        while(j<=i){

            int space=1;
            while(space<=i-j){
                System.out.print(" ");
                space++;
            }

            int num=1;
            while(num<=j){
                System.out.print(num);
                num++;
            }
            int revars=j-1;
            while(revars>=1){
                System.out.print(revars);
                revars--;
            }
            System.out.println();

            

            j++;
        }
    }
    
}
