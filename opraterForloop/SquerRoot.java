import java.util.Scanner;

public class SquerRoot {
    public static void main(String[] args) {
        Scanner value=new Scanner(System.in);
        int n=value.nextInt();

        int i=1;
        while(i<n){
            if(n/i==i){
                System.out.println(i);
            }
            i++;
        }
        
    }
    
}
