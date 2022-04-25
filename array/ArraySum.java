import java.util.Scanner;

public class ArraySum {


public static int[] arrayfunction(){
    Scanner value=new Scanner(System.in);
    int length= value.nextInt();
    int arr[]=new int[length];
    for(int i=0;i<length;i++){
      arr[i]=value.nextInt();
    }
    
    return arr;
}
public static void printarr(int array[]){
    int length=array.length;
    for (int i=0;i<length;i++){
        System.out.print(array[i]+" ");
    }
}


public static void printsum(int array[]){
    int sum=0; int length=array.length;
    for (int i=0;i<length;i++){
        sum=sum+array[i];
    }
    System.out.println(sum);
}
    public static void main(String[] args) {
       

        int array[]=arrayfunction();
       printarr(array);
       System.out.println();
       printsum(array);
    

        
    }
    
}
