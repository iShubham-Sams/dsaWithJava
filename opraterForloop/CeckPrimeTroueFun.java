import java.util.Scanner;

public class CeckPrimeTroueFun {
    
    public static boolean checkprim(int n){
        boolean prime=true;
        int i=2;
        while(i<n){
         if(n%i==0){
           prime=false;
           break;
         }
            i++;
        } return prime;
    }



    public static void main(String[] args) {
        Scanner value=new Scanner(System.in);
        int n=value.nextInt();

        boolean prim=checkprim(n);
        System.out.println(prim);
    }
}
