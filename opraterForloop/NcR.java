import java.util.Scanner;

public class NcR {
public static int Factorial(int n){
     int i=1;int ans=1;
     while(i<=n){
        ans =ans*i;
         i++;   
     }
     return ans;
}

    public static void main(String[] args) {
        Scanner value= new Scanner(System.in);
        int n=value.nextInt();
        int r=value.nextInt();


        int numi=Factorial(n);

        int deno1=Factorial(r);
        
        int deno2=Factorial(n-r);

        int nr=numi/(deno1*deno2);
        System.out.println(nr);
    }
}
