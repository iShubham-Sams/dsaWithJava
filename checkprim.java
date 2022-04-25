import java.util.Scanner;

public class checkprim {
    public static void main(String[] args) {
        Scanner val=new Scanner(System.in);
        int div= val.nextInt();

        int i=2;
        boolean isPrime=true;
        while(i<=div-1){
            if(div%i==0){
                isPrime=false;
            }
            i=i+1;
        }
        if(isPrime){
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }
    }
}
