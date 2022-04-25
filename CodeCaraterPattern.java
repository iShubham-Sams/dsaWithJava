import java.util.Scanner;

public class CodeCaraterPattern {
    public static void main(String[] args) {
        Scanner value =new Scanner(System.in);
        int i=value.nextInt();

        int j=1;
        while(j<=i){
            int k=1;
         char ch='A';
         while(k<=j){
             System.out.print((char)(ch+k-1));
             k++;
         }

            System.out.println();
            j++;
        }
    }
    
}

