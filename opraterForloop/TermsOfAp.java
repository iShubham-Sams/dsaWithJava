import java.util.Scanner;

public class TermsOfAp {
    public static void main(String[] args) {
        Scanner value=new Scanner(System.in);
        int n=value.nextInt();

        
        int current=1;
        int v=1;
        while(v<=n){
            int divi=3*current+2;
            if(divi%4!=0){ 
                System.out.print(divi);
                v++;
            }
            current++;
                System.out.println();

        }
    }
}
