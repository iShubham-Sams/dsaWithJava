import java.util.Scanner;

public class fibonacheNo {

    public static  boolean checkfibo(int n){
        int a=0;
        int b=1;
        int c; 
        while(a<n){
       c=a+b;
       a=b;
       b=c;
       if(a==n){
           return true;
       }else{
           return false;
       }
    } 
        }
    
    public static void main(String[] args) {
        Scanner value=new Scanner(System.in);
        int n=value.nextInt();

        boolean check=checkfibo(n);
        System.out.println(check);


    }
}

