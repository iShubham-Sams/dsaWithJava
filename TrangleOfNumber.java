import java.util.Scanner;

public class TrangleOfNumber {
    public static void main(String[] args) {
        Scanner value=new Scanner(System.in);
        int input=value.nextInt();

        int row=1;
        while(row<=input){
           int space=1;
           while(space<=input-row){
               System.out.print(" ");
               space++;
           }
           int show=row;
           while(show<=2*row-1){
               System.out.print(show);
               
               show++;
           }

           int decres=2*row-2;
           while(decres>=row){
               System.out.print(decres);
               decres--;
           }
        System.out.println();
            row++;
        }
    }
    
}
