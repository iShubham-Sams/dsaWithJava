import java.util.Scanner;

public class ArrangNoInArray {
    public static void main(String[] args) {
        Scanner value=new Scanner(System.in);
        int n=value.nextInt();


        int array[]=new int[n];
        int g=(n-1)/2;
        System.out.println(g);

            if(n%2==1){
                for(int k=1, p=0;p<=g;k+=2,p++){
                   array[p]=k;
                }
            }
            if(n%2==0){
                for(int k=1,p=0;p<=g;k+=2,p++){
                    array[p]=k;
                 }
            }


            if(n%2==1){
                for(int k=n-1, p=g+1;k>1;k-=2,p++){
                   array[p]=k;
                }
            }
            if(n%2==0){
                for(int k=n,p=g+1;k>1; k-=2,p++){
                    array[p]=k;
                 }
            }
            

        for(int i=0;i<=n;i++){
            System.out.print(array[i]+" ");
        }
    }
}
