import java.util.Scanner;

public class ArrayIntersection {
    public static void main(String[] args) {
        Scanner value =new Scanner(System.in);
        int lenth1=value.nextInt();

        int arr1[]=new int[lenth1];
        for(int i=0;i<lenth1;i++){
            arr1[i]=value.nextInt();
        }



     int lenth2=value.nextInt();
     int arr2[]=new int[lenth2];
        for(int i=0;i<lenth2;i++){
            arr2[i]=value.nextInt();
        }

        
    // for(int i=0;i<lenth1;i++){
    //         System.out.print(arr1[i]);
    //     }
    //     System.out.println();

    //     for(int i=0;i<lenth2;i++){
    //         System.out.print(arr2[i]);
    //     }
   
System.out.println();
System.out.println();
if(lenth1<lenth2){
    for(int i=0;i<lenth1;i++){
        for (int k=0;k<lenth2;k++){
            if(arr1[i]==arr2[k]){
                System.out.println(arr1[i]);
            }
        }
    }

}else{
    for(int i=0;i<lenth2;i++){
        for(int k=0;k<lenth1;k++){
            if(arr2[i]==arr1[k]){
                System.out.println(arr2[i]);
            }
        }
    }
}


    }
}
