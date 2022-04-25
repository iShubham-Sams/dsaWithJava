import java.util.Scanner;

public class SumPattern {
    public static void main(String[] args) {
        Scanner value=new Scanner(System.in);
        int i=value.nextInt();
        int j=1;
        while(j<=i){

            int n=1;
            while(n<=j){
                int sum=0;
                System.out.print(n);
                if(n==j){
                    System.out.print("=");
                }else{System.out.print("+");}
                sum+=j;
                System.out.print(sum);
                n++;
            }
            System.out.println();
            j++;
        }
    }
}
