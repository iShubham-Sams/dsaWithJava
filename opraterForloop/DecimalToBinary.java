import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner value =new Scanner(System.in);
        int n=value.nextInt();

       int num=n; int ans=0; int plasevalue=1;
        while(num>0){
       int remander=num%2;

       ans=ans+plasevalue*remander;
        num=num/2;
        plasevalue *=10;
        }

        System.out.println(ans);
    }
    
}
