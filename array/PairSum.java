import java.util.Scanner;

public class PairSum {
    public static void main(String[] args) {
        Scanner value=new Scanner(System.in);
        int lenght=value.nextInt();
        int arr[]=new int[lenght];
          int sum=value.nextInt();

          for(int i=0;i<lenght;i++){
              arr[i]=value.nextInt();
          }
          int ans=0;
          for(int i=0;i<lenght;i++){
              for(int k=0;k<lenght;k++){
                  if(i!=k){
                   if(arr[i]+arr[k]==sum){
                      ans=ans+1;
                   }
                  }
              }
          }
          ans=ans/2;
       System.out.println(ans);
    }
}
