import java.util.Scanner;

public class RevarsOfNu {
    public static void main(String[] args) {
        Scanner value=new Scanner(System.in);
        int n=value.nextInt();

       int temp=n; int revers=0;
       while(temp>0){
           int lastno=temp%10;
           temp=temp/10;
           revers=revers*10+lastno;
       }
 
       System.out.println(revers);


    }
}
