import java.util.Scanner;

public class binaryToDecimal {
    public static void main(String[] args) {
        Scanner value=new Scanner(System.in);
        int n=value.nextInt();

        int ans=0;  int placevalu=1; int loop=n; int i=1;
        while(loop>0){
         placevalu=loop%10;
         
           ans=ans+i*placevalu;

            i=i*2;
            loop=loop/10;
        }
       System.out.println(ans);


    }
}
