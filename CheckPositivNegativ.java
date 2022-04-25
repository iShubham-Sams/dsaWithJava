import java.util.Scanner;

public class CheckPositivNegativ {
    public static void main(String[] arges) {
        int a,b;
        Scanner input= new Scanner(System.in);
        a=input.nextInt();
        b=input.nextInt();
        if(a>0 && b>0){
            System.out.println("both no is greater then 0 and positiv no");
        }else{
            System.out.println("both no is not positive no");
        }
        
    }
}
