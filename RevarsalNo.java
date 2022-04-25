import java.util.Scanner;

public class RevarsalNo {
    public static void main(String[] args) {
        Scanner value= new Scanner(System.in);
        int i=value.nextInt();

        int g=1;
        while(g<=i){
            int n=g;
        while(n>=1){
            System.out.print(n);
            n-=1;
        }
        System.out.println();
        g+=1;
        }
    }
}
