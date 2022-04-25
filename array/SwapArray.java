import java.util.Scanner;

public class SwapArray {
    public static void main(String[] args) {
        Scanner value=new Scanner(System.in);
        int n=value.nextInt();

        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=value.nextInt();
        }

        for(int i=0;i<n;i+=2){
            arr[i]=arr[i+1];
        }

        for(int i=0;i<=n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
