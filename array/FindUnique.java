import java.util.Scanner;

public class FindUnique {
    public static void main(String[] args) {
        Scanner value=new Scanner(System.in);
        int n=value.nextInt();

        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=value.nextInt();
        }

        
      for(int i=0;i<n;i++){
          for(int k=0;k<n;k++){
              if(i!=k){
              if(arr[i]==arr[k]){
                 break;
                
              }
          }
          
        }
       
    } 
 




        // for(int i=0;i<n;i++){
        //     System.out.print(arr[i]+" ");
        // }
    }
}
