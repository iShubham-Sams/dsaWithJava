import java.util.Scanner;

public class InvertedTrangle {
    public static void main(String[] args) {
        Scanner value =new Scanner(System.in);
        int i=value.nextInt();
        int j=0;
        while(j<i){

            int k=1;
            while(k<=i-j){
                System.out.print("*");
                k++;
            }
            System.out.println();
            j++;
        }
    }
    
}

