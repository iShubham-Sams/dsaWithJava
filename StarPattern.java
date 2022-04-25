import java.util.Scanner;

public class StarPattern {
    public static void main(String[] args) {
        Scanner value=new Scanner(System.in);
        int i=value.nextInt();

        int row=1;
        while(row<=i){

            int space=1;
            while(space<=i-row){
                System.out.print(" ");
                space++;
            }
            int star=1;
            while(star<=2*row-1){
                System.out.print("*");
                star++;
            }
            System.out.println();
            row++;
        }
    }
    
}
