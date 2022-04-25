import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
        Scanner value =new Scanner(System.in);
        int length=value.nextInt();
       
        int arr[]=new int[length];

        for(int i=0;i<length;i++){
            arr[i]=value.nextInt();
        }

        for (int i=0;i<length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        int checkno=value.nextInt();
        for(int i=0;i<length;i++){
            if(checkno==arr[i]){
                System.out.println(i);
                return;
            }   
        }System.out.println(-1);
        }
    
}
