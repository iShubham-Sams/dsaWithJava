import java.util.Scanner;

public class AllPrime {
    public static void main(String[] args) {
        Scanner value=new Scanner(System.in);
        int n=value.nextInt();


        for(int i=2;i<=n;i++){
            boolean Prime=true;

            for(int j=2;j<i;j++){
              if(i%j==0){
                  Prime=false;
                  break;
              }
            }
            if(Prime){
                System.out.println(i);
            }
        }
        
    
    
    
    }
    }