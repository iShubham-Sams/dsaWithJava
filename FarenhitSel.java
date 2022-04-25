import java.util.Scanner;

public class FarenhitSel {
    public static void main(String[] args) {
        Scanner val=new Scanner(System.in);
           int a=val.nextInt();
           int b=val.nextInt();
           int d=val.nextInt();
           while(a<=b){
            System.out.println(a);
             a=a+d;
             
           }
    }
    
}
