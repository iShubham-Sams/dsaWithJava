import java.util.Scanner;

public class SumOrProduct {
    public static void main(String[] args) {
        Scanner value=new Scanner(System.in);
        int num=value.nextInt();
        int choic=value.nextInt();

        if (choic==1){
             int sum=0; int n=1;
             while(n<=num){
                 sum=sum+n;
                 n++;
             }
             System.out.println(sum);   
        }
        else if(choic==2){
            int mult=1; int no=1;
            while(no<=num){
                mult=mult*no;
                no++;
            }
            System.out.println(mult);
        }else{
            System.out.println("-1");
        }
    }
}
